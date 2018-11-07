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


class IntVector3Range internal constructor(val min: IntVector3, val max: IntVector3) : Iterable<IntVector3> {
	enum class IterationOrder(val a: Int, val b: Int, val c: Int) {
		YXZ(1, 0, 2),
		XZY(0, 2, 1),
		YZX(1, 2, 0),
		ZXY(2, 0, 1),
	}

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

	override fun iterator() = with(IterationOrder.YXZ).iterator()
}
