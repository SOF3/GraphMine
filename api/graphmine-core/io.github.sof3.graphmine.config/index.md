---
title: io.github.sof3.graphmine.config - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.config](./index.html)

## Package io.github.sof3.graphmine.config

### Types

| [ConfigEntryDelegate](-config-entry-delegate/index.html) | `class ConfigEntryDelegate<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`ConfigSpec`](-config-spec/index.html)`, `[`T`](-config-entry-delegate/index.html#T)`>`<br>The delegate class to a config entry |
| [ConfigGroupSpec](-config-group-spec/index.html) | `abstract class ConfigGroupSpec<Self : `[`ConfigGroupSpec`](-config-group-spec/index.html)`<`[`Self`](-config-group-spec/index.html#Self)`>> : `[`ConfigSpec`](-config-spec/index.html)<br>Superclass of type specifications of groups in a [ConfigSpec](-config-spec/index.html) |
| [ConfigSpec](-config-spec/index.html) | `abstract class ConfigSpec`<br>Superclass for type specifications of .kts config files |
| [CoreConfig](-core-config/index.html) | `class CoreConfig : `[`ConfigSpec`](-config-spec/index.html)<br>Model for the server config.yml |
| [ServerConfig](-server-config/index.html) | `class ServerConfig : `[`ConfigGroupSpec`](-config-group-spec/index.html)`<`[`ServerConfig`](-server-config/index.html)`>`<br>Settings for the server |
| [SimpleConfigEntry](-simple-config-entry/index.html) | `class SimpleConfigEntry<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` |

### Exceptions

| [ConfigException](-config-exception/index.html) | `open class ConfigException : `[`RuntimeException`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)<br>Thrown when a config has some problems |
| [ConfigMissingException](-config-missing-exception/index.html) | `open class ConfigMissingException : `[`ConfigException`](-config-exception/index.html)<br>Thrown when a required entry is missing from a config |
| [ConfigValidationException](-config-validation-exception/index.html) | `open class ConfigValidationException : `[`ConfigException`](-config-exception/index.html)<br>Thrown when an entry from a config is invalid |

