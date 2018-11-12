package io.github.sof3.graphmine.config

import io.github.sof3.graphmine.util.Ref
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

abstract class ConfigSpec {
	internal val entries = mutableMapOf<String, ConfigEntryDelegate<*>>()
	internal val groups = mutableMapOf<String, ConfigGroupSpec<*>>()
	open val path = emptyList<String>()

	protected fun <T : Any> entry(validator: (T) -> String? = { null }) = SimpleConfigEntry(validator)

	protected fun <T : Any> entry(default: T, validator: (T) -> String? = { null }): SimpleConfigEntry<T> = entry(validator).apply {
		delegate.set = true
		delegate.value = default
	}

	protected inner class GroupDelegate<G : ConfigGroupSpec<G>>(val g: G) {
		operator fun provideDelegate(thisRef: ConfigSpec, property: KProperty<*>): Ref<G> {
			groups[property.name] = g
			g.groupName = property.name
			return Ref(g)
		}
	}

	protected fun <G : ConfigGroupSpec<G>> group(g: G) = GroupDelegate(g.apply {
		parent = this@ConfigSpec
	})

	fun checkAll() {
		for ((_, entry) in entries) {
			if (!entry.set) throw RuntimeException("The config entry ")
		}
	}
}
