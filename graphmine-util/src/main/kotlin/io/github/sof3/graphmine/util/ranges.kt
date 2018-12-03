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
 * Syntactic sugar for [CharSequence.substring] so that it looks like `string[start:end]` in Python
 */
operator fun CharSequence.get(start: Int, end: Int) = substring(start, end)

/**
 * Syntactic sugar for [CharSequence.substring] so that it looks like `list[start:end]` in Python
 */
operator fun <T> List<T>.get(start: Int, end: Int) = slice(start until end - 1)

/**
 * A more intuitive way of checking if an offset is in bounds of a string
 */
fun String.hasOffset(offset: Int) = offset in 0 until length

/**
 * A more intuitive way of checking if an offset is in bounds of a list
 */
fun List<*>.hasOffset(offset: Int) = offset in 0 until size
