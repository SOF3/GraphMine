package io.github.sof3.graphmine.i18n

import java.io.InputStreamReader
import javax.script.ScriptEngineManager

val allSpecs: MutableMap<Class<out LangSpec<*>>, MutableMap<String, LangSpec<*>>> = hashMapOf()

inline fun <reified T: LangSpec<T>> loadLangScript(locales: Iterable<String>): T{
	lateinit var lang: T

	val engine = ScriptEngineManager().getEngineByExtension("kts")

	for (locale in locales) {
		InputStreamReader(T::class.java.getResourceAsStream("$locale.lang.kts")).use {
			lang = engine.eval(it) as T
		}
	}
	return lang
}
