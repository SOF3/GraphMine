---
title: VersionCommand - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.command.impl](index.html) / [VersionCommand](./-version-command.html)

# VersionCommand

`object VersionCommand : `[`Command`](../io.github.sof3.graphmine.command/-command/index.html)`<`[`Server`](../io.github.sof3.graphmine/-server/index.html)`>`

### Inherited Properties

| [aliases](../io.github.sof3.graphmine.command/-command/aliases.html) | `var aliases: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>The list of aliases |
| [description](../io.github.sof3.graphmine.command/-command/description.html) | `var description: I18n`<br>The description of the command, shown in action lists like /help. |
| [name](../io.github.sof3.graphmine.command/-command/name.html) | `lateinit var name: Qualifier`<br>The qualified name of the command. |
| [scope](../io.github.sof3.graphmine.command/-command/scope.html) | `lateinit var scope: `[`C`](../io.github.sof3.graphmine.command/-command/index.html#C) |

### Inherited Functions

| [dispatch](../io.github.sof3.graphmine.command/-command/dispatch.html) | `fun dispatch(reader: FormattedStringReader, sender: `[`CommandSender`](../io.github.sof3.graphmine.command/-command-sender.html)`, receiver: `[`CommandReceiver`](../io.github.sof3.graphmine.command/-command-receiver/index.html)`): Job`<br>Executes the command. |
| [handle](../io.github.sof3.graphmine.command/-command/handle.html) | `fun <A : `[`Overload`](../io.github.sof3.graphmine.command/-overload/index.html)`, S : `[`CommandSender`](../io.github.sof3.graphmine.command/-command-sender.html)`> handle(fn: suspend `[`CommandExecutor`](../io.github.sof3.graphmine.command/-command-executor/index.html)`<`[`A`](../io.github.sof3.graphmine.command/-command/handle.html#A)`, `[`S`](../io.github.sof3.graphmine.command/-command/handle.html#S)`, `[`C`](../io.github.sof3.graphmine.command/-command/index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds a handler to the command. |

