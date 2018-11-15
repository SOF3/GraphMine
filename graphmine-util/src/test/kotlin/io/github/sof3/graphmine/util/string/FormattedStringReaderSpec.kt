package io.github.sof3.graphmine.util.string

import io.github.sof3.graphmine.util.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.math.min

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
inline fun <reified T> Null(): () -> T? = { null }
val nullDR = Null<DelimiterResult>()

object FormattedStringReaderSpec : Spek({
	Feature("remaining") {
		Scenario("remaining is queried") {
			GivenRandom(0..5, FSR, {}, "random inputs") {
				Then("should return the passed value") { s, r, _ -> r.remaining shouldBe s }
				And("should return a consistent value") { s, r, _ -> r.remaining shouldBe s }
				And("without changing the state") { _, r, _ -> r.pointer shouldBe 0 }
			}
		}
	}

	Feature("nextChar()") {
		Scenario("given empty input") {
			lateinit var r: FormattedStringReader
			var c: Char? = null
			Given("empty input") { r = FormattedStringReader("") }
			When("nextChar is called") { c = r.nextChar() }
			Then("should return null") { c shouldBe null }
		}

		Scenario("random non-empty input") {
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
	}

	Feature("nextDelimiter()") {
		Scenario("given empty input") {
			val emptyReader = FormattedStringReader("")
			GivenRandom(1..5, { it }, nullDR, "random non-empty delimiter") {
				When("nextDelimiter is called") { s, _, d -> d.value = emptyReader.nextDelimiter(s) }
				Then("should return null") { _, _, d -> d shouldBe null }
			}
		}

		Scenario("input does not contain delimiter") {
			GivenRandom(1..5, FSR, nullDR, "random non-empty input") {
				When("nextDelimiter is called") { _, r, c -> c.value = r.nextDelimiter() }
				Then("should return (input, null)") { s, _, c ->
					c.value!!.content shouldBe s
					c.value!!.delimiter shouldBe null
				}
				And("should consume the whole input") { _, r, _ ->
					r.remaining.isEmpty() shouldBe true
				}
			}
		}

		Scenario("input = delimiter") {
			GivenRandom(1..5, FSR, nullDR, "random non-empty delimiter") {
				When("nextDelimiter is called") { s, r, c -> c.value = r.nextDelimiter(s) }
				Then("should return (input, null)") { s, _, c ->
					c.value!!.content shouldBe ""
					c.value!!.delimiter shouldBe s
				}
				And("should consume the whole input") { _, r, _ ->
					r.remaining.isEmpty() shouldBe true
				}
			}
		}

		Scenario("multiple delimiters are used") {
			val rList = mutableListOf<List<String>>()
			Given("all permutations of 3 random distinct inputs") {
				randomRegularStrings(1..4, 5, ALPHA_UPPER) { s1 ->
					randomRegularStrings(1..4, 10, ALPHA_LOWER) { s2 ->
						randomRegularStrings(1..4, 10, NUMERAL) { s3 ->
							allPermutations(s1, s2, s3) { s ->
								rList.add(s)
							}
						}
					}
				}
			}

			val dList = mutableListOf<Pair<DelimiterResult?, String>>()
			When("nextDelimiter is called with any two input") {
				rList.forEach { s ->
					allPermutations(*((0..2).toList().toTypedArray()), yields = 2) { i ->
						val r = FormattedStringReader(s[0] + s[1] + s[2])
						val d = r.nextDelimiter(s[i[0]], s[i[1]])
						val first = s[min(i[0], i[1])]
						dList.add(d to first)
						return@allPermutations
					}
				}
				rList.clear()
			}

			Then("should return the earlier occurrence for multiple delimiter") {
				dList.forEach {
					val (d, s) = it
					d shouldNotBe null
					d!!.delimiter shouldBe s
				}
			}
		}
	}

	Feature("exactly()") {
		Scenario("search value is at the middle") {
			lateinit var r: FormattedStringReader
			var d: String? = null

			Given("input = ABCD12wxy!@#") { r = FormattedStringReader("ABCD12wxy!@#") }

			When("searching the middle value") { d = r.exactly("12") }
			Then("should return null") { d shouldBe null }
			And("nothing should be consumed") { r.pointer shouldBe 0 }
		}

		Scenario("search value is at the beginning without suffix") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("input = ABCD12wxy!@#") { r = FormattedStringReader("ABCD12wxy!@#") }

			When("searching the first part without suffix") { s = r.exactly("ABCD") }
			Then("should return non-null") { s shouldNotBe null }
			And("should return the first part") { s shouldBe "ABCD" }
			And("should consume the first part") { r.pointer shouldBe "ABCD".length }
		}

		Scenario("search value is at the beginning with suffix") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("input = ABCD12wxy!@#") { r = FormattedStringReader("ABCD12wxy!@#") }

			When("searching the first part with correct suffix") { s = r.exactly("ABCD", suffix = "12") }
			Then("should return non-null") { s shouldNotBe null }
			And("should return the first part") { s shouldBe "ABCD" }
			And("should consume the first two parts") { r.pointer shouldBe "ABCD12".length }

			Given("input = ABCD12wxy!@#") { r = FormattedStringReader("ABCD12wxy!@#") }

			When("searching the first part with incorrect suffix") { s = r.exactly("ABCD", suffix = "wxy") }
			Then("should return null") { s shouldBe null }
			And("should consume nothing") { r.pointer shouldBe 0 }
		}

		Scenario("searching an empty input") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("empty input") { r = FormattedStringReader("") }
			When("searching something random") { s = r.exactly(randomRegularString(10)) }
			Then("should return null") { s shouldBe null }
		}

		Scenario("searching nothing") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("any input") { r = FormattedStringReader(randomRegularString(10)) }
			When("searching nothing") { s = r.exactly() }
			Then("should return null") { s shouldBe null }
		}

		Scenario("searching multiple values without suffix") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("input = ABC") { r = FormattedStringReader("ABC") }
			When("searching in ascending order") { s = r.exactly("AB", "ABC") }
			Then("should return the smallest one") { s shouldBe "AB" }

			Given("input = ABC") { r = FormattedStringReader("ABC") }
			When("searching in descending order") { s = r.exactly("ABC", "AB") }
			Then("should return the largest one") { s shouldBe "ABC" }
		}

		Scenario("searching multiple values with suffix") {
			lateinit var r: FormattedStringReader
			var s: String? = null

			Given("input = ABCDC") { r = FormattedStringReader("ABCDC") }
			When("searching in ascending order") { s = r.exactly("AB", "ABCD", suffix = "C") }
			Then("should return the smallest one") { s shouldBe "AB" }

			Given("input = ABCDC") { r = FormattedStringReader("ABCDC") }
			When("searching in descending order") { s = r.exactly("ABCD", "AB", suffix = "C") }
			Then("should return the largest one") { s shouldBe "ABCD" }
		}
	}

	Feature("nextQuoted()") {
		Scenario("given empty string") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("empty input") { r = FormattedStringReader("") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return null") { q shouldBe null }
		}

		Scenario("given simple unquoted word in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `ABC`") { r = FormattedStringReader("ABC") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "ABC" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given simple unquoted word followed by delimiter in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `ABC `") { r = FormattedStringReader("ABC ") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "ABC" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given simple quoted word in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"ABC\"`") { r = FormattedStringReader("\"ABC\"") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"ABC\"" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given simple quoted word followed by delimiter in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"ABC\" `") { r = FormattedStringReader("\"ABC\" ") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"ABC\"" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given simple unquoted word in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `ABC`") { r = FormattedStringReader("ABC") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "ABC" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given simple unquoted word followed by delimiter in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `ABC `") { r = FormattedStringReader("ABC ") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "ABC" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given simple quoted word in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"ABC\"`") { r = FormattedStringReader("\"ABC\"") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"ABC\"" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given simple quoted word followed by delimiter in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"ABC\" `") { r = FormattedStringReader("\"ABC\" ") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"ABC\"" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given \"quote\"d word in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"AB\"C`") { r = FormattedStringReader("\"AB\"C") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"AB\"C" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given \"quote\"d word followed by delimiter in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"AB\"C `") { r = FormattedStringReader("\"AB\"C ") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"AB\"C" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given \"quote\"d word in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"AB\"C`") { r = FormattedStringReader("\"AB\"C") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"AB\"C" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given \"quote\"d word followed by delimiter in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `\"AB\"C `") { r = FormattedStringReader("\"AB\"C ") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "\"AB\"C" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given q\"uoted\" word in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\"BC\"`") { r = FormattedStringReader("A\"BC\"") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `A\"BC\"`") { q!!.inner shouldBe "A\"BC\"" }
			Then("should return the original without delimiter") { q!!.original shouldBe "A\"BC\"" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given q\"uoted\" word followed by delimiter in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\"BC\" `") { r = FormattedStringReader("A\"BC\" ") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `A\"BC\"`") { q!!.inner shouldBe "A\"BC\"" }
			Then("should return the original without delimiter") { q!!.original shouldBe "A\"BC\"" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given q\"uoted\" word in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\"BC\"`") { r = FormattedStringReader("A\"BC\"") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "A\"BC\"" }
			Then("should return hasDelimiter=false") { q!!.hasDelimiter shouldBe false }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume the whole word") { r.remaining shouldBe "" }
		}

		Scenario("given q\"uote\" word followed by delimiter in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\"BC\" `") { r = FormattedStringReader("A\"BC\" ") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return `ABC`") { q!!.inner shouldBe "ABC" }
			Then("should return the original without delimiter") { q!!.original shouldBe "A\"BC\"" }
			Then("should return hasDelimiter=true") { q!!.hasDelimiter shouldBe true }
			Then("should return quotesCount=1") { q!!.quotesCount shouldBe 1 }
			Then("should consume past the delimiter") { r.remaining shouldBe "" }
		}

		Scenario("given escaped quotes in dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\\\"B\\\"C`") { r = FormattedStringReader("A\\\"B\\\"C") }
			When("nextQuoted is called") { q = r.nextQuoted(dumb = true) }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return unescaped") { q!!.inner shouldBe "A\\\"B\\\"C" }
			Then("should return the original") { q!!.original shouldBe "A\\\"B\\\"C" }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
		}

		Scenario("given escaped quotes in non-dumb mode") {
			lateinit var r: FormattedStringReader
			var q: QuotedResult? = null

			Given("input = `A\\\"B\\\"C`") { r = FormattedStringReader("A\\\"B\\\"C") }
			When("nextQuoted is called") { q = r.nextQuoted() }
			Then("should return non-null") { q shouldNotBe null }
			Then("should return escaped") { q!!.inner shouldBe "A\"B\"C" }
			Then("should return the original") { q!!.original shouldBe "A\\\"B\\\"C" }
			Then("should return quotesCount=0") { q!!.quotesCount shouldBe 0 }
		}
	}
})
