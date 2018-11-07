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

inline class Side(val ord: Int) {
	companion object Sides{
		val DOWN get() = Side(0)
		val UP get() = Side(1)
		val NORTH get() = Side(2)
		val SOUTH get() = Side(3)
		val WEST get() = Side(4)
		val EAST get() = Side(5)

		val ALL = (0..5).map { Side(it) }
	}

	val intVector
		get() = when (ord) {
			0 -> IntVector3(0, -1, 0)
			1 -> IntVector3(0, 1, 0)
			2 -> IntVector3(0, 0, -1)
			3 -> IntVector3(0, 0, 1)
			4 -> IntVector3(-1, 0, 0)
			5 -> IntVector3(1, 0, 0)
			else -> DEADCODE
		}

	val vector
		get() = when (ord) {
			0 -> Vector3(0.0, -1.0, 0.0)
			1 -> Vector3(0.0, 1.0, 0.0)
			2 -> Vector3(0.0, 0.0, -1.0)
			3 -> Vector3(0.0, 0.0, 1.0)
			4 -> Vector3(-1.0, 0.0, 0.0)
			5 -> Vector3(1.0, 0.0, 0.0)
			else -> DEADCODE
		}

}
