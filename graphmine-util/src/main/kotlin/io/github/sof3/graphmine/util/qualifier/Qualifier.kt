package io.github.sof3.graphmine.util.qualifier

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
	val parts = string.split(".")

	val simple get() = parts.last()

	val permutations = (0 until parts.size).map { parts.subList(it, parts.size) }

	override fun toString() = parts.joinToString(".")

	private val hashCode by lazy { parts.map(String::hashCode).reduce { a, b -> a * 31 + b } }
	override fun hashCode() = hashCode
	override fun equals(other: Any?) = other is Qualifier && parts == other.parts
}

fun String.qualify() = Qualifier(this)
