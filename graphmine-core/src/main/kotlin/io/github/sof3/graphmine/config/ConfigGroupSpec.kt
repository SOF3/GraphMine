package io.github.sof3.graphmine.config

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
 * Superclass of type specifications of groups in a [ConfigSpec]
 *
 * @see ConfigSpec.group
 */
abstract class ConfigGroupSpec<Self : ConfigGroupSpec<Self>> : ConfigSpec() {
	internal lateinit var parent: ConfigSpec
	internal lateinit var groupName: String

	override val path get() = parent.path + groupName

	/**
	 * @see Any.run
	 */
	@Suppress("UNCHECKED_CAST")
	operator fun invoke(fn: Self.() -> Unit) = (this as Self).run(fn)
}
