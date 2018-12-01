---
title: CommandExecutor - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandExecutor](./index.html)

# CommandExecutor

`class CommandExecutor<A : `[`Overload`](../-overload/index.html)`, S : `[`CommandSender`](../-command-sender.html)`, C>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandExecutor(args: `[`A`](index.html#A)`, sender: `[`S`](index.html#S)`, c: `[`C`](index.html#C)`, receiver: `[`CommandReceiver`](../-command-receiver/index.html)`)` |

### Properties

| [args](args.html) | `val args: `[`A`](index.html#A) |
| [c](c.html) | `val c: `[`C`](index.html#C) |
| [sender](sender.html) | `val sender: `[`S`](index.html#S) |

### Functions

| [respond](respond.html) | `fun respond(message: I18n): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [specialize](specialize.html) | `fun <SubA : `[`A`](index.html#A)`, SubS : `[`S`](index.html#S)`> specialize(): `[`CommandExecutor`](./index.html)`<`[`SubA`](specialize.html#SubA)`, `[`SubS`](specialize.html#SubS)`, `[`C`](index.html#C)`>?` |

