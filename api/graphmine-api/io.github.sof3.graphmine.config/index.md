---
title: io.github.sof3.graphmine.config - graphmine-api
---

[graphmine-api](../index.html) / [io.github.sof3.graphmine.config](./index.html)

## Package io.github.sof3.graphmine.config

### Types

| [ConfigEntryDelegate](-config-entry-delegate/index.html) | `interface ConfigEntryDelegate<T> : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`ConfigSpec`](-config-spec/index.html)`, `[`T`](-config-entry-delegate/index.html#T)`>` |
| [ConfigGroupSpec](-config-group-spec/index.html) | `abstract class ConfigGroupSpec<Self : `[`ConfigGroupSpec`](-config-group-spec/index.html)`<`[`Self`](-config-group-spec/index.html#Self)`>> : `[`ConfigSpec`](-config-spec/index.html) |
| [ConfigSpec](-config-spec/index.html) | `abstract class ConfigSpec` |
| [CoreConfig](-core-config/index.html) | `class CoreConfig : `[`ConfigSpec`](-config-spec/index.html)<br>Model for the server config.yml |
| [ServerConfig](-server-config/index.html) | `class ServerConfig : `[`ConfigGroupSpec`](-config-group-spec/index.html)`<`[`ServerConfig`](-server-config/index.html)`>` |
| [SimpleConfigEntry](-simple-config-entry/index.html) | `class SimpleConfigEntry<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` |
| [SimpleConfigEntryDelegate](-simple-config-entry-delegate/index.html) | `class SimpleConfigEntryDelegate<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ConfigEntryDelegate`](-config-entry-delegate/index.html)`<`[`T`](-simple-config-entry-delegate/index.html#T)`>` |

