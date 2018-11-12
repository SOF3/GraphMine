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

typealias Def<Arg> = Arg.() -> String

/**
 * Superclass for root declaration classes. Subclasses beyond this module must always be final.
 *
 * To declare a field, create a val with delegation to an accept() call.
 *
 * To declare a group, create a val with delegation to an group() call, passing a new instance of the Group.
 */
abstract class LangSpec<Self : LangSpec<Self>> {
	var locale: String? = null
		set(locale) {
			field = locale!!
			if (javaClass !in allSpecs) allSpecs[javaClass] = linkedMapOf() // use LinkedHashMap to retain the insertion order
			val specs = allSpecs[javaClass]!!
			specs[locale] = this
		}

	open val path: Array<String> = emptyArray()

	inner class Declaration<Arg>(
			private val propertyName: String,
			private val argClass: Class<Arg>,
			private val isArg: (Any?) -> Boolean
	) {
		val path: Array<String> = this@LangSpec.path + propertyName // just some optimization to prevent recursive calling every time

		operator fun invoke(def: Def<Arg>) {
			m[propertyName] = { arg ->
				if (!isArg(arg)) {
					throw IllegalArgumentException("Expected argument of type ${argClass.name}, " +
							"got ${arg?.javaClass?.name ?: "null"}")
				}
				@Suppress("UNCHECKED_CAST")
				def(arg as Arg)
			}
		}

		fun i18n() {
			if (argClass != Unit::class.java) throw IllegalArgumentException("The declaration requires one ${argClass.name} argument")
			@Suppress("UNCHECKED_CAST")
			i18n(Unit as Arg)
		}

		fun i18n(arg: Arg): I18nable = SpecI18nable(allSpecs[this@LangSpec.javaClass]!!, path, arg)
	}

	protected inner class AcceptDelegate<Arg : Any?>(
			private val argClass: Class<Arg>,
			private val isArg: (Any?) -> Boolean
	) : ReadOnlyProperty<Self, Declaration<Arg>> {
		override fun getValue(thisRef: Self, property: KProperty<*>) = Declaration(property.name, argClass, isArg)
	}

	internal val m: MutableMap<String, (Any?) -> String> = hashMapOf()
	internal val g: MutableMap<String, LangSpec<*>> = hashMapOf()

	@Suppress("UNCHECKED_CAST")
	operator fun invoke(fn: Self.() -> Unit) = (this as Self).apply(fn)

	protected inline fun <reified Arg : Any?> accept() =
			AcceptDelegate(Arg::class.java) { it is Arg }

	protected fun <Group : GroupSpec<Group>> group(group: Group) = object : ReadOnlyProperty<Self, Group> {
		override fun getValue(thisRef: Self, property: KProperty<*>): Group {
			g[property.name] = group
			group.parent = this@LangSpec
			group.name = property.name
			group.locale = locale
			return group
		}
	}
}
