package io.github.sof3.graphmine

import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.scope.BaseScope
import io.github.sof3.graphmine.scope.Scope
import org.apache.logging.log4j.LogManager

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
 * @property config the server config
 * @param initNano System.nanoTime() when the server start command was created
 * @param myScope internal value, do not override
 */
class Server(
		/**
		 * @return the server config
		 */
		val config: CoreConfig,
		initNano: Long = System.nanoTime(),

		private val myScope: BaseScope = BaseScope(Server::class)
) : Scope by myScope, HasLogger {
	/**
	 * the logger used for the server scope. Plugins should use their own logger instead of this one.
	 */
	override val logger = LogManager.getLogger(Server::class.java)!!

	/**
	 * the default locale of the server.
	 */
	override val locale get() = config.language

	init {
		config.checkAll()

		loadCoreLang()

		info(CoreLang.startup.version(CoreLang.Startup.VersionArg(version = VersionInfo.VERSION, ip = config.server.ip, port = config.server.port)))

		info(CoreLang.startup.complete(CoreLang.Startup.CompleteArg(nano = System.nanoTime() - initNano)))


	}
}
