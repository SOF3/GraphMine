---
title: ConfigGroupSpec - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigGroupSpec](./index.html)

# ConfigGroupSpec

`abstract class ConfigGroupSpec<Self : `[`ConfigGroupSpec`](./index.html)`<`[`Self`](index.html#Self)`>> : `[`ConfigSpec`](../-config-spec/index.html)

Superclass of type specifications of groups in a [ConfigSpec](../-config-spec/index.html)

**See Also**

[ConfigSpec.group](../-config-spec/group.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `ConfigGroupSpec()`<br>Superclass of type specifications of groups in a [ConfigSpec](../-config-spec/index.html) |

### Functions

| [invoke](invoke.html) | `operator fun invoke(fn: `[`Self`](index.html#Self)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| [checkAll](../-config-spec/check-all.html) | `fun checkAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Validates the whole config |
| [entry](../-config-spec/entry.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(validator: (`[`T`](../-config-spec/entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](../-config-spec/entry.html#T)`>`<br>Declares a required entry`fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(default: `[`T`](../-config-spec/entry.html#T)`, validator: (`[`T`](../-config-spec/entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](../-config-spec/entry.html#T)`>`<br>Declares an entry with a default value |
| [group](../-config-spec/group.html) | `fun <G : `[`ConfigGroupSpec`](./index.html)`<`[`G`](../-config-spec/group.html#G)`>> group(group: `[`G`](../-config-spec/group.html#G)`): `[`GroupDelegate`](../-config-spec/-group-delegate/index.html)`<`[`G`](../-config-spec/group.html#G)`>`<br>Config groups should be included by delegation to this call |

### Inheritors

| [ServerConfig](../-server-config/index.html) | `class ServerConfig : `[`ConfigGroupSpec`](./index.html)`<`[`ServerConfig`](../-server-config/index.html)`>`<br>Settings for the server |

