package io.github.sof3.graphmine.util

import org.apache.commons.io.IOUtils
import org.apache.commons.io.input.TeeInputStream
import java.io.*
import java.security.DigestOutputStream
import java.security.MessageDigest
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
	 * Loads a .kts file, optionally from cache and stores to cache
	 *
	 * @param T the type
	 */
	inline fun <reified T : KtsBin<T, F>, F : KtsBin.Factory<T, F>> loadSerializable(factory: F, fis: InputStream, path: String, cacheDir: File, rVersion: Int): T {
		cacheDir.mkdirs()
		val cacheFile = File(cacheDir, "kts-" + path.hashCode().toString(16))

		val digestBuf = ByteArrayOutputStream()
		val digest = DigestOutputStream(digestBuf, MessageDigest.getInstance("MD5")!!)
		val tee = TeeInputStream(fis, digest)

		val raw = ByteArrayOutputStream()
		tee.use { IOUtils.copy(tee, raw) }

		val md5 = digestBuf.toByteArray()!!
		assert(md5.size == 16)
		val load = loadCache(md5, cacheFile, rVersion) { factory.read(it) }
		if (load != null) return load
		val loaded = load<T>(StringReader(String(raw.toByteArray())))
		writeCache(cacheFile, md5, rVersion, loaded)
		return loaded
	}

	fun <T> loadCache(md5: ByteArray, cacheFile: File, rVersion: Int, read: (DataInputStream) -> T): T? {
		if (!cacheFile.isFile) return null
		return DataInputStream(FileInputStream(cacheFile)).use {
			val buffer = ByteArray(16)
			it.read(buffer)
			if (!buffer.contentEquals(md5)) return null
			val version = it.readInt()
			if (version != rVersion) return null
			read(it)
		}
	}

	fun writeCache(cacheFile: File, md5: ByteArray, rVersion: Int, value: KtsBin<*, *>) {
		return DataOutputStream(FileOutputStream(cacheFile)).use {
			it.write(md5)
			it.writeInt(rVersion)
			value.write(it)
		}
	}

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
