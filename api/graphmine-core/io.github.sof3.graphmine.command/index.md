---
title: io.github.sof3.graphmine.command - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.command](./index.html)

## Package io.github.sof3.graphmine.command

### Types

| [Command](-command/index.html) | `abstract class Command<C : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>This class represents a command type. Each instance of Command should represent one registered command. |
| [CommandExecutor](-command-executor/index.html) | `class CommandExecutor<A : `[`Overload`](-overload/index.html)`, S : `[`CommandSender`](-command-sender.html)`, C>` |
| [CommandMap](-command-map/index.html) | `class CommandMap` |
| [CommandReceiver](-command-receiver/index.html) | `interface CommandReceiver` |
| [CommandSender](-command-sender.html) | `interface CommandSender` |
| [EmptyOverload](-empty-overload/index.html) | `class EmptyOverload : `[`Overload`](-overload/index.html) |
| [Overload](-overload/index.html) | `abstract class Overload` |
| [RegisteredOverload](-registered-overload/index.html) | `class RegisteredOverload` |

### Exceptions

| [CommandException](-command-exception/index.html) | `abstract class CommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, I18nable` |
| [CommandNotFoundException](-command-not-found-exception/index.html) | `class CommandNotFoundException : `[`CommandException`](-command-exception/index.html) |
| [WrongSyntaxException](-wrong-syntax-exception/index.html) | `class WrongSyntaxException : `[`CommandException`](-command-exception/index.html) |

