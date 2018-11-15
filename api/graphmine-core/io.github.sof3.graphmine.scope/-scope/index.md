---
title: Scope - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.scope](../index.html) / [Scope](./index.html)

# Scope

`interface Scope`

A Scope represents some period of persistence. Features are enabled only during the scope is not disposed. Builtin scopes include:

* Server scope: Until the server is stopped
* Player scope: Until the player leaves the server
* Plugin scope: While the plugin is enabled
* World scope: While the world is loaded
* World partition scope: While the world partition is loaded

Plugins may create their own scopes too, e.g. a Hunger Games plugin may create a scope that lasts during the Hunger Games tournament

### Properties

| [isDisposed](is-disposed.html) | `abstract val isDisposed: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>whether the scope has been disposed |
| [name](name.html) | `abstract val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [addOnDispose](add-on-dispose.html) | `abstract fun addOnDispose(fn: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds an action to execute when the scope is disposed |

### Inheritors

| [BaseScope](../-base-scope/index.html) | `open class BaseScope : `[`Scope`](./index.html)`, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Scope`](./index.html)`>`<br>Basic implementation of BaseScope |
