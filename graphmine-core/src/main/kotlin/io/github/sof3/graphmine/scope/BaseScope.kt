package io.github.sof3.graphmine.scope

import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext
import kotlin.reflect.KClass

/**
 * Basic implementation of BaseScope
 *
 * @property name the scope name
 * @property parent the parent scope (if any)
 */
open class BaseScope(final override val name: String, val parent: BaseScope? = null) : Scope {
	/**
	 * @param klass the class to be used in the scope name
	 * @param name the scope name
	 * @param parent the parent scope (if any)
	 */
	constructor(klass: KClass<out Any>, name: String, parent: BaseScope? = null) : this("${klass.qualifiedName}:$name", parent)

	/**
	 * @param klass the class to be used in the scope name
	 * @param parent the parent scope (if any)
	 */
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
