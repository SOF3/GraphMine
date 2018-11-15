---
title: SayCommand - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command.impl](../index.html) / [SayCommand](./index.html)

# SayCommand

`class SayCommand : `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)

### Types

| [Companion](-companion.html) | `companion object Companion : `[`Command`](../../io.github.sof3.graphmine.command/-command/index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>` |

### Constructors

| [&lt;init&gt;](-init-.html) | `SayCommand()` |

### Properties

| [message](message.html) | `val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inherited Functions

| [client](../../io.github.sof3.graphmine.command/-overload/client.html) | `fun client(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [enum](../../io.github.sof3.graphmine.command/-overload/enum.html) | `fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](../../io.github.sof3.graphmine.command/-overload/enum.html#E)`>> enum(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](../../io.github.sof3.graphmine.command/-overload/enum.html#E)`>`<br>`fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](../../io.github.sof3.graphmine.command/-overload/enum.html#E)`>> enum(enumClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`E`](../../io.github.sof3.graphmine.command/-overload/enum.html#E)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](../../io.github.sof3.graphmine.command/-overload/enum.html#E)`>` |
| [integer](../../io.github.sof3.graphmine.command/-overload/integer.html) | `fun integer(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [number](../../io.github.sof3.graphmine.command/-overload/number.html) | `fun number(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [rawText](../../io.github.sof3.graphmine.command/-overload/raw-text.html) | `fun rawText(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [string](../../io.github.sof3.graphmine.command/-overload/string.html) | `fun string(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Inherited Companion Object Properties

| [aliases](../../io.github.sof3.graphmine.command/-command/aliases.html) | `var aliases: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [description](../../io.github.sof3.graphmine.command/-command/description.html) | `var description: I18nable` |
| [handlers](../../io.github.sof3.graphmine.command/-command/handlers.html) | `val handlers: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<(`[`CommandExecutor`](../../io.github.sof3.graphmine.command/-command-executor/index.html)`<`[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, `[`CommandSender`](../../io.github.sof3.graphmine.command/-command-sender.html)`, `[`C`](../../io.github.sof3.graphmine.command/-command/index.html#C)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [name](../../io.github.sof3.graphmine.command/-command/name.html) | `lateinit var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [overloads](../../io.github.sof3.graphmine.command/-command/overloads.html) | `val overloads: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`RegisteredOverload`](../../io.github.sof3.graphmine.command/-registered-overload/index.html)`>` |

### Inherited Companion Object Functions

| [handle](../../io.github.sof3.graphmine.command/-command/handle.html) | `fun <A : `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, S : `[`CommandSender`](../../io.github.sof3.graphmine.command/-command-sender.html)`> handle(fn: `[`CommandExecutor`](../../io.github.sof3.graphmine.command/-command-executor/index.html)`<`[`A`](../../io.github.sof3.graphmine.command/-command/handle.html#A)`, `[`S`](../../io.github.sof3.graphmine.command/-command/handle.html#S)`, `[`C`](../../io.github.sof3.graphmine.command/-command/index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

