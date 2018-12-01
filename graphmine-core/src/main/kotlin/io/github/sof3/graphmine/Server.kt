package io.github.sof3.graphmine

import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.feature.FeatureGraph
import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.scope.BaseScope
import io.github.sof3.graphmine.scope.Scope
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

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
 * @param initNano System.nanoTime() when the server start command was created
 */
class Server(
		/**
		 * @return the server config
		 */
		val config: CoreConfig,
		initNano: Long = System.nanoTime()
) {
	/**
	 * @return the logger used for the server scope. Plugins should use their own logger instead of this one.
	 */
	val logger: Logger = LogManager.getLogger(Server::class.java)!!

	/**
	 * @return the default locale of the server.
	 */
	val defaultLocale: String get() = config.language

	private val myScope = BaseScope(Server::class)
	/**
	 * @return the server scope, which only gets disposed when the server shuts down.
	 */
	val scope: Scope by myScope // TODO dispose on shutdown

	/**
	 * @return the feature graph of the server. "Events" should be handled via the feature graph.
	 */
	val features = FeatureGraph()

	init {
		loadCoreLang()

		info(CoreLang.startup.version(CoreLang.Startup.VersionArg(version = VersionInfo.VERSION, ip = config.server.ip, port = config.server.port)))

		info(CoreLang.startup.complete(CoreLang.Startup.CompleteArg(nano = System.nanoTime() - initNano)))
	}

	private fun debug(i18n: I18n) = logger.debug(i18n[defaultLocale])
	private fun error(i18n: I18n) = logger.error(i18n[defaultLocale])
	private fun fatal(i18n: I18n) = logger.fatal(i18n[defaultLocale])
	private fun info(i18n: I18n) = logger.info(i18n[defaultLocale])
	private fun warn(i18n: I18n) = logger.warn(i18n[defaultLocale])
}
