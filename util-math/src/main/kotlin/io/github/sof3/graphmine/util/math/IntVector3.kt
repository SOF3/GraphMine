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

/**
 * A 3-dimensional vector in integers. Intended to store aligned positions e.g. block positions.
 *
 * The class is a value class. Values in this class cannot be changed. Therefore, no copy method is present.
 */
inline class IntVector3(internal val values: IntArray) {
	/**
	 * This object caches some common instances for efficient reuse
	 */
	companion object Common {
		/** A zero vector */
		val ZERO = IntVector3(0, 0, 0)
		/** A unit vector in the direction of *x* (east) */
		val UNIT_X = IntVector3(1, 0, 0)
		/** A unit vector in the direction of *-x* (west) */
		val UNIT_X_NEG = IntVector3(-1, 0, 0)
		/** A unit vector in the direction of *y* (up) */
		val UNIT_Y = IntVector3(0, 1, 0)
		/** A unit vector in the direction of *-y* (up) */
		val UNIT_Y_NEG = IntVector3(0, -1, 0)
		/** A unit vector in the direction of *z* (south) */
		val UNIT_Z = IntVector3(0, 0, 1)
		/** A unit vector in the direction of *-z* (north) */
		val UNIT_Z_NEG = IntVector3(0, 0, -1)
	}

	/**
	 * Consrtucts a [Vector3] by specifying all coordinates
	 */
	constructor(x: Int, y: Int, z: Int) : this(intArrayOf(x, y, z))

	/** The *x*-component value */
	val x get() = values[0]
	/** The *y*-component value, which is orthogonal to *x* */
	val y get() = values[1]
	/** The *z*-component value, which is in the direction of *x*&times;*y* */
	val z get() = values[2]

	/**
	 * Converts to a [Vector3] with approximately equivalent positions
	 */
	fun toDouble() = Vector3(values.mapDoubleArray(Int::toDouble))

	/**
	 * Calculates the squared length of this vector
	 */
	val lengthSquared get() = values.mapIntArray { it * it }.sum()
	/**
	 * Calculates the length (a.k.a. norm or modulus) of this vector.
	 *
	 * Use [lengthSquared] if only comparison is needed for less computation.
	 */
	val length get() = sqrt(lengthSquared.toDouble())

	/**
	 * @return a unit vector (length = 1) in the same direction as this vector
	 */
	val unit get() = if (lengthSquared == 0) Vector3.ZERO else toDouble() / length

	/**
	 * Calculates the dot product of `this` and [v]
	 */
	infix fun dot(v: IntVector3) = biMap(v) { a, b -> a * b }.values.sum()

	/**
	 * Calculates the cross product of `this` and [v]
	 */
	infix fun cross(v: IntVector3) = IntVector3(
			y * v.z - z * v.y,
			z * v.x - x * v.z,
			x * v.y - y * v.x
	)

	/** Calculates `this` + [that]*/
	operator fun plus(that: IntVector3) = biMap(that) { a, b -> a + b }

	/** Calculates `this` - [that] */
	operator fun minus(that: IntVector3) = biMap(that) { a, b -> a + b }

	/**
	 * Multiplies the components of `this` by [scalar]
	 *
	 * Use `this.toDouble() * scalar` if [scalar] is a double.
	 *
	 * Use `this.toDouble() / scalar` if division is intended.
	 */
	operator fun times(scalar: Int) = map { it * scalar }

	/** @return this vector */
	operator fun unaryPlus() = this

	/** @return this vector in the opposite direction and same length */
	operator fun unaryMinus() = map(Int::unaryMinus)

	/** @return this vector with all components flipped if negative */
	fun abs(): IntVector3 = map(::abs)

	/**
	 * Calculates the squared distance between `this` and [that]
	 */
	fun distanceSquared(that: IntVector3) = (this - that).lengthSquared

	/**
	 * Calculates the distance between `this` and [that].
	 *
	 * Use [distanceSquared] if only comparison is needed for less computation.
	 */
	infix fun distanceTo(that: IntVector3) = (this - that).length

	/**
	 * Returns the minimum [IntVector3Range] that inclusively contains both `this` and [that]
	 */
	operator fun rangeTo(that: IntVector3) = IntVector3Range(biMap(that, ::min), biMap(that, ::max))

	/** @return the neighbour of `this` on the side [side] */
	fun side(side: Side) = this + side.intVector

	/** @return `this` moved towards [side] by [steps] steps */
	fun side(side: Side, steps: Int) = this + side.intVector * steps

	/** @return executes [fn] on each of the 6 neighbours of `this` */
	fun eachSide(fn: (IntVector3) -> Unit) = Side.ALL.forEach { fn(side(it)) }

	internal inline fun map(fn: (Int) -> Int) = IntVector3(values.mapIntArray(fn))

	internal inline fun biMap(that: IntVector3, fn: (Int, Int) -> Int): IntVector3 {
		val new = IntArray(3)
		for (i in 0 until values.size) new[i] = fn(values[i], that.values[i])
		return IntVector3(new)
	}
}
