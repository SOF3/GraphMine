package io.github.sof3.graphmine.i18n

import io.github.sof3.graphmine.util.KtsLoader
import java.io.InputStreamReader

inline fun <reified T : LangSpec<T>> loadLangScript(locales: Iterable<String>) {
	for (locale in locales) {
		KtsLoader.load<T>(InputStreamReader(T::class.java.getResourceAsStream("$locale.lang.kts")))
	}
}
