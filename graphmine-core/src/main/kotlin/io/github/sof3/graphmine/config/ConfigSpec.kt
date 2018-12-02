package io.github.sof3.graphmine.config

import io.github.sof3.graphmine.util.Ref
import io.github.sof3.graphmine.util.notNull
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
 * Superclass for type specifications of .kts config files
 */
abstract class ConfigSpec {
	internal open val entries = mutableMapOf<String, ConfigEntryDelegate<*>>()
	internal val groups = mutableMapOf<String, ConfigGroupSpec<*>>()
	internal open val path = emptyList<String>()

	/**
	 * Declares a required entry
	 * @param T type of entry
	 * @param validator returns an error string if the config value is incorrect, `null` otherwise
	 */
	protected fun <T : Any> entry(validator: (T) -> String? = { null }) = SimpleConfigEntry(validator)

	/**
	 * Declares an entry with a default value
	 * @param T type of entry
	 * @param default default value to use if the config does not specify this entry.
	 * @param validator returns an error string if the config value is incorrect, `null` otherwise
	 * @sample CoreConfig.language
	 */
	protected fun <T : Any> entry(default: T, validator: (T) -> String? = { null }): SimpleConfigEntry<T> = entry(validator).apply {
		delegate.set = true
		delegate.value = default
	}

	/**
	 * Used in property delegation. Config groups are included in the parent group by property delegation.
	 * @param G the actual group spec class
	 * @see ConfigSpec.group
	 */
	protected inner class GroupDelegate<G : ConfigGroupSpec<G>>(private val group: G) {
		/**
		 * Provides delegation to the backing group.
		 */
		operator fun provideDelegate(thisRef: ConfigSpec, property: KProperty<*>): Ref<G> {
			groups[property.name] = group
			group.groupName = property.name
			return Ref(group)
		}
	}

	/**
	 * Config groups should be included by delegation to this call
	 * @param group the config to be added
	 * @return the delegate that can be included by property delegation
	 * @sample CoreConfig.server
	 */
	protected fun <G : ConfigGroupSpec<G>> group(group: G) = GroupDelegate(group.apply {
		parent = this@ConfigSpec
	})

	/**
	 * Validates the whole config
	 * @throws ConfigMissingException if a config value is not set
	 * @throws ConfigValidationException if a config value is invalid
	 */
	fun checkAll() {
		for ((_, entry) in entries) {
			if (!entry.set) throw ConfigMissingException("The config entry ${entry.name} is required but is not set")
			entry.validate().notNull { err ->
				throw ConfigValidationException("The config entry ${entry.name} is invalid: $err")
			}
		}
	}
}
