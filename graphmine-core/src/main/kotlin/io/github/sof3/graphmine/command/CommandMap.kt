package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.i18n.core.CoreLang.Commands.Generic.NotFoundArg
import io.github.sof3.graphmine.scope.Scope
import io.github.sof3.graphmine.util.qualifier.QualifierMap
import io.github.sof3.graphmine.util.qualifier.qualify
import io.github.sof3.graphmine.util.string.FormattedStringReader

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

	fun <C : Scope> addCommand(command: Command<C>, context: C) = apply {
		command.scope = context
		map[command.name.qualify()] = command
	}

	fun dispatch(string: String, by: CommandSender, to: CommandReceiver) {
		val reader = FormattedStringReader(string)
		val (name) = reader.nextDelimiter() ?: return
		val command = map[name]
		if (command != null) {
			command.dispatch(reader, by, to)
		} else {
			to.receiveMessage(CoreLang.commands.generic.notFound(NotFoundArg(name)))
		}
	}
}
