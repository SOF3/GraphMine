package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.util.qualifier.QualifierMap
import io.github.sof3.graphmine.util.qualifier.qualify
import io.github.sof3.graphmine.util.string.FormattedStringReader
import kotlinx.coroutines.GlobalScope
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

class CommandMap {
	private val map = QualifierMap<Command<*>>()

	fun <C : Any> addCommand(command: Command<C>, context: C) {
		command.c = context
		map[command.name.qualify()] = command
	}

	fun dispatch(string: String, by: CommandSender, to: CommandReceiver) {
		GlobalScope.launch {
			try {
				dispatchCommand(string, by, to)
			} catch (exception: CommandException) {
				to.receiveMessage(exception.i18n)
			}
		}
	}

	private suspend fun dispatchCommand(string: String, by: CommandSender, to: CommandReceiver) {
		val reader = FormattedStringReader(string)
		val (name) = reader.nextDelimiter() ?: return
		val command = map[name] ?: throw CommandNotFoundException(name)
		for (overload in command.overloads) {
			val arg = overload.accept(string)
			if (arg != null) {
				command.execute(arg, by, to)
				return
			}
		}
	}
}
