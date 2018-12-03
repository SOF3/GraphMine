package io.github.sof3.graphmine.util.math

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
 * A unit-aligned cuboid region in the 3D space.
 *
 * In integer-aligned space, this is a closed range [[min], [max]] such that the region joined with another region at
 * [max] + 1 on any axis will be fully continuous.
 *
 * In non-integer-aligned space, this is a semi-open range [[min], [max] + 1) such that the same rule applies. It can be
 * thought as the vector at `(x, y, z)` covering the range `([x, x + 1), [y, y + 1), [z, z + 1))`.
 *
 * @property min the minimum possible point in the region
 * @property max the maximum possible point in the region
 */
class IntVector3Range internal constructor(val min: IntVector3, val max: IntVector3) : Iterable<IntVector3> {
	/**
	 * Specifies the iteration order.
	 * @property a the first axis to iterate over (increments when [b] resets, stops iteration after reaching [max])
	 * @property b the second axis to iterate over (increments when [c] resets, resets after reaching [max])
	 * @property c the third axis to iterate over (increments every time, resets after reaching [max])
	 */
	enum class IterationOrder(val a: Int, val b: Int, val c: Int) {
		/** Iterate bottom-up, for each column from west to east, yields from north to south */
		YXZ(1, 0, 2),
		/** Iterate from west to east, for each row from north to south, yields bottom-up */
		XZY(0, 2, 1),
		/** Iterate bottom-up, for each column from north to south, yields from west to east */
		YZX(1, 2, 0),
		/** Iterate from morth to south, for each row from west to east, yields bottom-up */
		ZXY(2, 0, 1),
	}

	/**
	 * Specifies the iteration order before using as an iterable.
	 *
	 * Example ues: `for(vector in range with IterationOrder.ZXY) { ... }`
	 */
	infix fun with(order: IterationOrder) = object : Iterable<IntVector3> {
		override fun iterator(): Iterator<IntVector3> = kotlin.sequences.iterator {
			for (a in min.values[order.a]..max.values[order.a]) {
				for (b in min.values[order.b]..max.values[order.b]) {
					for (c in min.values[order.c]..max.values[order.c]) {
						val array = intArrayOf(3, 3, 3)
						array[order.a] = a
						array[order.b] = b
						array[order.c] = c
					}
				}
			}
		}
	}

	/**
	 * Iterates over every integer-aligned point in this range.
	 */
	override fun iterator() = with(IterationOrder.YXZ).iterator()

	/**
	 * Checks if a vector is inside the range in integer-aligned space.
	 */
	operator fun contains(vector: IntVector3) = (0..2).all { vector.values[it] in min.values[it]..max.values[it] }

	/**
	 * Checks if a vector is inside the range in non-integer-aligned space.
	 *
	 * See the [IntVector3Range] definition of the range in non-integer-aligned space.
	 */
	operator fun contains(vector: Vector3) = (0..2).all {
		vector.values[it] >= min.values[it].toDouble() &&
				vector.values[it] < max.values[it].toDouble() + 1.0
	}
}
