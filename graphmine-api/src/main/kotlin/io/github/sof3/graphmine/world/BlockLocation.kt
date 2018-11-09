package io.github.sof3.graphmine.world

import io.github.sof3.graphmine.util.math.IntVector3

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
 * A unique identifier for an integer location.
 *
 * Out-of-bounds block locations are intentionally allowed, because normally out-of-bounds locations like negative
 * locations may be valid for certain world formats. While they are not valid for the client, the World implementation
 * is responsible for translating coordinates to something the client can see. This should not interfere with plugins'
 * ability to interpret the world in a sensible manner.
 */
data class BlockLocation(
		/**
		 * The positional vector of the location
		 */
		val vector: IntVector3,
		/**
		 * The world that the location is in
		 */
		val world: World
)
