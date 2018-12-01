---
title: BaseScope - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.scope](../index.html) / [BaseScope](./index.html)

# BaseScope

`open class BaseScope : `[`Scope`](../-scope/index.html)

Basic implementation of BaseScope

### Constructors

| [&lt;init&gt;](-init-.html) | `BaseScope(klass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parent: `[`BaseScope`](./index.html)`? = null)`<br>`BaseScope(klass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, parent: `[`BaseScope`](./index.html)`? = null)``BaseScope(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, parent: `[`BaseScope`](./index.html)`? = null)`<br>Basic implementation of BaseScope |

### Properties

| [coroutineContext](coroutine-context.html) | `open val coroutineContext: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [isDisposed](is-disposed.html) | `open var isDisposed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>whether the scope has been disposed |
| [name](name.html) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parent](parent.html) | `val parent: `[`BaseScope`](./index.html)`?` |

### Functions

| [addOnDispose](add-on-dispose.html) | `open fun addOnDispose(fn: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds an action to execute when the scope is disposed |
| [dispose](dispose.html) | `open fun dispose(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Marks the scope as disposed. |

