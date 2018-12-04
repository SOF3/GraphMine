package io.github.sof3.graphmine.cli

import io.github.sof3.graphmine.Server
import io.github.sof3.graphmine.VersionInfo
import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.util.BooleanRef
import io.github.sof3.graphmine.util.KtsLoader
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Options
import org.apache.commons.io.IOUtils
import org.apache.logging.log4j.LogManager
import reactor.core.publisher.Flux
import reactor.core.scheduler.Schedulers
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.DateFormat

/*
 * GraphMine
 * Copyright (C) 2018 SOFe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

internal lateinit var options: Options
internal lateinit var cmd: CommandLine
internal val logger = LogManager.getLogger()!!

internal fun main(args: Array<String>) {
	options = Options().apply {
		addOption("v", "version", false, "GraphMine version")
		addOption("h", "help", false, "Overload line description")
		addOption("d", "data", true, "Path to data directory")
	}
	cmd = DefaultParser().parse(options, args)

	if (metaArgs()) return

	val initNano = System.nanoTime()

	logger.debug("Setting up data directory...")
	val (dataDir, config) = setupDataDir()

	val server = Server(
			dataDir = dataDir,
			config = config,
			initNano = initNano
	)

	logger.debug("Initializing stdin")
	val (signalFlux, shutdown) = createStdinFlux()
	signalFlux.subscribe {
		when (it) {
			is TerminalSignal.Cmd -> {
				val name = it.line.substringBefore(" ")
				server.commandMap.dispatch(it.line, ConsoleSender, ConsoleReceiver("Command:$name", server.locale))
			}
			TerminalSignal.Eod -> server.shutdown()
			TerminalSignal.Int -> server.shutdown()
		}
	}
	server.shutdownHandlers += shutdown
}

private fun metaArgs() = when {
	cmd.hasOption("h") -> {
		HelpFormatter().printHelp("graphmine", options)
		true
	}
	cmd.hasOption("v") -> {
		println("GraphMine v${VersionInfo.VERSION}, built on ${DateFormat.getDateTimeInstance().format(VersionInfo.BUILD_DATE)}")
		true
	}
	else -> false
}

private fun setupDataDir(): Pair<File, CoreConfig> {
	val dataDir = File(cmd.getOptionValue("data", "data"))
	if (!dataDir.exists()) dataDir.mkdirs()

	val configFile = File(dataDir, "config.kts")
	if (!configFile.exists()) {
		logger.debug("Copying default config.kts")
		val default = object {}.javaClass.classLoader.getResourceAsStream("config.kts")
		FileOutputStream(configFile).use { IOUtils.copy(default, it) }
	}

	logger.debug("Loading CoreConfig classes")
	CoreConfig {}
	logger.debug("Loading config.kts")
	val config = KtsLoader.load<CoreConfig>(configFile)
	logger.debug("Loaded config.kts")
	return dataDir to config
}

private fun createStdinFlux(): Pair<Flux<TerminalSignal>, () -> Unit> {
	var closing by BooleanRef(false)

	val flux = Flux.create<TerminalSignal> { sink ->
		Runtime.getRuntime().addShutdownHook(Thread { sink.next(TerminalSignal.Int) })

		try {
			while (!closing) {
				val line = readLine() ?: break
				sink.next(TerminalSignal.Cmd(line))
			}
		} catch (e: IOException) {
		}
		if (!closing) sink.next(TerminalSignal.Eod)
	}.subscribeOn(Schedulers.newSingle("stdin"))

	return Pair(flux) {
		System.`in`.close()
		closing = true
	}
}
