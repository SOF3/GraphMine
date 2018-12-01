package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.i18n.I18nable
import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.i18n.core.CoreLang.Commands.Generic.WrongSyntaxArg

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
 * Represents any user-friendly errors reported from commands.
 *
 * Commands are not required to do this. This exception is only here for more convenient control flow.
 */
abstract class CommandException : Exception(), I18nable

/**
 * Thrown when a command with wrong syntax is sent.
 * @param name command name
 * @Param syntax list of syntax possible for this command
 */
class WrongSyntaxException(name: String, syntax: List<I18n>) : CommandException(){
	override val i18n = CoreLang.commands.generic.wrongSyntax(WrongSyntaxArg(name, syntax))
}
