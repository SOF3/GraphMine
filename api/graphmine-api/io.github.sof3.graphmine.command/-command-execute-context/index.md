---
title: CommandExecuteContext - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandExecuteContext](./index.html)

# CommandExecuteContext

`data class CommandExecuteContext<Overload : `[`CommandOverload`](../-command-overload/index.html)`<in `[`Overload`](index.html#Overload)`, `[`Cmd`](index.html#Cmd)`>, Cmd : `[`Command`](../-command/index.html)`<`[`Cmd`](index.html#Cmd)`, in `[`Overload`](index.html#Overload)`>, Sender : `[`CommandSender`](../-command-sender.html)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandExecuteContext(args: `[`Overload`](index.html#Overload)`, sender: `[`Sender`](index.html#Sender)`)` |

### Properties

| [args](args.html) | `val args: `[`Overload`](index.html#Overload) |
| [sender](sender.html) | `val sender: `[`Sender`](index.html#Sender) |

### Functions

| [argsAre](args-are.html) | `fun <SubOverload : `[`Overload`](index.html#Overload)`> argsAre(fn: `[`CommandExecuteContext`](./index.html)`<`[`SubOverload`](args-are.html#SubOverload)`, `[`Cmd`](index.html#Cmd)`, `[`Sender`](index.html#Sender)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [senderIs](sender-is.html) | `fun <SubSender : `[`Sender`](index.html#Sender)`> senderIs(fn: `[`CommandExecuteContext`](./index.html)`<`[`Overload`](index.html#Overload)`, `[`Cmd`](index.html#Cmd)`, `[`SubSender`](sender-is.html#SubSender)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

