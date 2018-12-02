package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.i18n.i18n
import io.github.sof3.graphmine.scope.Scope
import io.github.sof3.graphmine.util.qualifier.Qualifier
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
 * Subclasses must initialize the [name] property.
 *
 * @param fn A lambda to initialize the command.
 *
 * @sample io.github.sof3.graphmine.command.impl.VersionCommand
 */
abstract class Command<C : Scope>(fn: Command<C>.() -> Unit) {
	/**
	 * The scope that owns the command
	 */
	lateinit var scope: C
		internal set

	/**
	 * The qualified name of the command.
	 *
	 * This property is intentionally not made as a delegation as string so as to remind command developers that the
	 * name needs to be qualified.
	 *
	 * @see Qualifier
	 */
	lateinit var name: Qualifier
	/**
	 * The description of the command, shown in action lists like /help.
	 */
	var description: I18n = "".i18n
	/**
	 * The list of aliases
	 */
	var aliases = listOf<String>()

	/** @suppress */
	val overloads = mutableListOf<RegisteredOverload>()
	/** @suppress */
	val handlers = mutableListOf<suspend (CommandExecutor<Overload, CommandSender, C>) -> Unit>()

	/**
	 * Executes the command.
	 *
	 * The command is run as a new coroutine in [the command's owner scope][scope].
	 *
	 * @param reader the reader containing the command arguments. The reader pointer should start at the first character
	 * of the command arguments.
	 * @param sender the [CommandSender] that sent the command
	 * @param receiver the object that accepts the command output and presents it to the sender.
	 */
	fun dispatch(reader: FormattedStringReader, sender: CommandSender, receiver: CommandReceiver) = scope.launch {
		try {
			for (overload in overloads) {
				val arg = overload.accept(reader)
				if (arg != null) {
					val executor = CommandExecutor(arg, sender, receiver, scope)
					handlers.forEach { it(executor) }
					return@launch
				}
			}
			throw WrongSyntaxException(name.toString(), overloads.map { it.i18n })
		} catch (ex: CommandException) {
			receiver.receiveMessage(ex.i18n)
		}
	}

	/**
	 * Adds a handler to the command.
	 *
	 * Type parameters [A] and [S] are explicitly specified to filter the overloads and sender types.
	 *
	 * If the command does not require any parameters, [EmptyOverload] can be used.
	 *
	 * @param A the restricted [Overload] type
	 * @param S the restricted [CommandSender] type
	 *
	 * @param fn the handler function
	 */
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
