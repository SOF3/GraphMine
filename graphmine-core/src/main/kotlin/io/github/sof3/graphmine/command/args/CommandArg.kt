package io.github.sof3.graphmine.command.args

import io.github.sof3.graphmine.command.Overload
import io.github.sof3.graphmine.util.DelegateProvider
import io.github.sof3.graphmine.util.string.FormattedStringReader
import kotlin.properties.ReadOnlyProperty
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
 * Superclass of a command argument.
 */
abstract class CommandArg<T : Any> : DelegateProvider<Overload, T> {
	fun accept(parser: FormattedStringReader): Boolean {
		value = parse(parser) ?: return false
		return true
	}

	abstract fun parse(parser: FormattedStringReader): T?


	override fun provideDelegate(thisRef: Overload, property: KProperty<*>) = object : ReadOnlyProperty<Overload, T> {
		override fun getValue(thisRef: Overload, property: KProperty<*>) = value
	}

	var optional = false
	var default: T? = null
		set(value) {
			field = value
			optional = true
		}

	fun default(value: T) = apply { default = value }

	lateinit var value: T
		protected set
}

data class ParseResult<T>(val state: ParseState, val value: T? = null)

enum class ParseState{
	OK,
	NO_VALUE
}
