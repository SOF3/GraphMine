package io.github.sof3.graphmine.util.string

import io.github.sof3.graphmine.util.get
import io.github.sof3.graphmine.util.hasOffset
import org.jetbrains.annotations.Contract

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

data class FormattedStringReader(val string: String) {
	var pointer = 0

	/**
	 * Executes a function that may modify the state of this object, but upon completion, the state is reset.
	 *
	 * This
	 */
	inline fun exec(fn: () -> Unit){
		val store = pointer
		fn()
		pointer = store
	}

	/**
	 * Peeks everything remaining in the string. Does **not** consume anything.
	 */
	val remaining: String get() = string.substring(pointer)

	/**
	 * Returns whether the reader reached the end of string
	 */
	val isComplete get() = pointer == string.length

	/**
	 * Consumes and returns the next character.
	 */
	fun nextChar(): Char? = if (pointer >= string.length) null else string[pointer++]

	/**
	 * - If there is nothing to read (isComplete == true), returns null
	 * - If the delimiter is in the remaining string:
	 *   - consumes $x := everything before the delimiter, **b**>
	 *   - consumes the delimiter itself
	 *   - returns ($x, delimiter)
	 * - If the delimiter is *not* in the remaining string:
	 *   - consumes $x := the remaining string
	 *   - returns ($x, null)
	 *
	 * If multiple delimiters are provided, the first delimiter found in the remaining string is used (i.e. BFS).
	 *
	 * If multiple delimiters match the input at the same position, the first one is used, so if the parser expects
	 * greedy behaviour, reverse-sort the delimiters by length before passing.
	 */
	fun nextDelimiter(vararg delimiters: String = arrayOf(" ")): DelimiterResult? {
		if (pointer == string.length) return null

		for (start in pointer until string.length) {
			for (delimiter in delimiters) {
				if (start + delimiter.length <= string.length && string[start, start + delimiter.length] == delimiter) {
					val result = string[pointer, start]
					pointer = start + delimiter.length
					return DelimiterResult(result, delimiter)
				}
			}
		}

		val rem = remaining
		pointer = string.length
		return DelimiterResult(rem, null)
	}

	/**
	 * Returns the first value in `oneOf` that the remaining string starts with. Returns null if none is found.
	 *
	 * If suffix is provided, each `oneOf` is appended with the suffix, but the suffix itself will not be returned.
	 *
	 * Consumes both the matched `oneOf` value and the suffix.
	 *
	 * The options are searched in order. If a greedy approach is desired, the caller should reverse-sort the args by
	 * length before passing.
	 */
	fun exactly(vararg oneOf: String, suffix: String = ""): String? {
		val rem = remaining
		for (prefix in oneOf) {
			if (rem.startsWith(prefix + suffix)) {
				pointer += prefix.length + suffix.length
				return prefix
			}
		}
		return null
	}

