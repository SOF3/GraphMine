---
title: SimpleConfigEntryDelegate - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [SimpleConfigEntryDelegate](./index.html)

# SimpleConfigEntryDelegate

`class SimpleConfigEntryDelegate<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ConfigEntryDelegate`](../-config-entry-delegate/index.html)`<`[`T`](index.html#T)`>`

### Properties

| [name](name.html) | `lateinit var name: () -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [set](set.html) | `var set: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`ConfigSpec`](../-config-spec/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`T`](index.html#T) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`ConfigSpec`](../-config-spec/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`T`](index.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

