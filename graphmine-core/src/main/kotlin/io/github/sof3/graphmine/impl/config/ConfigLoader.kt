package io.github.sof3.graphmine.impl.config

import java.io.File
import java.io.FileReader
import javax.script.ScriptEngineManager

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

object ConfigLoader {
	init {
		System.setProperty("idea.io.use.fallback", "true")
	}

	inline fun <reified T> load(file: File): T {
		val engine = ScriptEngineManager().getEngineByExtension("kts")
		return FileReader(file).use { engine.eval(it) as T }
	}
}
