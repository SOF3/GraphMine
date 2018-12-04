---
title: Server - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine](../index.html) / [Server](./index.html)

# Server

`class Server : `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)`, `[`HasLogger`](../-has-logger/index.html)

The Server should be the object that links up different components of the server.

To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.

### Constructors

| [&lt;init&gt;](-init-.html) | `Server(dataDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html)`, signalFlux: Flux<`[`TerminalSignal`](../../io.github.sof3.graphmine.command/-terminal-signal/index.html)`>, initNano: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = System.nanoTime(), scope: `[`BaseScope`](../../io.github.sof3.graphmine.scope/-base-scope/index.html)` = BaseScope(Server::class))`<br>The Server should be the object that links up different components of the server. |

### Properties

| [commandMap](command-map.html) | `val commandMap: `[`CommandMap`](../../io.github.sof3.graphmine.command/-command-map/index.html)<br>Stores the list of server-wide commands |
| [config](config.html) | `val config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html)<br>the server config |
| [dataDir](data-dir.html) | `val dataDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)<br>the server data directory |
| [locale](locale.html) | `val locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the default locale of the server. |
| [logger](logger.html) | `val logger: Logger`<br>the logger used for the server scope. Plugins should use their own logger instead of this one. |
| [shutdownHandlers](shutdown-handlers.html) | `val shutdownHandlers: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>List of [Runnable](http://docs.oracle.com/javase/6/docs/api/java/lang/Runnable.html)s that are called when the server shuts down |
| [signalFlux](signal-flux.html) | `val signalFlux: Flux<`[`TerminalSignal`](../../io.github.sof3.graphmine.command/-terminal-signal/index.html)`>`<br>a [Flux](#) providing terminal signals |

### Functions

| [handleSignal](handle-signal.html) | `fun handleSignal(signal: `[`TerminalSignal`](../../io.github.sof3.graphmine.command/-terminal-signal/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Handles a terminal signal |
| [shutdown](shutdown.html) | `fun shutdown(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| [debug](../-has-logger/debug.html) | `open fun debug(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a DEBUG-level message |
| [error](../-has-logger/error.html) | `open fun error(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a ERROR-level message |
| [fatal](../-has-logger/fatal.html) | `open fun fatal(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a FATAL-level message |
| [info](../-has-logger/info.html) | `open fun info(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a INFO-level message |
| [warn](../-has-logger/warn.html) | `open fun warn(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a WARN-level message |

