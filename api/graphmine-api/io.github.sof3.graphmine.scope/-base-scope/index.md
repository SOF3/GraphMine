---
title: BaseScope - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.scope](../index.html) / [BaseScope](./index.html)

# BaseScope

`open class BaseScope : `[`Scope`](../-scope/index.html)`, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Scope`](../-scope/index.html)`>`

Basic implementation of BaseScope

### Constructors

| [&lt;init&gt;](-init-.html) | `BaseScope(klass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`BaseScope(klass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)``BaseScope(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Basic implementation of BaseScope |

### Properties

| [isDisposed](is-disposed.html) | `open var isDisposed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>whether the scope has been disposed |
| [name](name.html) | `val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [addOnDispose](add-on-dispose.html) | `open fun addOnDispose(fn: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds an action to execute when the scope is disposed |
| [dispose](dispose.html) | `open fun dispose(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Marks the scope as disposed. |
| [getValue](get-value.html) | `open operator fun getValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Scope`](../-scope/index.html)<br>Returns a read-only delegate that exposes the Scope methods (.isDisposed and .addOnDispose()) |

