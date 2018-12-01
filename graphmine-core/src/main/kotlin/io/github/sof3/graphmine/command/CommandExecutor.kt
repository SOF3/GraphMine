package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18n

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

class CommandExecutor<A : Overload, S : CommandSender, C>(
		val args: A,
		val sender: S,
		val c: C,
		private val receiver: CommandReceiver
) {
	@Suppress("UNCHECKED_CAST")
	inline fun <reified SubA : A, reified SubS : S> specialize() =
			if (args is SubA && sender is SubS) this as CommandExecutor<SubA, SubS, C>
			else null

	fun respond(message: I18n) = receiver.receiveMessage(message)
}
