package io.github.sof3.graphmine.i18n

import kotlin.properties.ReadOnlyProperty
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

typealias Translation<T> = T.() -> String

class Declaration<Arg : Any>(private val spec: () -> LangSpec<*>, private val pathGet: () -> List<String>) : ReadOnlyProperty<LangSpec<*>, Declaration<Arg>> {
	val translations = linkedMapOf<String, Translation<Arg>>()
	val path by lazy{ pathGet() }
	val pathJoined by lazy { path.joinToString(".") }

	/**
	 * Dummy function to satisfy the ReadOnlyProperty interface
	 */
	override fun getValue(thisRef: LangSpec<*>, property: KProperty<*>) = this

	/**
	 * To be called by translation scripts to provide a translation.
	 */
	operator fun invoke(fn: Translation<Arg>) {
		translations[spec().locale!!] = fn
	}

	/**
	 * To be called by translation users to obtain a specific I18nable for this declaration.
	 */
	operator fun invoke(arg: Arg): I18nable {
		return SpecI18nable(arg, this)
	}
}
