package io.github.sof3.graphmine.command.args

import io.github.sof3.graphmine.util.string.FormattedStringReader

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
 * Accepts the next value in the line. Multi-word arguments can be quoted by `""` or their spaces escaped by `\` before.
 */
class StringArg : CommandArg<String>() {
	override fun parse(parser: FormattedStringReader) = parser.nextQuoted()?.inner
}

/**
 * Accepts the rest of the whole line literally
 */
class RawTextArg : CommandArg<String>() {
	override fun parse(parser: FormattedStringReader) = parser.remaining
}
