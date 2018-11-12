package io.github.sof3.graphmine.i18n

import com.sun.org.apache.xpath.internal.Arg

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

class SpecI18nable internal constructor(val map: Map<String, LangSpec<*>>, val path: Array<String>, val arg: Any?) : I18nable {
	override fun get(locale: String): String {
		getFromSpec(map[locale]).run {
			if (this != null) return this
		}

		map.forEach { (_, spec) ->
			getFromSpec(spec).run {
				if (this != null) return this
			}
		}

		return path.joinToString(".")
	}

	private fun getFromSpec(spec: LangSpec<*>?): String? {
		if (spec == null) return null
		var parent: LangSpec<*> = spec
		for (i in 0 until path.size - 1) {
			parent = parent.g[path[i]] ?: return null
		}
		return parent.m[path.last()]?.invoke(arg)
	}
}
