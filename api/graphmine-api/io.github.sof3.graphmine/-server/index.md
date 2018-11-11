---
title: Server - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine](../index.html) / [Server](./index.html)

# Server

`interface Server`

The Server should be the object that links up different components of the server.

To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.

### Properties

| [config](config.html) | `abstract val config: `[`Config`](../../io.github.sof3.graphmine.config/-config/index.html)<br>the server config. |
| [features](features.html) | `abstract val features: `[`FeatureGraph`](../../io.github.sof3.graphmine.feature/-feature-graph/index.html)<br>the feature graph of the server. "Events" should be handled via the feature graph. |
| [logger](logger.html) | `abstract val logger: Logger`<br>the logger used for the server context. Plugins should use their own logger instead of this one. |
| [scope](scope.html) | `abstract val scope: `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)<br>the server scope, which only gets disposed when the server shuts down. |

