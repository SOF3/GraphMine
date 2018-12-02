package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.i18n.I18n
import io.github.sof3.graphmine.scope.Scope

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
 * The `this` context of command handlers.
 *
 * Other modules are encouraged to create extension functions on this class for more convenient handling.
 *
 * @param A the type of overload. Can be any supertype of the actual overload.
 * @param S the type of command sender. Can be any supertype of the actual sender.
 * @param C the [scope][Scope] of the command execution.
 *
 * @property args the parsed overload instance
 * @property sender the sender that sent the command
 * @property receiver the object to send command output into
 * @property scope the scope that owns the command
 */
class CommandExecutor<A : Overload, S : CommandSender, C : Scope> internal constructor(
		val args: A,
		val sender: S,
		val receiver: CommandReceiver,
		val scope: C
) {
	/**
	 * Restricts the command executor to its subtypes.
	 *
	 * [SubA] and [SubS] are intentionally not forced to be subtypes of [A] and [S] because it is possible that [SubA]
	 * is another interface that does not extend [A].
	 *
	 * @param SubA the new expected overload type
	 * @param SubS the new expected sender type
	 * @return `this` if the types can be narrowed for this instance, `null` if types are incompatible
	 */
	@Suppress("UNCHECKED_CAST")
	inline fun <reified SubA : Overload, reified SubS : CommandSender> specialize() =
			if (args is SubA && sender is SubS) this as CommandExecutor<SubA, SubS, C>
			else null

	/**
	 * Responds to the command sender. A shortcut for `receiver.receiveMessage`.
	 *
	 * @param message the i18nized message to be sent.
	 */
	fun respond(message: I18n) = receiver.receiveMessage(message)
}
