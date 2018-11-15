---
title: CommandArg - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command.args](../index.html) / [CommandArg](./index.html)

# CommandArg

`abstract class CommandArg<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : DelegateProvider<`[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, `[`T`](index.html#T)`>`

Superclass of a command argument.

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandArg()`<br>Superclass of a command argument. |

### Properties

| [default](default.html) | `var default: `[`T`](index.html#T)`?` |
| [optional](optional.html) | `var optional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [value](value.html) | `lateinit var value: `[`T`](index.html#T) |

### Functions

| [accept](accept.html) | `fun accept(parser: FormattedStringReader): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [default](default.html) | `fun default(value: `[`T`](index.html#T)`): `[`CommandArg`](./index.html)`<`[`T`](index.html#T)`>` |
| [parse](parse.html) | `abstract fun parse(parser: FormattedStringReader): `[`T`](index.html#T)`?` |
| [provideDelegate](provide-delegate.html) | `open fun provideDelegate(thisRef: `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, `[`T`](index.html#T)`>` |

### Inheritors

| [ClientArg](../-client-arg/index.html) | `class ClientArg : `[`CommandArg`](./index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`>` |
| [EnumArg](../-enum-arg/index.html) | `class EnumArg<E : `[`Enum`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)`<`[`E`](../-enum-arg/index.html#E)`>> : `[`CommandArg`](./index.html)`<`[`E`](../-enum-arg/index.html#E)`>` |
| [IntegerArg](../-integer-arg/index.html) | `class IntegerArg : `[`CommandArg`](./index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [NumberArg](../-number-arg/index.html) | `class NumberArg : `[`CommandArg`](./index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` |
| [RawTextArg](../-raw-text-arg/index.html) | `class RawTextArg : `[`CommandArg`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [StringArg](../-string-arg/index.html) | `class StringArg : `[`CommandArg`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

