package io.github.sof3.graphmine.i18n

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

interface I18nable {
	fun express(locale: String): String
}

class StringI18nable(val backing: String) : I18nable {
	override fun express(locale: String) = backing
}

val String.i18n get() = StringI18nable(this)

class JointI18nable(vararg val pieces: I18nable) : I18nable {
	override fun express(locale: String): String {
		val output = StringBuilder()
		for (piece in pieces) {
			output.append(piece.express(locale))
		}
		return output.toString()
	}
}

class GluedJointI18nable(val glue: I18nable, val pieces: List<I18nable>) : I18nable {
	override fun express(locale: String): String {
		val output = StringBuilder()
		var first = true
		for (piece in pieces) {
			if (!first) output.append(glue.express(locale))
			first = false
			output.append(piece.express(locale))
		}
		return output.toString()
	}
}
