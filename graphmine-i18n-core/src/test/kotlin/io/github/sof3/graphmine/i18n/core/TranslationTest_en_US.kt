package io.github.sof3.graphmine.i18n.core

import io.github.sof3.graphmine.i18n.LangSpec
import io.github.sof3.graphmine.i18n.core.CoreLangLoader.loadCoreLang
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.spekframework.spek2.style.gherkin.ScenarioBody
import kotlin.test.assertEquals

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

object TranslationTest_en_US : Spek({
	fun <Arg> ScenarioBody.expect(decl: LangSpec<CoreLang>.Declaration<Arg>, arg: Arg, expected: String) {
		lateinit var actual: String
		Given(decl.path.joinToString(".") + " with " + arg.toString()) { actual = decl.i18n(arg)["en_US"] }
		Then("Translation should be \"$expected\"") { assertEquals(expected, actual) }
	}
	Feature("GraphMine en_US translation") {
		val lang by memoized { loadCoreLang() }

		fun ScenarioBody.expect(decl: LangSpec<CoreLang>.Declaration<Unit>, s: String) =
				expect(decl, Unit, s)

		Scenario("serverName") { expect(lang.serverName, "GraphMine") }
	}
})

