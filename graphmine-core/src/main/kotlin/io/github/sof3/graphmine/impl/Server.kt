package io.github.sof3.graphmine.impl

import io.github.sof3.graphmine.Server
import io.github.sof3.graphmine.VersionInfo
import io.github.sof3.graphmine.config.Config
import io.github.sof3.graphmine.BaseScope
import io.github.sof3.graphmine.impl.feature.FeatureGraph
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
		override val config: Config
) : Server {
	override val logger = LogManager.getLogger(Server::class.java)!!
	private val myScope = BaseScope()
	override val scope by myScope
	override val features = FeatureGraph()

	init {
		logger.info("Starting GraphMine v${VersionInfo.VERSION} on ${config.port}")
	}

	fun shutdown(){
		// finally...
		myScope.dispose()
	}
}
