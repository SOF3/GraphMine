---
title: ConfigException - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigException](./index.html)

# ConfigException

`open class ConfigException : `[`RuntimeException`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)

Thrown when a config has some problems

### Parameters

`message` - the detailed exception message

### Constructors

| [&lt;init&gt;](-init-.html) | `ConfigException(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Thrown when a config has some problems |

### Inheritors

| [ConfigMissingException](../-config-missing-exception/index.html) | `open class ConfigMissingException : `[`ConfigException`](./index.html)<br>Thrown when a required entry is missing from a config |
| [ConfigValidationException](../-config-validation-exception/index.html) | `open class ConfigValidationException : `[`ConfigException`](./index.html)<br>Thrown when an entry from a config is invalid |

