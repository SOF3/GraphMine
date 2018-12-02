package io.github.sof3.graphmine

import io.github.sof3.graphmine.i18n.I18n
import org.apache.logging.log4j.Logger

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
 * This interface only exists to avoid the boilerplate of calling the logger.
 */
interface HasLogger {
	/**
	 * The logger for this object
	 */
	val logger: Logger
	/**
	 * @return the default locale to use
	 */
	val locale: String

	/**
	 * Logs a DEBUG-level message
	 */
	fun debug(i18n: I18n) = logger.debug(i18n[locale])
	/**
	 * Logs a ERROR-level message
	 */
	fun error(i18n: I18n) = logger.error(i18n[locale])
	/**
	 * Logs a FATAL-level message
	 */
	fun fatal(i18n: I18n) = logger.fatal(i18n[locale])
	/**
	 * Logs a INFO-level message
	 */
	fun info(i18n: I18n) = logger.info(i18n[locale])
	/**
	 * Logs a WARN-level message
	 */
	fun warn(i18n: I18n) = logger.warn(i18n[locale])
}
