---
title: ConfigSpec - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigSpec](./index.html)

# ConfigSpec

`abstract class ConfigSpec`

### Types

| [GroupDelegate](-group-delegate/index.html) | `inner class GroupDelegate<G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](-group-delegate/index.html#G)`>>` |

### Constructors

| [&lt;init&gt;](-init-.html) | `ConfigSpec()` |

### Properties

| [path](path.html) | `open val path: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Functions

| [checkAll](check-all.html) | `fun checkAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [entry](entry.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>`<br>`fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(default: `[`T`](entry.html#T)`, validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>` |
| [group](group.html) | `fun <G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](group.html#G)`>> group(g: `[`G`](group.html#G)`): `[`GroupDelegate`](-group-delegate/index.html)`<`[`G`](group.html#G)`>` |

### Inheritors

| [ConfigGroupSpec](../-config-group-spec/index.html) | `abstract class ConfigGroupSpec<Self : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`Self`](../-config-group-spec/index.html#Self)`>> : `[`ConfigSpec`](./index.html) |
| [CoreConfig](../-core-config/index.html) | `class CoreConfig : `[`ConfigSpec`](./index.html)<br>Model for the server config.yml |

