package io.github.sof3.graphmine.util.string

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

//
//class FormattedStringReaderKotlinTest : WordSpec({
//	"FormattedStringReader.remaining" should {
//		"have empty in, empty out" {
//			val r = FormattedStringReader("")
//			r.remaining shouldBe ""
//			r.remaining shouldBe ""
//		}
//		"have random in, random out" {
//			randomRegularStrings(1..5, 10) {
//				val r = FormattedStringReader(it)
//				r.remaining shouldBe it
//			}
//		}
//		"be a pure function" {
//			randomRegularStrings(0..5, 10) {
//				val r = FormattedStringReader(it)
//				r.remaining shouldBe it
//				r.remaining shouldBe it
//			}
//		}
//	}
//
//	"FormattedStringReader.nextChar" should {
//		"return the first character" {
//			randomRegularStrings(1..5, 10) {
//				val r = FormattedStringReader(it)
//				r.nextChar() shouldBe it[0]
//			}
//		}
//		"consume the first character" {
//			randomRegularStrings(1..5, 10) {
//				val r = FormattedStringReader(it)
//				r.nextChar()
//				r.remaining shouldBe it.substring(1)
//			}
//		}
//		"read the next character" {
//			randomRegularStrings(2..5, 10) {
//				val r = FormattedStringReader(it)
//				r.nextChar()
//				r.nextChar() shouldBe it[1]
//			}
//		}
//	}
//
//	"FormattedStringReader.nextDelimiter" should {
//		"return null for an empty string" {
//			val r = FormattedStringReader("")
//			r.nextDelimiter() shouldBe null
//		}
//		"return non-null for any non-empty strings" {
//			randomRegularStrings(1..10, 100, ALPHA_NUMERAL_SPACE) {
//				val r = FormattedStringReader(it)
//				r.nextDelimiter() shouldNotBe null
//			}
//		}
//		"return (empty, delimiter) for a single delimiter" {
//			randomRegularStrings(1..10, 10) {
//				val r = FormattedStringReader(it)
//				val d = r.nextDelimiter(it)!!
//				d.beforeDelimiter shouldBe ""
//				d.delimiter shouldBe it
//			}
//		}
//		"consume all for a single delimiter" {
//			randomRegularStrings(1..10, 10) {
//				val r = FormattedStringReader(it)
//				r.nextDelimiter(it)
//				r.remaining shouldBe ""
//			}
//		}
//		"return (front, null) for no delimiters" {
//			randomRegularStrings(1..10, 10, ALPHA_UPPER) { upper ->
//				randomRegularStrings(1..10, 10, ALPHA_LOWER) { lower ->
//					val r = FormattedStringReader(upper)
//					val d = r.nextDelimiter(lower)!!
//					d.beforeDelimiter shouldBe upper
//					d.delimiter shouldBe null
//				}
//			}
//		}
//		"return the earlier for multiple delimiters" {
//			randomRegularStrings(1..10, 10, ALPHA_UPPER) { upper ->
//				randomRegularStrings(1..10, 10, ALPHA_LOWER) { lower ->
//					randomRegularStrings(1..10, 10, NUMERAL) { numeral ->
//						allPermutations(upper, lower, numeral) {
//							val r = FormattedStringReader(it[0] + it[1] + it[2])
//							allPermutations(0, 1, 2, yields = 2) { k ->
//								suspend = true
//								r.nextDelimiter(it[k[0]], it[k[1]])!!.delimiter shouldBe it[min(k[0], k[1])]
//							}
//						}
//					}
//				}
//			}
//		}
//	}
//})
//
//val ALPHA_UPPER = ('A'..'Z').toList()
//val ALPHA_LOWER = ('a'..'z').toList()
//val NUMERAL = ('0'..'9').toList()
//val ALPHA_NUMERAL = ALPHA_UPPER + ALPHA_LOWER + NUMERAL
//val ALPHA_NUMERAL_SPACE = ALPHA_NUMERAL + ' '
//
//inline fun randomRegularStrings(
//		lengths: IntRange,
//		eachTimes: Int,
//		charset: List<Char> = ALPHA_NUMERAL,
//		fn: (String) -> Unit
//) {
//	for (length in lengths) {
//		repeat(eachTimes) {
//			fn(randomRegularString(length, charset))
//		}
//	}
//}
//
//fun randomRegularString(length: Int, charset: List<Char> = ALPHA_NUMERAL): String {
//	val chars = CharArray(length)
//	repeat(length) { chars[it] = charset[Random.nextInt(charset.size)] }
//	return String(chars)
//}
//
//fun <T> allPermutations(vararg values: T, yields: Int = values.size, fn: (List<T>) -> Unit) = allPermutations(emptyList(), values.toList(), yields, fn)
//fun <T> allPermutations(front: List<T>, values: List<T>, levels: Int, fn: (List<T>) -> Unit) {
//	if (levels == 0) {
//		fn(front)
//		return
//	}
//
//	for (i in 0 until values.size) {
//		val clone = values.toMutableList()
//		val rem = clone.removeAt(i)
//		allPermutations(front + rem, clone, levels - 1, fn)
//	}
//}
