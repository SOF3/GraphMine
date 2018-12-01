package io.github.sof3.graphmine.i18n.core

import io.github.sof3.graphmine.i18n.GroupSpec
import io.github.sof3.graphmine.i18n.I18n
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

object CoreLang : LangSpec<CoreLang>() {
	val serverName by accept<Unit>()

	val startup by group(Startup)

	object Startup : GroupSpec<Startup>() {
		val version by accept<VersionArg>()

		data class VersionArg(val version: String, val ip: String, val port: Int)

		val complete by accept<CompleteArg>()

		data class CompleteArg(val nano: Long)
	}

	val commands by group(Commands)

	object Commands : GroupSpec<Commands>() {
		val generic by group(Generic)

		object Generic : GroupSpec<Generic>() {
			val notFound by accept<NotFoundArg>()

			data class NotFoundArg(val command: String)

			val wrongSyntax by accept<WrongSyntaxArg>()

			data class WrongSyntaxArg(val command: String, val syntax: List<I18n>)
		}

		val version by group(Version)

		object Version : GroupSpec<Version>() {
			val description by accept<Unit>()
		}
	}
}
