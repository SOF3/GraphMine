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
 * Thrown when a config has some problems
 * @param message the detailed exception message
 */
open class ConfigException(message: String) : RuntimeException(message)

/**
 * Thrown when a required entry is missing from a config
 * @param message the detailed exception message
 */
open class ConfigMissingException(message: String) : ConfigException(message)

/**
 * Thrown when an entry from a config is invalid
 * @param message the detailed exception message
 */
open class ConfigValidationException(message: String) : ConfigException(message)
