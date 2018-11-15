package io.github.sof3.graphmine.scope

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

/**
 * Basic implementation of BaseScope
 */
open class BaseScope(final override val name: String) : Scope, ReadOnlyProperty<Any?, Scope> {
	constructor(klass: KClass<out Any>, name: String) : this("${klass.qualifiedName}:$name")
	constructor(klass: KClass<out Any>) : this(klass.qualifiedName!!)

	override var isDisposed = false
		protected set

	private var disposalHooks = mutableListOf<() -> Unit>()

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

	private val exposed = object : Scope {
		override val name: String = this@BaseScope.name
		override val isDisposed get() = this@BaseScope.isDisposed
		override fun addOnDispose(fn: () -> Unit) = this@BaseScope.addOnDispose(fn)
	}

	/**
	 * Returns a read-only delegate that exposes the Scope methods (.isDisposed and .addOnDispose())
	 */
	override operator fun getValue(thisRef: Any?, property: KProperty<*>) = exposed
}
