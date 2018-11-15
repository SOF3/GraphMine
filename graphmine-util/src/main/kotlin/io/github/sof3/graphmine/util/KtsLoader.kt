package io.github.sof3.graphmine.util

import java.io.File
import java.io.FileReader
import java.io.Reader
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

/**
 * State object to ensure system properties are set before loading a script
 */
object KtsLoader {
	init {
		System.setProperty("idea.io.use.fallback", "true")
	}

	/**
	 * Loads a script from a file
	 *
	 * @param R the expected return type from the script
	 * @return the value in the script
	 */
	inline fun <reified R> load(file: File): R = load(FileReader(file))

	/**
	 * Loads a script from a reader
	 *
	 * @param R the expected return type from the script
	 * @return the value in the script
	 */
	inline fun <reified R> load(reader: Reader): R {
		val engine = ScriptEngineManager().getEngineByExtension("kts")
		return reader.use { engine.eval(it) as R }
	}
}
