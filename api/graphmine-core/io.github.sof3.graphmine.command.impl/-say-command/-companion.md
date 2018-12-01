---
title: SayCommand.Companion - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command.impl](../index.html) / [SayCommand](index.html) / [Companion](./-companion.html)

# Companion

`companion object Companion : `[`Command`](../../io.github.sof3.graphmine.command/-command/index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>`

### Inherited Properties

| [aliases](../../io.github.sof3.graphmine.command/-command/aliases.html) | `var aliases: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [description](../../io.github.sof3.graphmine.command/-command/description.html) | `var description: I18n` |
| [handlers](../../io.github.sof3.graphmine.command/-command/handlers.html) | `val handlers: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<suspend (`[`CommandExecutor`](../../io.github.sof3.graphmine.command/-command-executor/index.html)`<`[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, `[`CommandSender`](../../io.github.sof3.graphmine.command/-command-sender.html)`, `[`C`](../../io.github.sof3.graphmine.command/-command/index.html#C)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [name](../../io.github.sof3.graphmine.command/-command/name.html) | `lateinit var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [overloads](../../io.github.sof3.graphmine.command/-command/overloads.html) | `val overloads: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`RegisteredOverload`](../../io.github.sof3.graphmine.command/-registered-overload/index.html)`>` |

### Inherited Functions

| [execute](../../io.github.sof3.graphmine.command/-command/execute.html) | `suspend fun execute(arg: `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, by: `[`CommandSender`](../../io.github.sof3.graphmine.command/-command-sender.html)`, receiver: `[`CommandReceiver`](../../io.github.sof3.graphmine.command/-command-receiver/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [handle](../../io.github.sof3.graphmine.command/-command/handle.html) | `fun <A : `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, S : `[`CommandSender`](../../io.github.sof3.graphmine.command/-command-sender.html)`> handle(fn: suspend `[`CommandExecutor`](../../io.github.sof3.graphmine.command/-command-executor/index.html)`<`[`A`](../../io.github.sof3.graphmine.command/-command/handle.html#A)`, `[`S`](../../io.github.sof3.graphmine.command/-command/handle.html#S)`, `[`C`](../../io.github.sof3.graphmine.command/-command/index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

