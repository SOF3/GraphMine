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
	/**
	 * Reads the next value in the parser into the value for the argument.
	 * @return whether the value is valid for this argument
	 */
	fun accept(parser: FormattedStringReader): Boolean {
		value = parse(parser) ?: return false
		return true
	}

	/**
	 * Reads the next value in the parser into the value for the argument
	 *
	 * @return the parsed value, or `null` if it is missing or cannot be parsed
	 */
	abstract fun parse(parser: FormattedStringReader): T?


	override fun provideDelegate(thisRef: Overload, property: KProperty<*>) = object : ReadOnlyProperty<Overload, T> {
		override fun getValue(thisRef: Overload, property: KProperty<*>) = value
	}

	/**
	 * Whether the command arg can be skipped
	 */
	var optional = false
	/**
	 * Sets the default value of the command. Implicitly sets [optional] to `true` (even if the set value is `null`)
	 */
	var default: T? = null
		set(value) {
			field = value
			optional = true
		}

	/**
	 * Sets the default value of the command. Implicitly sets [optional] to `true` (even if the set value is `null`)
	 */
	fun default(value: T) = apply { default = value }

	/**
	 * The received value of the argument
	 */
	lateinit var value: T
		protected set
}
