---
title: CommandExecutor - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandExecutor](./index.html)

# CommandExecutor

`interface CommandExecutor<A : `[`Overload`](../-overload/index.html)`, S : `[`CommandSender`](../-command-sender.html)`, C>`

### Properties

| [args](args.html) | `abstract val args: `[`A`](index.html#A) |
| [c](c.html) | `abstract val c: `[`C`](index.html#C) |
| [sender](sender.html) | `abstract val sender: `[`S`](index.html#S) |

### Functions

| [specialize](specialize.html) | `abstract fun <SubA : `[`A`](index.html#A)`, SubS : `[`S`](index.html#S)`> specialize(): `[`CommandExecutor`](./index.html)`<`[`SubA`](specialize.html#SubA)`, `[`SubS`](specialize.html#SubS)`, `[`C`](index.html#C)`>` |

