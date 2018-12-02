---
title: Overload - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Overload](./index.html)

# Overload

`abstract class Overload`

Defines the parameters of a command.

Commands that have parameters should create classes extending Overload. The subclass should contain backing
properties delegated to one of the [CommandArg](../../io.github.sof3.graphmine.command.args/-command-arg/index.html) factory methods like [string](string.html), [integer](integer.html), etc.

If another module wants to implement its own [CommandArg](../../io.github.sof3.graphmine.command.args/-command-arg/index.html) types, it can create extension functions on [Overload](./index.html) that
constructs the CommandArg, calls the [addArg](add-arg.html) function and returns the new CommandArg instance.

### Constructors

| [&lt;init&gt;](-init-.html) | `Overload()`<br>Defines the parameters of a command. |

### Functions

| [addArg](add-arg.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> addArg(arg: `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`T`](add-arg.html#T)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`T`](add-arg.html#T)`>` |
| [client](client.html) | `fun client(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [enum](enum.html) | `fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](enum.html#E)`>> enum(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](enum.html#E)`>`<br>`fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](enum.html#E)`>> enum(enumClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`E`](enum.html#E)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](enum.html#E)`>` |
| [integer](integer.html) | `fun integer(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [number](number.html) | `fun number(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [rawText](raw-text.html) | `fun rawText(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [string](string.html) | `fun string(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Inheritors

| [EmptyOverload](../-empty-overload/index.html) | `class EmptyOverload : `[`Overload`](./index.html)<br>An empty overload, reused for commands that do not require arguments. |

