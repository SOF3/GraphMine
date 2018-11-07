package io.github.sof3.graphmine.util.math

import io.github.sof3.graphmine.util.mapDoubleArray
import io.github.sof3.graphmine.util.mapIntArray
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

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

inline class IntVector3(internal val values: IntArray) {
	constructor(x: Int, y: Int, z: Int) : this(intArrayOf(x, y, z))

	val x get() = values[0]
	val y get() = values[1]
	val z get() = values[2]

	fun toDouble() = Vector3(values.mapDoubleArray(Int::toDouble))

	fun copy() = IntVector3(values.clone())

	val lengthSquared get() = values.mapIntArray { it * it }.sum()
	val length get() = sqrt(lengthSquared.toDouble())

	val unit get() = toDouble() / length

	infix fun dot(v: IntVector3) = biMap(v) { a, b -> a * b }.values.sum()

	infix fun cross(v: IntVector3) = IntVector3(
			y * v.z - z * v.y,
			z * v.x - x * v.z,
			x * v.y - y * v.x
	)

	operator fun plus(that: IntVector3) = biMap(that) { a, b -> a + b }
	operator fun minus(that: IntVector3) = biMap(that) { a, b -> a + b }
	operator fun times(f: Int) = map { it * f }
	operator fun unaryPlus() = this
	operator fun unaryMinus() = map(Int::unaryMinus)
	fun abs(): IntVector3 = map(::abs)

	fun distanceSquared(that: IntVector3) = (this - that).lengthSquared
	infix fun distanceTo(that: IntVector3) = (this - that).length

	operator fun rangeTo(that: IntVector3) = IntVector3Range(biMap(that, ::min), biMap(that, ::max))

	fun side(side: Side) = this + side.intVector
	fun side(side: Side, steps: Int) = this + side.intVector * steps

	fun eachSide(fn: (IntVector3) -> Unit) = (0..5).forEach { fn(side(Side(it))) }

	private inline fun map(fn: (Int) -> Int) = IntVector3(values.mapIntArray(fn))

	private inline fun biMap(that: IntVector3, fn: (Int, Int) -> Int): IntVector3 {
		val new = IntArray(3)
		for (i in 0 until values.size) new[i] = fn(values[i], that.values[i])
		return IntVector3(new)
	}
}
