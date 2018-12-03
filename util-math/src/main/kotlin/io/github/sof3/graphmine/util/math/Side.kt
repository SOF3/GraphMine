package io.github.sof3.graphmine.util.math

import io.github.sof3.graphmine.util.DEADCODE

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
 * Represents one of the 6 directions in a 3D space.
 *
 * @property id the ID of the direction
 */
class Side private constructor(val id: Int) {
	/**
	 * Contains the default sides
	 */
	companion object Sides {
		/** The DOWN side */
		val DOWN = Side(0)
		/** The UP side */
		val UP = Side(1)
		/** The NORTH side */
		val NORTH = Side(2)
		/** The SOUTH side */
		val SOUTH = Side(3)
		/** The WEST side */
		val WEST = Side(4)
		/** The EAST side */
		val EAST = Side(5)

		/** A list of all sides */
		val ALL = (0..5).map { Side(it) }

		/** Access a side by ID */
		operator fun get(id: Int) = ALL[id]
	}

	/**
	 * Expresses the side as an [IntVector3]
	 */
	val intVector = when (id) {
		0 -> IntVector3(0, -1, 0)
		1 -> IntVector3(0, 1, 0)
		2 -> IntVector3(0, 0, -1)
		3 -> IntVector3(0, 0, 1)
		4 -> IntVector3(-1, 0, 0)
		5 -> IntVector3(1, 0, 0)
		else -> DEADCODE
	}

	/**
	 * Expresses the side as a [Vector3]
	 */
	val vector = when (id) {
		0 -> Vector3(0.0, -1.0, 0.0)
		1 -> Vector3(0.0, 1.0, 0.0)
		2 -> Vector3(0.0, 0.0, -1.0)
		3 -> Vector3(0.0, 0.0, 1.0)
		4 -> Vector3(-1.0, 0.0, 0.0)
		5 -> Vector3(1.0, 0.0, 0.0)
		else -> DEADCODE
	}
}
