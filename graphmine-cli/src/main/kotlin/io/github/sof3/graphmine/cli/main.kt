package io.github.sof3.graphmine.cli

import io.github.sof3.graphmine.Server
import io.github.sof3.graphmine.VersionInfo
import io.github.sof3.graphmine.command.TerminalSignal
import io.github.sof3.graphmine.util.BooleanRef
import io.github.sof3.graphmine.util.KtsLoader
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Options
import org.apache.commons.io.IOUtils
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

lateinit var argv: Array<String>

/**
 * The main entry function for the CLI program.
 * @param args command-line arguments
 */
fun main(args: Array<String>) {
	argv = args
	val options = Options().apply {
		addOption("v", "version", false, "GraphMine version")
		addOption("h", "help", false, "Overload line description")
		addOption("c", "config", true, "Path to config.kts")
	}
	val cmd = DefaultParser().parse(options, args)

	if (cmd.hasOption("h")) {
		HelpFormatter().printHelp("graphmine", options)
		return
	}

	if (cmd.hasOption("v")) {
		println("GraphMine v${VersionInfo.VERSION}, built on ${DateFormat.getDateTimeInstance().format(VersionInfo.BUILD_DATE)}")
		return
	}

	println("Loading...")
	val initNano = System.nanoTime()

	val dataDir = File("data")
	if (!dataDir.exists()) dataDir.mkdirs()

	val configFile = File(cmd.getOptionValue("c", "data/config.kts"))
	if (!configFile.exists()) {
		val default = object {}.javaClass.classLoader.getResourceAsStream("config.kts")
		FileOutputStream(configFile).use { IOUtils.copy(default, it) }
	}

	val (signalFlux, shutdown) = createStdinFlux()

	val server = Server(
			dataDir = dataDir,
			config = KtsLoader.load(configFile),
			signalFlux = signalFlux,
			initNano = initNano
	)
	server.shutdownHandlers += shutdown
}

fun createStdinFlux(): Pair<Flux<TerminalSignal>, () -> Unit> {
	var closing by BooleanRef(false)

	val flux = Flux.create<TerminalSignal> { sink ->
		println("Starting stdin")

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
