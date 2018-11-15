package io.github.sof3.graphmine.config

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

class SimpleConfigEntry<T : Any> internal constructor(validator: (T) -> String?) {
	internal val delegate = SimpleConfigEntryDelegate(validator)

	operator fun provideDelegate(thisRef: ConfigSpec, property: KProperty<*>): SimpleConfigEntryDelegate<T> {
		thisRef.entries[property.name] = delegate
		delegate.name = { (thisRef.path + property.name).joinToString(".") }
		return delegate
	}
}

class SimpleConfigEntryDelegate<T : Any> internal constructor(internal var validator: (T) -> String?) : ConfigEntryDelegate<T> {
	lateinit var name: () -> String
	override var set = false
	internal var value: T? = null

	override operator fun getValue(thisRef: ConfigSpec, property: KProperty<*>) = value!!

	override operator fun setValue(thisRef: ConfigSpec, property: KProperty<*>, value: T) {
		set = true
		val err = validator(value)
		if (err != null) throw IllegalArgumentException("Config entry ${name()} is missing")
		this.value = value
	}
}
