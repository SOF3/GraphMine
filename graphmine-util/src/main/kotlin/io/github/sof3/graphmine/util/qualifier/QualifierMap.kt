package io.github.sof3.graphmine.util.qualifier

import java.util.*

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
 * A thread-safe store for qualified entries allowing search by qualified name
 */
class QualifierMap<T> {
	private val map = hashMapOf<String, MutableMap<Qualifier, T>>()

	/**
	 * Adds a qualified entry to the map
	 * @param qualifier the qualified name
	 * @param value the value to add
	 */
	operator fun set(qualifier: Qualifier, value: T) {
		qualifier.forEachPermutation { slice ->
			val key = slice.joinToString(".")
			lateinit var map: MutableMap<Qualifier, T>
			synchronized(this.map) {
				if (key !in this.map) this.map[key] = hashMapOf()
				map = this.map[key]!!
			}
			synchronized(map) { map[qualifier] = value }
		}
	}

	/**
	 * Gets an entry using a qualified key
	 * @param key any qualified key
	 */
	operator fun get(key: String): T? {
		val map = synchronized(map) { map[key] } ?: return null
		val clone: Map<Qualifier, T> = synchronized(map){
			if(map.size == 1) return map.iterator().next().value
			Collections.unmodifiableMap(map)
		}
		throw QualifierClashException(clone)
	}
}
