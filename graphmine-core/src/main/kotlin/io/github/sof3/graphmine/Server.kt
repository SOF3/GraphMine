package io.github.sof3.graphmine

import io.github.sof3.graphmine.config.Config
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

class ServerImpl(
		val config: Config
) : Server {
	override val logger = LogManager.getLogger(Server::class.java)!!

	init {
		logger.info("Starting server ${config.port}")
	}
}
