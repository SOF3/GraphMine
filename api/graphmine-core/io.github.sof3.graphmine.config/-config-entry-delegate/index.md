---
title: ConfigEntryDelegate - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigEntryDelegate](./index.html)

# ConfigEntryDelegate

`class ConfigEntryDelegate<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`ConfigSpec`](../-config-spec/index.html)`, `[`T`](index.html#T)`>`

The delegate class to a config entry

**See Also**

[ConfigSpec.entry](../-config-spec/entry.html)

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`ConfigSpec`](../-config-spec/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`T`](index.html#T) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`ConfigSpec`](../-config-spec/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`T`](index.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

