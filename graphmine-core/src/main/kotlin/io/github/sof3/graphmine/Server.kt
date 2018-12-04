package io.github.sof3.graphmine

import io.github.sof3.graphmine.command.CommandMap
import io.github.sof3.graphmine.command.impl.VersionCommand
import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.i18n.core.CoreLang.Startup.LockedArg
import io.github.sof3.graphmine.scope.BaseScope
import io.github.sof3.graphmine.scope.Scope
import org.apache.logging.log4j.LogManager
import java.io.File
import java.io.RandomAccessFile
import java.nio.channels.FileLock

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
 * @param initNano System.nanoTime() when the server start command was created
 * @param scope internal value, do not override
 */
class Server(
		val dataDir: File,
		val config: CoreConfig,

		initNano: Long = System.nanoTime(),

		private val scope: BaseScope = BaseScope(Server::class)
) : Scope by scope, HasLogger {
	/**
	 * the logger used for the server scope. Plugins should use their own logger instead of this one.
	 */
	override val logger = LogManager.getLogger()!!
	/**
	 * the default locale of the server.
	 */
	override val locale get() = config.language

	init {
		logger.debug("Checking config")
		config.checkAll()
		logger.debug("Loading en_US.lang.kts")
		loadCoreLang()
		logger.debug("Loaded en_US.lang.kts")

		lockDataDir()
		info(CoreLang.startup.version(CoreLang.Startup.VersionArg(version = VersionInfo.VERSION, ip = config.server.ip, port = config.server.port)))
	}

	private fun lockDataDir() {
		val file = File(dataDir, "server.lock")
		val ra = RandomAccessFile(file, "rw")
		val lock: FileLock? = ra.channel.tryLock()
		if (lock == null) {
			fatal(CoreLang.startup.locked(LockedArg(file)))
			throw RuntimeException("Server is already running")
		}
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
	val commandMap = CommandMap().apply {
		// default commands
		addCommand(VersionCommand, this@Server)
	}


	init {
		info(CoreLang.startup.complete(CoreLang.Startup.CompleteArg(nano = System.nanoTime() - initNano)))
	}

	fun shutdown() {
		shutdownHandlers.forEach { it() }
	}
}
