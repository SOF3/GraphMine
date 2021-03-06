package io.github.sof3.graphmine.util

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class Ref<T>(var value: T) : ReadWriteProperty<Any?, T>, ReadOnlyProperty<Any?, T> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class ByteRef(var value: Byte) : ReadWriteProperty<Any?, Byte>, ReadOnlyProperty<Any?, Byte> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Byte) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class CharRef(var value: Char) : ReadWriteProperty<Any?, Char>, ReadOnlyProperty<Any?, Char> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Char) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class ShortRef(var value: Short) : ReadWriteProperty<Any?, Short>, ReadOnlyProperty<Any?, Short> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Short) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class IntRef(var value: Int) : ReadWriteProperty<Any?, Int>, ReadOnlyProperty<Any?, Int> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class LongRef(var value: Long) : ReadWriteProperty<Any?, Long>, ReadOnlyProperty<Any?, Long> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class FloatRef(var value: Float) : ReadWriteProperty<Any?, Float>, ReadOnlyProperty<Any?, Float> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Float) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class DoubleRef(var value: Double) : ReadWriteProperty<Any?, Double>, ReadOnlyProperty<Any?, Double> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
		this.value = value
	}
}

/**
 * Useful for passing by reference or as return value in delegation providers [DelegateProvider] and
 * [VarDelegateProvider]
 * @property value the backing value
 */
class BooleanRef(var value: Boolean) : ReadWriteProperty<Any?, Boolean>, ReadOnlyProperty<Any?, Boolean> {
	/** Used for delegation to the backing [value] */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = value

	/** Used for delegation to the backing [value] */
	override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Boolean) {
		this.value = value
	}
}
