---
title: CommandMap - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandMap](./index.html)

# CommandMap

`class CommandMap`

Stores a list of commands. This class can also be instantiated at individual commands to provide a sub-command list.

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandMap()`<br>Stores a list of commands. This class can also be instantiated at individual commands to provide a sub-command list. |

### Functions

| [addCommand](add-command.html) | `fun <C : `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)`> addCommand(command: `[`Command`](../-command/index.html)`<`[`C`](add-command.html#C)`>, scope: `[`C`](add-command.html#C)`): `[`CommandMap`](./index.html)<br>Adds a command to the map. |
| [dispatch](dispatch.html) | `fun dispatch(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, by: `[`CommandSender`](../-command-sender.html)`, to: `[`CommandReceiver`](../-command-receiver/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Dispatches a command. This function should only be used when the command name is unknown. |

