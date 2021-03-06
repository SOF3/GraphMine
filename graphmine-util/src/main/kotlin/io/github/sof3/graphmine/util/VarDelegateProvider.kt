package io.github.sof3.graphmine.util

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

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
 * An interface to help completing the `provideDelegate` operator function for `var` property delegation.
 */
interface VarDelegateProvider<in R, T> {
	/**
	 * Provide the [ReadWriteProperty] for delegation. Could use [Ref] if no special logic is required.
	 */
	operator fun provideDelegate(thisRef: R, property: KProperty<*>): ReadWriteProperty<R, T>
}
