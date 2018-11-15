package io.github.sof3.graphmine.i18n

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

abstract class GroupSpec<Self : GroupSpec<Self>> : LangSpec<Self>() {
	lateinit var parent: LangSpec<*>
	lateinit var name: String

	override val rootSpec: LangSpec<*> get() = parent
	override var locale: String?
		get() = parent.locale
		set(_) = throw RuntimeException("Cannot set locale on group spec")
	override val path get() = parent.path + name

	operator fun invoke(fn: Self.() -> Unit) {
		@Suppress("UNCHECKED_CAST") fn(this as Self)
	}
}
