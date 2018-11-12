---
title: CoreConfig - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [CoreConfig](./index.html)

# CoreConfig

`class CoreConfig : `[`ConfigSpec`](../-config-spec/index.html)

Model for the server config.yml

### Constructors

| [&lt;init&gt;](-init-.html) | `CoreConfig(fn: `[`CoreConfig`](./index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>Model for the server config.yml |

### Properties

| [language](language.html) | `var language: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [server](server.html) | `val server: `[`ServerConfig`](../-server-config/index.html) |

### Inherited Properties

| [path](../-config-spec/path.html) | `open val path: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Inherited Functions

| [checkAll](../-config-spec/check-all.html) | `fun checkAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [entry](../-config-spec/entry.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(validator: (`[`T`](../-config-spec/entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](../-config-spec/entry.html#T)`>`<br>`fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(default: `[`T`](../-config-spec/entry.html#T)`, validator: (`[`T`](../-config-spec/entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](../-config-spec/entry.html#T)`>` |
| [group](../-config-spec/group.html) | `fun <G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](../-config-spec/group.html#G)`>> group(g: `[`G`](../-config-spec/group.html#G)`): `[`GroupDelegate`](../-config-spec/-group-delegate/index.html)`<`[`G`](../-config-spec/group.html#G)`>` |