	/**
	 * Similar to `nextDelimiter(delimiter)`, but if `open` is found in the token, the reader will read until the next
	 * `close` regardless of `delimiter`, and continue reading with the same rule until a `delimiter` beyond a pair of
	 * `open`/`close` is found or the string comes to the end.
	 *
	 * If there is an odd number of `open`s, the last `open` is parsed normally.
	 *
	 * Recursive open/close is not supported, i.e. for `open = '{', close = '}'`, `a{b{c}d}e` is parsed as `ab{cd}e`.
	 *
	 * @param open the character
	 * @param close the character to be paired
	 * @param delimiter the character to terminate the token
	 * @param openEscape the character used in front of `open` to prevent it from *starting* a pair. Pass null to
	 * disable escaping. Two consecutive `openEscape` characters are merged (i.e. `\\` will become `\`)
	 * @param closeEscape the character used in front of `close` to prevent it from *closing* a pair. Pass null to
	 * disable escaping. Two consecutive `closeEscape` characters are merged.
	 * @param delimiterEscape the character used in front of `delimiter` to prevent it from ending the token. Pass null
	 * to disable escaping. Two consecutive `delimiterEscape` characters are merged.
	 * @param dumb in dumb mode, all escapes are ignored, and `open` is only effective at offset 0
	 * @return - `inner`: the consumed string with the paired quotes removed, escaped quotes unescaped (`\"` becomes
	 * `"`), without the delimiter
	 * - `hasDelimiter`: whether a delimiter is consumed (if false, the end of string is reached)
	 * - `original`: the whole consumed string except the delimiter
	 * - `quotesCount`: the number of *pairs of* quotes used
	 *
	 * Returns null if end of string was already reached before calling this method.
	 */
	fun nextQuoted(
			open: Char = '"',
			close: Char = open,
			delimiter: Char = ' ',
			openEscape: Char? = '\\',
			closeEscape: Char? = openEscape,
			delimiterEscape: Char? = null,
			dumb: Boolean = false
	): QuotedResult? {
		if (pointer == string.length) return null

		val inner = StringBuilder()
		val original = StringBuilder()
		var quotesCount = 0

		val originalPointer = pointer
		while (string.hasOffset(pointer)) {
			if (!dumb) {
				if (string[pointer] == openEscape) {
					if (string.hasOffset(pointer + 1) && (string[pointer + 1] == openEscape || string[pointer + 1] == open)) {
						original.append(string[pointer]).append(string[pointer + 1])
						inner.append(string[pointer + 1])
						pointer += 2
						continue
					}
					original.append(string[pointer])
					inner.append(string[pointer])
					pointer++
					continue
				}

				if (string[pointer] == delimiterEscape) {
					if (string.hasOffset(pointer + 1) && (string[pointer + 1] == delimiterEscape || string[pointer + 1] == delimiter)) {
						original.append(string[pointer]).append(string[pointer + 1])
						inner.append(string[pointer + 1])
						pointer += 2
						continue
					}
					original.append(string[pointer])
					inner.append(string[pointer])
					pointer++
					continue
				}

				if (string[pointer] == open) {
					pointer++
					val pair = readQuoted(close, closeEscape)
					if (pair == null) {
						// quote is unpaired
						original.append(open)
						inner.append(open)
					} else {
						assert(string[pointer, pointer + pair.first.length] == pair.first)
						pointer += pair.first.length
						original.append(open).append(pair.first)
						inner.append(pair.second)
						quotesCount++
					}
					continue
				}
			}

			if (dumb && pointer == originalPointer && string[pointer] == open) {
				val closeIndex = string.indexOf(close, startIndex = pointer + 1)
				if (closeIndex != -1) {
					original.append(string[pointer, closeIndex + 1])
					inner.append(string[pointer + 1, closeIndex])
					pointer = closeIndex + 1
					quotesCount++
					continue
				}
				// else, quote is unpaired
			} else if (string[pointer] == delimiter) {
				pointer++
				return QuotedResult(inner.toString(), true, original.toString(), quotesCount)
			}

			original.append(string[pointer])
			inner.append(string[pointer])
			pointer++
		}

		return QuotedResult(inner.toString(), false, original.toString(), quotesCount)
	}

	@Contract(pure = true)
	private fun readQuoted(close: Char, escape: Char?): Pair<String, String>? {
		if (escape == null) {
			val stop = string.indexOf(close, startIndex = pointer)
			if (stop == -1) return null // unpaired

			return Pair(string[pointer, stop + 1], string[pointer, stop])
		}

		val ret = StringBuilder()
		var start = pointer
		while (true) {
			val stop = string.indexOfAny(charArrayOf(close, escape), startIndex = start)
			if (stop == -1) return null // unpaired
			ret.append(string[start, stop])

			if (string[stop] == escape) {
				if (string.length == stop + 1) return null // ends with an escape at string[stop], still unpaired
				if (string[stop + 1] == close || string[stop + 1] == escape) {
					ret.append(string[stop + 1]) // escaped
				} else {
					ret.append(string[stop]).append(string[stop + 1]) // not a valid escape
				}
				start = stop + 2
				continue
			}

			assert(string[stop] == close)
			return Pair(string[pointer, stop + 1], ret.toString())
		}
	}
}

/**
 * @see FormattedStringReader.nextDelimiter
 */
data class DelimiterResult(val content: String, val delimiter: String?)

/**
 * @see FormattedStringReader.nextQuoted
 */
data class QuotedResult(val inner: String, val hasDelimiter: Boolean, val original: String, val quotesCount: Int)
