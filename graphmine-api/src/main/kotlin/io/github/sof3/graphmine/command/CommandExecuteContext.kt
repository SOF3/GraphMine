package io.github.sof3.graphmine.command

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

data class CommandExecuteContext<
		Overload : CommandOverload<in Overload, Cmd>,
		Cmd : Command<Cmd, in Overload>,
		Sender : CommandSender>
(
		val args: Overload,
		val sender: Sender
) {
	inline fun <reified SubOverload : Overload>
			argsAre(fn: CommandExecuteContext<SubOverload, Cmd, Sender>.() -> Unit) {
		if (args is SubOverload) fn(CommandExecuteContext(args, sender))
	}

	inline fun <reified SubSender : Sender>
			senderIs(fn: CommandExecuteContext<Overload, Cmd, SubSender>.() -> Unit) {
		if (sender is SubSender) fn(CommandExecuteContext(args, sender))
	}
}
