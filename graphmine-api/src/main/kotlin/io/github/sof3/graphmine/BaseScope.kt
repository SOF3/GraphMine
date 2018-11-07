package io.github.sof3.graphmine

import kotlin.reflect.KProperty

class BaseScope : Scope {
	override var disposed = false
		private set

	private val disposalHooks = mutableListOf<() -> Unit>()

	@Suppress("OVERRIDE_BY_INLINE")
	override fun addOnDispose(fn: () -> Unit) {
		disposalHooks.add(fn)
	}

	fun dispose() {
		disposed = true
		disposalHooks.forEach { it() }
	}

	private val exposed = object : Scope {
		override val disposed get() = this@BaseScope.disposed
		override fun addOnDispose(fn: () -> Unit) = this@BaseScope.addOnDispose(fn)
	}

	operator fun getValue(thisRef: Any, prop: KProperty<*>) = exposed
}
