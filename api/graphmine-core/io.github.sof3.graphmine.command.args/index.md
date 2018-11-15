---
title: io.github.sof3.graphmine.command.args - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.command.args](./index.html)

## Package io.github.sof3.graphmine.command.args

### Types

| [ClientArg](-client-arg/index.html) | `class ClientArg : `[`CommandArg`](-command-arg/index.html)`<`[`Client`](../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [CommandArg](-command-arg/index.html) | `abstract class CommandArg<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : DelegateProvider<`[`Overload`](../io.github.sof3.graphmine.command/-overload/index.html)`, `[`T`](-command-arg/index.html#T)`>`<br>Superclass of a command argument. |
| [EnumArg](-enum-arg/index.html) | `class EnumArg<E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](-enum-arg/index.html#E)`>> : `[`CommandArg`](-command-arg/index.html)`<`[`E`](-enum-arg/index.html#E)`>` |
| [IntegerArg](-integer-arg/index.html) | `class IntegerArg : `[`CommandArg`](-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [NumberArg](-number-arg/index.html) | `class NumberArg : `[`CommandArg`](-command-arg/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [ParseResult](-parse-result/index.html) | `data class ParseResult<T>` |
| [ParseState](-parse-state/index.html) | `enum class ParseState` |
| [RawTextArg](-raw-text-arg/index.html) | `class RawTextArg : `[`CommandArg`](-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [StringArg](-string-arg/index.html) | `class StringArg : `[`CommandArg`](-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

