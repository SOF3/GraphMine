package io.github.sof3.graphmine.command

import io.github.sof3.graphmine.feature.FeatureNode
import kotlin.reflect.KClass

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

abstract class Command<
		Cmd : Command<Cmd, Overload>,
		Overload : CommandOverload<Overload, Cmd>>
(
		val overloadClass: KClass<Overload>,
		fn: CommandBuilder<Cmd, Overload>.() -> Unit
) : FeatureNode<Cmd, Overload> {
	init {
		val builder = CommandBuilder<Cmd, Overload>()
		builder.fn()
		TODO("apply builder")
	}
}
