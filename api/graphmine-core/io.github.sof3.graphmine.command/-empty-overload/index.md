---
title: EmptyOverload - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [EmptyOverload](./index.html)

# EmptyOverload

`class EmptyOverload : `[`Overload`](../-overload/index.html)

An empty overload, reused for commands that do not require arguments.

### Constructors

| [&lt;init&gt;](-init-.html) | `EmptyOverload()`<br>An empty overload, reused for commands that do not require arguments. |

### Inherited Functions

| [addArg](../-overload/add-arg.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> addArg(arg: `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`T`](../-overload/add-arg.html#T)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`T`](../-overload/add-arg.html#T)`>`<br>CommandArg factory extension functions must call this function before returning the argument |
| [client](../-overload/client.html) | `fun client(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [enum](../-overload/enum.html) | `fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](../-overload/enum.html#E)`>> enum(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](../-overload/enum.html#E)`>`<br>`fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](../-overload/enum.html#E)`>> enum(enumClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`E`](../-overload/enum.html#E)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](../-overload/enum.html#E)`>` |
| [integer](../-overload/integer.html) | `fun integer(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [number](../-overload/number.html) | `fun number(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [rawText](../-overload/raw-text.html) | `fun rawText(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [string](../-overload/string.html) | `fun string(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

