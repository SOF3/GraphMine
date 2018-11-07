package io.github.sof3.graphmine.util

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

class Ref<T>(var value: T) {
	operator fun getValue(t: Any, p: KProperty<*>): T = value
	operator fun setValue(t: Any, p: KProperty<*>, v: T) {
		value = v
	}
}

class ByteRef(var value: Byte) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Byte) {
		value = v
	}
}

class CharRef(var value: Char) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Char) {
		value = v
	}
}

class ShortRef(var value: Short) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Short) {
		value = v
	}
}

class IntRef(var value: Int) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Int) {
		value = v
	}
}

class LongRef(var value: Long) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Long) {
		value = v
	}
}

class FloatRef(var value: Float) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Float) {
		value = v
	}
}

class DoubleRef(var value: Double) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Double) {
		value = v
	}
}

class BooleanRef(var value: Boolean) {
	operator fun getValue(t: Any, p: KProperty<*>) = value
	operator fun setValue(t: Any, p: KProperty<*>, v: Boolean) {
		value = v
	}
}
