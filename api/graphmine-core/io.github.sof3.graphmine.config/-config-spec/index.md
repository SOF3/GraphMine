---
title: ConfigSpec - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigSpec](./index.html)

# ConfigSpec

`abstract class ConfigSpec`

Superclass for type specifications of .kts config files

### Types

| [GroupDelegate](-group-delegate/index.html) | `inner class GroupDelegate<G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](-group-delegate/index.html#G)`>>`<br>Used in property delegation. Config groups are included in the parent group by property delegation. |

### Constructors

| [&lt;init&gt;](-init-.html) | `ConfigSpec()`<br>Superclass for type specifications of .kts config files |

### Functions

| [checkAll](check-all.html) | `fun checkAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Validates the whole config |
| [entry](entry.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>`<br>Declares a required entry`fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(default: `[`T`](entry.html#T)`, validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>`<br>Declares an entry with a default value |
| [group](group.html) | `fun <G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](group.html#G)`>> group(group: `[`G`](group.html#G)`): `[`GroupDelegate`](-group-delegate/index.html)`<`[`G`](group.html#G)`>`<br>Config groups should be included by delegation to this call |

### Inheritors

| [ConfigGroupSpec](../-config-group-spec/index.html) | `abstract class ConfigGroupSpec<Self : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`Self`](../-config-group-spec/index.html#Self)`>> : `[`ConfigSpec`](./index.html)<br>Superclass of type specifications of groups in a [ConfigSpec](./index.html) |
| [CoreConfig](../-core-config/index.html) | `class CoreConfig : `[`ConfigSpec`](./index.html)<br>Model for the server config.yml |

