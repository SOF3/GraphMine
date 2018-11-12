package io.github.sof3.graphmine.impl

import io.github.sof3.graphmine.Server
import io.github.sof3.graphmine.VersionInfo
import io.github.sof3.graphmine.config.CoreConfig
import io.github.sof3.graphmine.i18n.core.CoreLang.Startup.VersionArg
import io.github.sof3.graphmine.i18n.core.CoreLangLoader.loadCoreLang
import io.github.sof3.graphmine.impl.feature.FeatureGraph
import io.github.sof3.graphmine.scope.BaseScope
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

class Server(
		override val config: CoreConfig
) : Server {
	override val logger = LogManager.getLogger(Server::class.java)!!
	override val lang = loadCoreLang()
	override val defaultLocale = config.language
	private val myScope = BaseScope(Server::class)
	override val scope by myScope
	override val features = FeatureGraph()

	init {
		logger.info(lang.startup.version.i18n(VersionArg(version = VersionInfo.VERSION, ip = config.server.ip, port = config.server.port))[defaultLocale])
	}

	fun shutdown() {
		// finally...
		myScope.dispose()
	}
}
