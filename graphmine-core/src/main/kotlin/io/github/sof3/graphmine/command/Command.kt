package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.i18n.i18n
import io.github.sof3.graphmine.scope.Scope
import io.github.sof3.graphmine.util.string.FormattedStringReader
import kotlinx.coroutines.launch

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
 * Subclasses must initialize the "name" property.
 */
abstract class Command<C : Scope>(fn: Command<C>.() -> Unit) {
	internal lateinit var scope: C

	lateinit var name: String
	var description: I18n = "".i18n
	var aliases = listOf<String>()

	val overloads = mutableListOf<RegisteredOverload>()
	val handlers = mutableListOf<suspend (CommandExecutor<Overload, CommandSender, C>) -> Unit>()

	fun dispatch(reader: FormattedStringReader, by: CommandSender, receiver: CommandReceiver) = scope.launch {
		try {
			for (overload in overloads) {
				val arg = overload.accept(reader)
				if (arg != null) {
					val executor = CommandExecutor(arg, by, scope, receiver)
					handlers.forEach { it(executor) }
					return@launch
				}
			}
			throw WrongSyntaxException(name, overloads.map { it.i18n })
		} catch (ex: CommandException) {
			receiver.receiveMessage(ex.i18n)
		}
	}

	suspend fun execute(arg: Overload, by: CommandSender, receiver: CommandReceiver) {
		val executor = CommandExecutor(arg, by, scope, receiver)
		handlers.forEach { it(executor) }
	}

	inline fun <reified A : Overload, reified S : CommandSender> handle(crossinline fn: suspend CommandExecutor<A, S, C>.() -> Unit) {
		overloads += RegisteredOverload(A::class)

		handlers += {
			val special = it.specialize<A, S>()
			if (special != null) fn(special)
		}
	}

	init {
		fn()
	}
}
