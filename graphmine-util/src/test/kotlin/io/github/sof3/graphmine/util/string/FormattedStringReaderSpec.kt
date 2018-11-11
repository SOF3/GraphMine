package io.github.sof3.graphmine.util.string

import io.github.sof3.graphmine.util.GivenRandom
import io.github.sof3.graphmine.util.shouldBe
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

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

val FSR = { s: String -> FormattedStringReader(s) }
inline fun <reified T> Null() = { null as T? }
val nullDR = Null<DelimiterResult>()

object FormattedStringReaderSpec : Spek({
	Feature("FormattedStringReader") {
		Scenario("remaining is queried") {
			GivenRandom(0..5, FSR, {}, "random inputs") {
				Then("should return the passed value") { s, r, _ -> r.remaining shouldBe s }
				And("should return a consistent value") { s, r, _ -> r.remaining shouldBe s }
				And("without changing the state") { _, r, _ -> r.pointer shouldBe 0 }
			}
		}

		Scenario("nextChar is used") {
			GivenRandom(1..5, FSR, { null as Char? }, "random non-empty input") {
				When("nextChar is called once") { _, r, c -> c.value = r.nextChar() }
				Then("should return the first character") { s, _, c -> c shouldBe s[0] }
				And("should move the pointer") { _, r, _ -> r.pointer shouldBe 1 }

				When("nextChar is called again") { _, r, c -> c.value = r.nextChar() }
				If("input.length >= 2", { it.length >= 2 },
						"should return the second character", { s, _, c -> c shouldBe s[1] },
						"should return null", { _, _, c -> c shouldBe null })
			}
		}

		Scenario("nextDelimiter is called") {
			lateinit var r: FormattedStringReader

			Given("empty input") { r = FormattedStringReader("") }
			GivenRandom(1..5, { it }, nullDR, "random non-empty delimiter") {
				When("nextDelimiter is called") { s, _, d -> d.value = r.nextDelimiter(s) }
				Then("should return null") { _, _, d -> d shouldBe null }
			}

			GivenRandom(1..5, FSR, nullDR, "random non-empty input without delimiter") {
				When("nextDelimiter is called") { _, r, c -> c.value = r.nextDelimiter() }
				Then("should return (input, null)") { s, _, c ->
					c.value!!.beforeDelimiter shouldBe s
					c.value!!.delimiter shouldBe null
				}
			}
			GivenRandom(1..5, FSR, nullDR, "input equals random non-empty delimiter") {
				When("nextDelimiter is called") { s, r, c -> c.value = r.nextDelimiter(s) }
				Then("should return (input, null)") { s, _, c ->
					c.value!!.beforeDelimiter shouldBe ""
					c.value!!.delimiter shouldBe s
				}
			}

//			"consume all for a single delimiter" {
//				randomRegularStrings(1..10, 10) {
//					val r = FormattedStringReader(it)
//					r.nextDelimiter(it)
//					r.remaining shouldBe ""
//				}
//			}
//			"return (front, null) for no delimiters" {
//				randomRegularStrings(1..10, 10, ALPHA_UPPER) { upper ->
//					randomRegularStrings(1..10, 10, ALPHA_LOWER) { lower ->
//						val r = FormattedStringReader(upper)
//						val d = r.nextDelimiter(lower)!!
//						d.beforeDelimiter shouldBe upper
//						d.delimiter shouldBe null
//					}
//				}
//			}
//			"return the earlier for multiple delimiters" {
//				randomRegularStrings(1..10, 10, ALPHA_UPPER) { upper ->
//					randomRegularStrings(1..10, 10, ALPHA_LOWER) { lower ->
//						randomRegularStrings(1..10, 10, NUMERAL) { numeral ->
//							allPermutations(upper, lower, numeral) {
//								val r = FormattedStringReader(it[0] + it[1] + it[2])
//								allPermutations(0, 1, 2, yields = 2) { k ->
//									suspend = true
//									r.nextDelimiter(it[k[0]], it[k[1]])!!.delimiter shouldBe it[min(k[0], k[1])]
//								}
//							}
//						}
//					}
//				}
//			}
		}
	}
})
