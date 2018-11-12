package io.github.sof3.graphmine.i18n.core

import io.github.sof3.graphmine.i18n.loadLangScript

object CoreLangLoader {
	init {
		System.setProperty("idea.io.use.fallback", "true")
	}

	val availableLocales = listOf(
			"en_US"
	)

	fun loadCoreLang() = loadLangScript<CoreLang>(availableLocales)
}
