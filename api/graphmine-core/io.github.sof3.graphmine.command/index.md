---
title: io.github.sof3.graphmine.command - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.command](./index.html)

## Package io.github.sof3.graphmine.command

This package contains the API for declaring commands.

### Types

| [Command](-command/index.html) | `abstract class Command<C : `[`Scope`](../io.github.sof3.graphmine.scope/-scope/index.html)`>`<br>This class represents a command type. Each instance of Command should represent one registered command. |
| [CommandExecutor](-command-executor/index.html) | `class CommandExecutor<A : `[`Overload`](-overload/index.html)`, S : `[`CommandSender`](-command-sender.html)`, C : `[`Scope`](../io.github.sof3.graphmine.scope/-scope/index.html)`>`<br>The `this` context of command handlers. |
| [CommandMap](-command-map/index.html) | `class CommandMap`<br>Stores a list of commands. This class can also be instantiated at individual commands to provide a sub-command list. |
| [CommandReceiver](-command-receiver/index.html) | `interface CommandReceiver`<br>Accepts output from a command. |
| [CommandSender](-command-sender.html) | `interface CommandSender` |
| [EmptyOverload](-empty-overload/index.html) | `class EmptyOverload : `[`Overload`](-overload/index.html) |
| [Overload](-overload/index.html) | `abstract class Overload` |
| [RegisteredOverload](-registered-overload/index.html) | `class RegisteredOverload : I18nable` |

### Exceptions

| [CommandException](-command-exception/index.html) | `abstract class CommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, I18nable`<br>Represents any user-friendly errors reported from commands. |
| [WrongSyntaxException](-wrong-syntax-exception/index.html) | `class WrongSyntaxException : `[`CommandException`](-command-exception/index.html)<br>Thrown when a command with wrong syntax is sent. |

