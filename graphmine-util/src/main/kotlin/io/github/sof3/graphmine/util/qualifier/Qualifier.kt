package io.github.sof3.graphmine.util.qualifier

import io.github.sof3.graphmine.util.get

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
 * Represents a qualified identifier.
 *
 * @param string the dot-delimited qualified identifier
 */
class Qualifier(string: String) {
	/**
	 * The string parts of the qualifier
	 */
	val parts = string.split(".")

	/**
	 * The last part of the qualifier, which is also the most frequently used one
	 */
	val simple get() = parts.last()

	/**
	 * Executes [fn] on each possible representation of this qualifier
	 */
	inline fun forEachPermutation(fn: (List<String>) -> Unit) {
		for (i in 0 until parts.size) {
			fn(parts[i, parts.size])
		}
	}

	/**
	 * Returns the dot-delimited representation of the qualifier
	 */
	override fun toString() = parts.joinToString(".")

	private val hashCode by lazy { parts.map(String::hashCode).reduce { a, b -> a * 31 + b } }
	/**
	 * Returns the lazily-evaluated hash code of the qualifier only based on the contents of [parts]
	 */
	override fun hashCode() = hashCode

	/**
	 * Checks if two identifiers are fully equal based on the contents of [parts]
	 */
	override fun equals(other: Any?) = other is Qualifier && parts == other.parts
}

/**
 * Converts a dot-delimited string to a qualifier
 *
 * @receiver a dot-delimited string
 */
fun String.qualify() = Qualifier(this)
