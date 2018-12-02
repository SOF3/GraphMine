package io.github.sof3.graphmine.i18n

import io.github.sof3.graphmine.util.KtsLoader
import java.io.InputStreamReader

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

interface I18n {
	operator fun get(locale: String): String
}

inline fun <reified T : LangSpec<T>> loadLangScript(locales: Iterable<String>) {
	for (locale in locales) {
		KtsLoader.load<T>(InputStreamReader(T::class.java.getResourceAsStream("$locale.lang.kts")))
	}
}