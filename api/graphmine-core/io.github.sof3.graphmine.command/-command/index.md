---
title: Command - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Command](./index.html)

# Command

`abstract class Command<C : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

This class represents a command type. Each instance of Command should represent one registered command.

Subclasses must initialize the "name" property.

### Constructors

| [&lt;init&gt;](-init-.html) | `Command(fn: `[`Command`](./index.html)`<`[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>This class represents a command type. Each instance of Command should represent one registered command. |

### Properties

| [aliases](aliases.html) | `var aliases: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [description](description.html) | `var description: I18n` |
| [handlers](handlers.html) | `val handlers: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<suspend (`[`CommandExecutor`](../-command-executor/index.html)`<`[`Overload`](../-overload/index.html)`, `[`CommandSender`](../-command-sender.html)`, `[`C`](index.html#C)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [name](name.html) | `lateinit var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [overloads](overloads.html) | `val overloads: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`RegisteredOverload`](../-registered-overload/index.html)`>` |

### Functions

| [execute](execute.html) | `suspend fun execute(arg: `[`Overload`](../-overload/index.html)`, by: `[`CommandSender`](../-command-sender.html)`, receiver: `[`CommandReceiver`](../-command-receiver/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [handle](handle.html) | `fun <A : `[`Overload`](../-overload/index.html)`, S : `[`CommandSender`](../-command-sender.html)`> handle(fn: suspend `[`CommandExecutor`](../-command-executor/index.html)`<`[`A`](handle.html#A)`, `[`S`](handle.html#S)`, `[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| [Companion](../../io.github.sof3.graphmine.command.impl/-say-command/-companion.html) | `companion object Companion : `[`Command`](./index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>` |
| [HelpCommand](../../io.github.sof3.graphmine.command.impl/-help-command.html) | `object HelpCommand : `[`Command`](./index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>` |
| [VersionCommand](../../io.github.sof3.graphmine.command.impl/-version-command.html) | `object VersionCommand : `[`Command`](./index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>` |

