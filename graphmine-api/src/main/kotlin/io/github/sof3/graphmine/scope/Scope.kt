package io.github.sof3.graphmine.scope

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
 * A Scope represents some period of persistence. Features are enabled only during the scope is not disposed. Builtin scopes include:
 *
 * - Server scope: Until the server is stopped
 * - Player scope: Until the player leaves the server
 * - Plugin scope: While the plugin is enabled
 * - World scope: While the world is loaded
 * - World partition scope: While the world partition is loaded
 *
 * Plugins may create their own scopes too, e.g. a Hunger Games plugin may create a scope that lasts during the Hunger Games tournament
 */
interface Scope {
	val name: String

	/**
	 * whether the scope has been disposed
	 */
	val isDisposed: Boolean

	/**
	 * Adds an action to execute when the scope is disposed
	 */
	fun addOnDispose(fn: () -> Unit)
}
