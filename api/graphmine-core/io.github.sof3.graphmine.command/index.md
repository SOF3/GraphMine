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
| [CommandSender](-command-sender.html) | `interface CommandSender`<br>Represents an object that sends the command. |
| [EmptyOverload](-empty-overload/index.html) | `class EmptyOverload : `[`Overload`](-overload/index.html)<br>An empty overload, reused for commands that do not require arguments. |
| [Overload](-overload/index.html) | `abstract class Overload`<br>Defines the parameters of a command. |
| [RegisteredOverload](-registered-overload/index.html) | `class RegisteredOverload : I18nable`<br>A factory that creates a new instance of a known command overload for each command execution. |
| [TerminalSignal](-terminal-signal/index.html) | `sealed class TerminalSignal`<br>Any signals received from the abstract console are expressed as a [TerminalSignal](-terminal-signal/index.html). |

### Exceptions

| [CommandException](-command-exception/index.html) | `abstract class CommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, I18nable`<br>Represents any user-friendly errors reported from commands. |
| [WrongSyntaxException](-wrong-syntax-exception/index.html) | `class WrongSyntaxException : `[`CommandException`](-command-exception/index.html)<br>Thrown when a command with wrong syntax is sent. |

