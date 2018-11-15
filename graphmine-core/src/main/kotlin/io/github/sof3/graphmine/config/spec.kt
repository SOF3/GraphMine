package io.github.sof3.graphmine.config

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
 * Model for the server config.yml
 */
class CoreConfig(fn: CoreConfig.() -> Unit) : ConfigSpec() {
	var language by entry("en_US")

	val server by group(ServerConfig())

	init {
		apply(fn)
	}
}

class ServerConfig : ConfigGroupSpec<ServerConfig>() {
	var ip by entry("0.0.0.0")
	var port by entry(19132) { if (it !in 0..65535) "Port must be between 0 and 65535" else null }
}
