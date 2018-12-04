package io.github.sof3.graphmine

import io.github.sof3.graphmine.command.CommandMap
import io.github.sof3.graphmine.command.TerminalSignal
import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.scope.BaseScope
import io.github.sof3.graphmine.scope.Scope
import org.apache.logging.log4j.LogManager
import reactor.core.publisher.Flux
import java.io.File

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

/**
 * The Server should be the object that links up different components of the server.
 *
 * To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.
 *
 * @property dataDir the server data directory
 * @property config the server config
 * @property signalFlux a [Flux] providing terminal signals
 * @param initNano System.nanoTime() when the server start command was created
 * @param scope internal value, do not override
 */
class Server(
		val dataDir: File,
		val config: CoreConfig,
		val signalFlux: Flux<TerminalSignal>,

		initNano: Long = System.nanoTime(),

		private val scope: BaseScope = BaseScope(Server::class)
) : Scope by scope, HasLogger {
	init {
		config.checkAll()
		loadCoreLang()
	}

	/**
	 * the logger used for the server scope. Plugins should use their own logger instead of this one.
	 */
	override val logger = LogManager.getLogger(Server::class.java)!!
	/**
	 * the default locale of the server.
	 */
	override val locale get() = config.language

	init {
		info(CoreLang.startup.version(CoreLang.Startup.VersionArg(version = VersionInfo.VERSION, ip = config.server.ip, port = config.server.port)))
	}


	/**
	 * List of [Runnable]s that are called when the server shuts down
	 */
	val shutdownHandlers = mutableListOf<() -> Unit>().apply {
		this += scope::dispose
	}


	/**
	 * Stores the list of server-wide commands
	 */
	val commandMap = CommandMap()

	init {
		signalFlux.subscribe { handleSignal(it) }
	}

	/**
	 * Handles a terminal signal
	 */
	fun handleSignal(signal: TerminalSignal): Unit = when (signal) {
		is TerminalSignal.Cmd -> TODO()
		TerminalSignal.Eod -> TODO()
		TerminalSignal.Int -> TODO()
		else -> TODO()
	}


	init {
		info(CoreLang.startup.complete(CoreLang.Startup.CompleteArg(nano = System.nanoTime() - initNano)))
	}

	fun shutdown() {
		shutdownHandlers.forEach { it() }
	}
}
