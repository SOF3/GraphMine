package io.github.sof3.graphmine.util

import org.spekframework.spek2.dsl.TestBody
import org.spekframework.spek2.style.gherkin.ScenarioBody
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

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

infix fun <T> Ref<T>.shouldBe(expected: T) = assertEquals(expected, value)
infix fun <T> Ref<T>.shouldNotBe(expected: T) = assertNotEquals(expected, value)
infix fun <T> T.shouldBe(expected: T) = assertEquals(expected, this)
infix fun <T> T.shouldNotBe(expected: T) = assertNotEquals(expected, this)

private typealias InScenarioBody = ScenarioBody.() -> Unit

//inline fun ScenarioBody.If(condition: String, boolean: Boolean, then: InScenarioBody, or: InScenarioBody) {
//	if (boolean) {
//		When("\"$condition\" is true") {}
//		then(this)
//	} else {
//		When("\"$condition\" is false", {})
//		or(this)
//	}
//}

inline fun <T, C> ScenarioBody.GivenRandom(
		lengths: IntRange,
		crossinline stringToParam: (String) -> T,
		crossinline ctx: () -> C,
		name: String = "random strings of length [${lengths.start}, ${lengths.endInclusive}]",
		eachTimes: Int = 10,
		charset: List<Char> = ALPHA_NUMERAL,
		crossinline then: RandomContext<T, C>.() -> Unit
) {
	val list = mutableListOf<Triple<String, T, Ref<C>>>()
	Given(name) {
		randomRegularStrings(lengths, eachTimes, charset) { list += Triple(it, stringToParam(it), Ref(ctx())) }
	}
	val context = RandomContext<T, C>().apply(then)
	context.runs.forEach { it(this, list) }
}

typealias RandomTest<T, C> = TestBody.(String, T, Ref<C>) -> Unit
private typealias RandomContextParam<T, C> = List<Triple<String, T, Ref<C>>>

class RandomContext<T, C> {
	val runs = mutableListOf<ScenarioBody.(RandomContextParam<T, C>) -> Unit>()

	inline fun When(description: String, crossinline fn: RandomTest<T, C>) {
		runs.add { list -> When(description) { list.forEach { fn(it.first, it.second, it.third) } } }
	}

	inline fun Then(description: String, crossinline fn: RandomTest<T, C>) {
		runs.add { list -> Then(description) { list.forEach { fn(it.first, it.second, it.third) } } }
	}

	inline fun And(description: String, crossinline fn: RandomTest<T, C>) {
		runs.add { list -> And(description) { list.forEach { fn(it.first, it.second, it.third) } } }
	}

	inline fun If(
			condition: String, crossinline predicate: (String) -> Boolean,
			thenMessage: String, crossinline then: RandomTest<T, C>,
			orMessage: String, crossinline or: RandomTest<T, C>) {
		runs.add { list ->
			lateinit var t: RandomContextParam<T, C>
			lateinit var f: RandomContextParam<T, C>
			When("\"$condition\" is true") {
				val pair = list.partition { predicate(it.first) }
				t = pair.first
				f = pair.second
			}
			Then(thenMessage) { t.forEach { then(it.first, it.second, it.third) } }
			When("\"$condition\" is false") {}
			Then(orMessage) { f.forEach { or(it.first, it.second, it.third) } }
		}
	}
}

val ALPHA_UPPER = ('A'..'Z').toList()
val ALPHA_LOWER = ('a'..'z').toList()
val NUMERAL = ('0'..'9').toList()
val ALPHA_NUMERAL = ALPHA_UPPER + ALPHA_LOWER + NUMERAL
val ALPHA_NUMERAL_SPACE = ALPHA_NUMERAL + ' '

inline fun randomRegularStrings(
		lengths: IntRange,
		eachTimes: Int,
		charset: List<Char> = ALPHA_NUMERAL,
		fn: (String) -> Unit
) {
	for (length in lengths) {
		repeat(eachTimes) {
			fn(randomRegularString(length, charset))
		}
	}
}

fun randomRegularString(length: Int, charset: List<Char> = ALPHA_NUMERAL): String {
	val chars = CharArray(length)
	repeat(length) { chars[it] = charset[Random.nextInt(charset.size)] }
	return String(chars)
}

fun <T> allPermutations(vararg values: T, yields: Int = values.size, fn: (List<T>) -> Unit) = allPermutations(emptyList(), values.toList(), yields, fn)
fun <T> allPermutations(front: List<T>, values: List<T>, levels: Int, fn: (List<T>) -> Unit) {
	if (levels == 0) {
		fn(front)
		return
	}

	for (i in 0 until values.size) {
		val clone = values.toMutableList()
		val rem = clone.removeAt(i)
		allPermutations(front + rem, clone, levels - 1, fn)
	}
}
