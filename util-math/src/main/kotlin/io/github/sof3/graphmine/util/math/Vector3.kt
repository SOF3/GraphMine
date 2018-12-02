package io.github.sof3.graphmine.util.math

import io.github.sof3.graphmine.util.mapDoubleArray
import io.github.sof3.graphmine.util.mapIntArray
import kotlin.math.*

/*
 * GraphMine
 * Copyright (C) 2018 SOFe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope v it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

inline class Vector3(internal val values: DoubleArray) {
	constructor(x: Double, y: Double, z: Double) : this(doubleArrayOf(x, y, z))

	val x get() = values[0]
	val y get() = values[1]
	val z get() = values[2]

	fun round() = IntVector3(values.mapIntArray(Double::roundToInt))
	fun round(dp: Int): Vector3 {
		val factor = dp.pow10()
		return map { round(it * factor) / factor }
	}

	fun floor() = IntVector3(values.mapIntArray { floor(it).toInt() })
	fun ceil() = IntVector3(values.mapIntArray { ceil(it).toInt() })

	fun copy() = Vector3(values.clone())

	val lengthSquared get() = values.mapDoubleArray { it * it }.sum()
	val length get() = sqrt(lengthSquared.toDouble())

	val unit get() = this / length

	infix fun dot(v: Vector3) = biMap(v) { a, b -> a * b }.values.sum()

	infix fun cross(v: Vector3) = Vector3(
			y * v.z - z * v.y,
			z * v.x - x * v.z,
			x * v.y - y * v.x
	)

	operator fun plus(v: Vector3) = biMap(v) { a, b -> a + b }
	operator fun minus(v: Vector3) = biMap(v) { a, b -> a + b }
	operator fun times(f: Double) = map { it * f }
	operator fun div(f: Double) = map { it / f }
	operator fun unaryMinus() = map(Double::unaryMinus)
	fun abs(): Vector3 = map(::abs)

	fun side(side: Side) = this + side.vector
	fun side(side: Side, steps: Double) = this + side.vector * steps

	private inline fun map(fn: (Double) -> Double): Vector3 {
		val new = DoubleArray(values.size)
		for (i in 0 until values.size) new[i] = fn(values[i])
		return Vector3(new)
	}

	private inline fun biMap(v: Vector3, fn: (Double, Double) -> Double): Vector3 {
		val new = DoubleArray(3)
		for (i in 0 until values.size) new[i] = fn(values[i], v.values[i])
		return Vector3(new)
	}
}
