package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18nable
import io.github.sof3.graphmine.i18n.i18n

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
 * This class represents a command type. Each instance of Command should represent one registered command.
 *
 * Subclasses must
 */
abstract class Command<C : Any>(fn: Command<C>.() -> Unit) {
	internal lateinit var c: C

	lateinit var name: String
	var description: I18nable = "".i18n
	var aliases = listOf<String>()

	val overloads = mutableListOf<RegisteredOverload>()
	val handlers = mutableListOf<(CommandExecutor<Overload, CommandSender, C>) -> Unit>()

	inline fun <reified A : Overload, reified S : CommandSender> handle(crossinline fn: CommandExecutor<A, S, C>.() -> Unit) {
		overloads += RegisteredOverload(A::class)

		handlers += { if (it.args is A && it.sender is S) fn(it.specialize()) }
	}

	init {
		fn()
	}
}
