package io.github.sof3.graphmine.i18n.core

import io.github.sof3.graphmine.i18n.GroupSpec
import io.github.sof3.graphmine.i18n.LangSpec

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

infix fun String.translateCore(fn: CoreLang.() -> Unit) = CoreLang().apply {
	locale = this@translateCore
	this.fn()
}

class CoreLang : LangSpec<CoreLang>() {
	val serverName by accept<Unit>()

	val startup by group(Startup())

	class Startup : GroupSpec<Startup>() {
		val version by accept<VersionArg>()

		data class VersionArg(val version: String, val ip: String, val port: Int)
	}
}
