package io.github.sof3.graphmine.i18n

import io.github.sof3.graphmine.util.DelegateProvider
import io.github.sof3.graphmine.util.Ref
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

abstract class LangSpec<Self : LangSpec<Self>> {
	open val rootSpec: LangSpec<*> get() = this
	open var locale: String? = null
	open val path = emptyList<String>()

	val declarations = hashMapOf<String, Declaration<*>>()
	val groups = hashMapOf<String, GroupSpec<*>>()

	// to be invoked from translation
	inline operator fun invoke(locale: String, fn: Self.() -> Unit): LangSpec<Self> {
		if (this.locale != null) throw ConcurrentModificationException("Concurrent calls to forLocale()")
		try {
			this.locale = locale
			@Suppress("UNCHECKED_CAST") fn(this as Self)
		} finally {
			this.locale = null
		}
		return this
	}

	/**
	 * Invoked by declaration subclasses to create a single declaration
	 */
	fun <Arg : Any> accept() = object : DelegateProvider<Self, Declaration<Arg>> {
		override fun provideDelegate(thisRef: Self, property: KProperty<*>): ReadOnlyProperty<Self, Declaration<Arg>> {
			val declaration = Declaration<Arg>({ rootSpec }, { path + property.name })
			declarations[property.name] = declaration
			return declaration
		}
	}

	/**
	 * Invoked by declaration subclasses to create a declaration group
	 */
	fun <Grp : GroupSpec<Grp>> group(group: Grp) = object : DelegateProvider<Self, Grp> {
		override fun provideDelegate(thisRef: Self, property: KProperty<*>): ReadOnlyProperty<Self, Grp> {
			group.parent = this@LangSpec
			group.name = property.name
			groups[property.name] = group
			return Ref(group)
		}
	}
}
