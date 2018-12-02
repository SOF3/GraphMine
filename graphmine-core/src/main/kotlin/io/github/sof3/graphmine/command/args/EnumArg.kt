package io.github.sof3.graphmine.command.args

import io.github.sof3.graphmine.util.string.FormattedStringReader
import kotlin.reflect.KClass

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
 * Accepts a value that names one of the constants in the enum class
 */
class EnumArg<E : Enum<E>>(private val enumClass: KClass<E>) : CommandArg<E>() {
	/**
	 * Match enum constant names case-insensitively.
	 *
	 * This may cause problems if multiple enum constants have the same name with different cases. (However this is not
	 * encouraged in Java coding style anyway)
	 */
	var ignoreCase = true

	/**
	 * The policy for comparing symbols in enum names
	 */
	var symbolPolicy = SymbolPolicy.ANY

	override fun parse(parser: FormattedStringReader): E? {
		val name = parser.nextDelimiter()?.content ?: return null
		val given = symbolPolicy.fn(name)
		for (enum in enumClass.java.enumConstants!!) {
			val actual = symbolPolicy.fn(enum.name)
			if (actual.equals(given, ignoreCase)) return enum
		}
		return null
	}

	/**
	 * The policy to use for comparing symbols in enum names
	 */
	enum class SymbolPolicy(internal val fn: (String) -> String) {
		/**
		 * Compares names as-is
		 */
		AS_IS({ it }),
		/**
		 * Any strings of one or more non-alphanumeric symbols are considered the same, and leading and trailing symbols are always
		 * ignored
		 */
		ANY({ it.replace(Regex("[^A-Za-z0-9]+"), "_").trim('_') }),
		/**
		 * Any non-alphanumeric symbols are ignored
		 */
		IGNORE({ it.replace(Regex("[^A-Za-z0-9]+"), "") }),
	}
}
