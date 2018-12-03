package io.github.sof3.graphmine.util.math

import io.github.sof3.graphmine.util.mapDoubleArray
import io.github.sof3.graphmine.util.mapIntArray
import kotlin.Double.Companion.NEGATIVE_INFINITY
import kotlin.Double.Companion.POSITIVE_INFINITY
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

/**
 * A 3-dimensional vector in floating point precision. Intended to store non-aligned positions, e.g. entity positions.
 *
 * The class is a value class. Values in this class cannot be changed. Therefore, no copy method is present.
 */
inline class Vector3(internal val values: DoubleArray) {
	/**
	 * This object caches some common instances for efficient reuse
	 */
	companion object Common {
		/** A zero vector */
		val ZERO = Vector3(0.0, 0.0, 0.0)
		/** A unit vector in the direction of *x* (east) */
		val UNIT_X = Vector3(1.0, 0.0, 0.0)
		/** A unit vector in the direction of *y* (up) */
		val UNIT_Y = Vector3(0.0, 1.0, 0.0)
		/** A unit vector in the direction of *z* (south) */
		val UNIT_Z = Vector3(0.0, 0.0, 1.0)
		/** A unit vector in the direction of *-x* (west) */
		val UNIT_X_NEG = Vector3(-1.0, 0.0, 0.0)
		/** A unit vector in the direction of *-y* (down) */
		val UNIT_Y_NEG = Vector3(0.0, -1.0, 0.0)
		/** A unit vector in the direction of *-z* (north) */
		val UNIT_Z_NEG = Vector3(0.0, 0.0, -1.0)
		/** A vector pointing to the infinity in the (+,+,+) octant */
		val INF = Vector3(POSITIVE_INFINITY, POSITIVE_INFINITY, POSITIVE_INFINITY)
		/** A vector pointing to the infinity in the (-,-,-) octant */
		val INF_NEG = Vector3(NEGATIVE_INFINITY, NEGATIVE_INFINITY, NEGATIVE_INFINITY)
	}

	/**
	 * Constructs a [Vector3] by specifying all coordinates
	 */
	constructor(x: Double, y: Double, z: Double) : this(doubleArrayOf(x, y, z))

	/** The *x*-component value */
	val x get() = values[0]
	/** The *y*-component value, which is orthogonal to *x* */
	val y get() = values[1]
	/** The *z*-component value, which is in the direction of *x*&times;*y* */
	val z get() = values[2]

	/**
	 * Rounds this vector to an [IntVector3]
	 */
	fun round() = IntVector3(values.mapIntArray(Double::roundToInt))

	/**
	 * Rounds this vector to [dp] decimal places
	 */
	fun round(dp: Int): Vector3 {
		val factor = dp.pow10()
		return map { round(it * factor) / factor }
	}

	/**
	 * Rounds down this vector to an [IntVector3]
	 */
	fun floor() = IntVector3(values.mapIntArray { floor(it).toInt() })

	/**
	 * Rounds up this vector to an [IntVector3]
	 */
	fun ceil() = IntVector3(values.mapIntArray { ceil(it).toInt() })

	/**
	 * Calculates the squared length of this vector
	 */
	val lengthSquared get() = values.mapDoubleArray { it * it }.sum()
	/**
	 * Calculates the length (a.k.a. norm or modulus) of this vector.
	 *
	 * Use [lengthSquared] if only comparison is needed for less computation.
	 */
	val length get() = sqrt(lengthSquared.toDouble())

	/**
	 * @return a unit vector (length = 1) in the same direction as this vector
	 */
	val unit get() = this / length

	/**
	 * Calculates the dot product of `this` and [v]
	 */
	infix fun dot(v: Vector3) = biMap(v) { a, b -> a * b }.values.sum()

	/**
	 * Calculates the cross product of `this` and [v]
	 */
	infix fun cross(v: Vector3) = Vector3(
			y * v.z - z * v.y,
			z * v.x - x * v.z,
			x * v.y - y * v.x
	)

	/** Calculates `this` + [that] */
	operator fun plus(that: Vector3) = biMap(that) { a, b -> a + b }

	/** Calculates `this` - [that] */
	operator fun minus(that: Vector3) = biMap(that) { a, b -> a + b }

	/** Multiplies the components of `this` by [scalar] */
	operator fun times(scalar: Double) = map { it * scalar }

	/**
	 * Divides the components of `this` by [scalar]
	 *
	 * @throws ArithmeticException if [scalar] is zero
	 */
	operator fun div(scalar: Double) = map { it / scalar }

	/** @return this vector */
	operator fun unaryPlus() = this

	/** @return this vector in the opposite direction and same length */
	operator fun unaryMinus() = map(Double::unaryMinus)

	/** @return this vector with all components flipped if negative */
	fun abs(): Vector3 = map(::abs)

	/**
	 * Calculates the squared distance between `this` and [that]
	 */
	fun distanceSquared(that: Vector3) = (this - that).lengthSquared

	/**
	 * Calculates the distance between `this` and [that].
	 *
	 * Use [distanceSquared] if only comparison is needed for less computation.
	 */
	infix fun distanceTo(that: Vector3) = (this - that).length

	/** @return this vector moved towards the side [side] by one unit */
	fun side(side: Side) = this + side.vector
	/** @return this vector moved towards the side [side] by [steps] units */
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
