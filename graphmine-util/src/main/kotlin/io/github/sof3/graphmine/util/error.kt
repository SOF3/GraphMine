@file:Suppress("NOTHING_TO_INLINE")

package io.github.sof3.graphmine.util

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
 * Always throws [AssertionError] stating that control flow should never reach this point. Useful in `when` blocks when
 * Kotlin is unable to detect that the conditions are exhaustive
 */
inline val DEADCODE: Nothing get() = DEADCODE()

/**
 * Always throws [AssertionError] stating that control flow should never reach this point. Useful in `when` blocks when
 * Kotlin is unable to detect that the conditions are exhaustive
 * @param message a string to use as the error message
 */
inline fun DEADCODE(message: String = "Control flow error"): Nothing = throw AssertionError(message)
