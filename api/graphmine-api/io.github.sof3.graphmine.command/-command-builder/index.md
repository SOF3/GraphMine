---
title: CommandBuilder - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandBuilder](./index.html)

# CommandBuilder

`class CommandBuilder<Cmd : `[`Command`](../-command/index.html)`<`[`Cmd`](index.html#Cmd)`, `[`Overload`](index.html#Overload)`>, Overload : `[`CommandOverload`](../-command-overload/index.html)`<`[`Overload`](index.html#Overload)`, `[`Cmd`](index.html#Cmd)`>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandBuilder()` |

### Properties

| [aliases](aliases.html) | `val aliases: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [description](description.html) | `var description: `[`I18nable`](../../io.github.sof3.graphmine.i18n/-i18nable/index.html)`?` |
| [name](name.html) | `var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [overloads](overloads.html) | `val overloads: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Overload`](index.html#Overload)`>>` |

### Functions

| [handle](handle.html) | `fun <O : `[`Overload`](index.html#Overload)`> handle(fn: `[`CommandExecuteContext`](../-command-execute-context/index.html)`<`[`O`](handle.html#O)`, `[`Cmd`](index.html#Cmd)`, `[`CommandSender`](../-command-sender.html)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [handleAll](handle-all.html) | `fun handleAll(fn: `[`CommandExecuteContext`](../-command-execute-context/index.html)`<`[`Overload`](index.html#Overload)`, `[`Cmd`](index.html#Cmd)`, `[`CommandSender`](../-command-sender.html)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

