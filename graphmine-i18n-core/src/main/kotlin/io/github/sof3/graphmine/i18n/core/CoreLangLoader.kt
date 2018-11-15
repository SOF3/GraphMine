package io.github.sof3.graphmine.i18n.core

import io.github.sof3.graphmine.i18n.loadLangScript

val availableLocales = listOf(
		"en_US"
)

fun loadCoreLang() {
	loadLangScript<CoreLang>(availableLocales)
}
