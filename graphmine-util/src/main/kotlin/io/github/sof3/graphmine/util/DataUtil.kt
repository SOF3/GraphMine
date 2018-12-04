package io.github.sof3.graphmine.util

import java.io.DataInputStream
import java.io.DataOutputStream

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

fun DataInputStream.readString(): String {
	val length = readInt()
	val buf = ByteArray(length)
	read(buf)
	return String(buf)
}

fun DataOutputStream.writeString(string: String) {
	val buf = string.toByteArray()
	writeInt(buf.size)
	write(buf)
}

inline fun <K, V> DataInputStream.readMap(keyFn: (DataInputStream) -> K, valueFn: (DataInputStream) -> V) = readMap(mutableMapOf(), keyFn, valueFn)
inline fun <K, V> DataInputStream.readMap(map: MutableMap<K, V>, keyFn: (DataInputStream) -> K, valueFn: (DataInputStream) -> V): MutableMap<K, V> {
	val size = readInt()
	repeat(size) {
		val key = keyFn(this)
		val value = valueFn(this)
		map[key] = value
	}
	return map
}

inline fun <K, V> DataOutputStream.writeMap(map: MutableMap<K, V>, keyFn: (DataOutputStream, K) -> Unit, valueFn: (DataOutputStream, V) -> Unit): MutableMap<K, V> {
	writeInt(map.size)
	for ((k, v) in map) {
		keyFn(this, k)
		valueFn(this, v)
	}
	return map
}
