---
title: CommandExecutor - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandExecutor](./index.html)

# CommandExecutor

`class CommandExecutor<A : `[`Overload`](../-overload/index.html)`, S : `[`CommandSender`](../-command-sender.html)`, C : `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)`>`

The `this` context of command handlers.

Other modules are encouraged to create extension functions on this class for more convenient handling.

### Parameters

`A` - the type of overload. Can be any supertype of the actual overload.

`S` - the type of command sender. Can be any supertype of the actual sender.

`C` - the [scope](../../io.github.sof3.graphmine.scope/-scope/index.html) of the command execution.

### Properties

| [args](args.html) | `val args: `[`A`](index.html#A)<br>the parsed overload instance |
| [receiver](receiver.html) | `val receiver: `[`CommandReceiver`](../-command-receiver/index.html)<br>the object to send command output into |
| [scope](scope.html) | `val scope: `[`C`](index.html#C)<br>the scope that owns the command |
| [sender](sender.html) | `val sender: `[`S`](index.html#S)<br>the sender that sent the command |

### Functions

| [respond](respond.html) | `fun respond(message: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Responds to the command sender. A shortcut for `receiver.receiveMessage`. |
| [specialize](specialize.html) | `fun <SubA : `[`Overload`](../-overload/index.html)`, SubS : `[`CommandSender`](../-command-sender.html)`> specialize(): `[`CommandExecutor`](./index.html)`<`[`SubA`](specialize.html#SubA)`, `[`SubS`](specialize.html#SubS)`, `[`C`](index.html#C)`>?`<br>Restricts the command executor to its subtypes. |

