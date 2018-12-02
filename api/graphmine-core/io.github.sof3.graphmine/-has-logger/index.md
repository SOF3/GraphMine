---
title: HasLogger - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine](../index.html) / [HasLogger](./index.html)

# HasLogger

`interface HasLogger`

This interface only exists to avoid the boilerplate of calling the logger.

### Properties

| [locale](locale.html) | `abstract val locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [logger](logger.html) | `abstract val logger: Logger`<br>The logger for this object |

### Functions

| [debug](debug.html) | `open fun debug(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a DEBUG-level message |
| [error](error.html) | `open fun error(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a ERROR-level message |
| [fatal](fatal.html) | `open fun fatal(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a FATAL-level message |
| [info](info.html) | `open fun info(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a INFO-level message |
| [warn](warn.html) | `open fun warn(i18n: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Logs a WARN-level message |

### Inheritors

| [Server](../-server/index.html) | `class Server : `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)`, `[`HasLogger`](./index.html)<br>The Server should be the object that links up different components of the server. |

