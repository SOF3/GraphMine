package io.github.sof3.graphmine.command.args

import io.github.sof3.graphmine.command.CommandOverload
import io.github.sof3.graphmine.i18n.I18nable
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
 * Checks whether a command argument is valid. Returns null if valid, or an I18nable to be sent to the CommandSender if
 * invalid.
 */
typealias ArgValidator<R> = (R) -> I18nable?

private typealias AnyOverload = CommandOverload<*, *>

abstract class CommandArg<R : Any> { // R must be non-null because null is used as the "not set" indicator
	/**
	 * the default value of the arugment. If null, the argument is required.
	 */
	var default: R? = null
	/**
	 * the default value of the argument expressed in human-readable string.
	 */
	var defaultPrintable: I18nable? = null
	/**
	 * whether the argument is required, deduced from "default"
	 */
	val optional: Boolean get() = default != null
	/**
	 * validates the result parsed by this command
	 * @see ArgValidator
	 */
	var validator: ArgValidator<R> = { null }

	abstract val typeName: I18nable

	operator fun invoke(fn: CommandArg<R>.() -> Unit) = apply(fn)

	operator fun provideDelegate(thisRef: AnyOverload, property: KProperty<*>): ReadOnlyProperty<AnyOverload, R> {
		val wrapper = Wrapper(property.name)
		thisRef.args += wrapper
		return wrapper
	}

	inner class Wrapper(val name: String) : ReadOnlyProperty<AnyOverload, R> {
		val arg get() = this@CommandArg

		override fun getValue(thisRef: AnyOverload, property: KProperty<*>): R = TODO()
	}

	abstract fun parseCommand(reader: FormattedStringReader): R?
}
