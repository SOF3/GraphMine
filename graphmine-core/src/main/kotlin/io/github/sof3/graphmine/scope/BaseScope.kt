package io.github.sof3.graphmine.scope

import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext
import kotlin.reflect.KClass

/**
 * Basic implementation of BaseScope
 */
open class BaseScope(final override val name: String, val parent: BaseScope? = null) : Scope {
	constructor(klass: KClass<out Any>, name: String, parent: BaseScope? = null) : this("${klass.qualifiedName}:$name", parent)
	constructor(klass: KClass<out Any>, parent: BaseScope? = null) : this(klass.qualifiedName!!, parent)

	override var isDisposed = false
		protected set

	private var disposalHooks = mutableListOf<() -> Unit>()

	override val coroutineContext: CoroutineContext
		get() = if (parent != null) parent.coroutineContext + Job() else Job()

	@Suppress("OVERRIDE_BY_INLINE")
	override fun addOnDispose(fn: () -> Unit) {
		disposalHooks.add(fn)
	}

	/**
	 * Marks the scope as disposed.
	 */
	open fun dispose() {
		isDisposed = true

		disposalHooks.forEach { it() }
	}
}
