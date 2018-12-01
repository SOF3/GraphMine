---
title: Overload - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Overload](./index.html)

# Overload

`abstract class Overload`

### Constructors

| [&lt;init&gt;](-init-.html) | `Overload()` |

### Functions

| [client](client.html) | `fun client(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [enum](enum.html) | `fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](enum.html#E)`>> enum(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](enum.html#E)`>`<br>`fun <E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](enum.html#E)`>> enum(enumClass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<`[`E`](enum.html#E)`>): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`E`](enum.html#E)`>` |
| [integer](integer.html) | `fun integer(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [number](number.html) | `fun number(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [rawText](raw-text.html) | `fun rawText(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [string](string.html) | `fun string(): `[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Inheritors

| [EmptyOverload](../-empty-overload/index.html) | `class EmptyOverload : `[`Overload`](./index.html) |
| [HelpCommandByName](../../io.github.sof3.graphmine.command.impl/-help-command-by-name/index.html) | `class HelpCommandByName : `[`Overload`](./index.html) |
| [HelpCommandByPage](../../io.github.sof3.graphmine.command.impl/-help-command-by-page/index.html) | `class HelpCommandByPage : `[`Overload`](./index.html) |
| [SayCommand](../../io.github.sof3.graphmine.command.impl/-say-command/index.html) | `class SayCommand : `[`Overload`](./index.html) |

