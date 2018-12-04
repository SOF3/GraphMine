package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.command.args.CommandArg
import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.i18n.I18nable
import io.github.sof3.graphmine.util.string.FormattedStringReader
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

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
 * A factory that creates a new instance of a known command overload for each command execution.
 */
class RegisteredOverload(private val klass: KClass<out Overload>) : I18nable {
	override val i18n: I18n
		get() = TODO("not implemented")

	/**
	 * The arguments applicable to this overload
	 */
	val args: List<CommandArg<*>>

	init {
		val instance = klass.createInstance()
		args = instance.args
	}

	/**
	 * Accepts a command and tries to parse it.
	 */
	fun accept(parser: FormattedStringReader): Overload? {
		val command = klass.createInstance()
		for (arg in command.args) {
			if (!arg.accept(parser)) return null // TODO use parser.exec{}
		}

		return command
	}
}
