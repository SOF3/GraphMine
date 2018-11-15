---
title: Server - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine](../index.html) / [Server](./index.html)

# Server

`class Server`

The Server should be the object that links up different components of the server.

To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.

### Parameters

`initNano` - System.nanoTime() when the server start command was created

### Constructors

| [&lt;init&gt;](-init-.html) | `Server(config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html)`, initNano: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = System.nanoTime())`<br>The Server should be the object that links up different components of the server. |

### Properties

| [config](config.html) | `val config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html) |
| [defaultLocale](default-locale.html) | `val defaultLocale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [features](features.html) | `val features: `[`FeatureGraph`](../../io.github.sof3.graphmine.feature/-feature-graph/index.html) |
| [logger](logger.html) | `val logger: Logger` |
| [scope](scope.html) | `val scope: `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html) |

