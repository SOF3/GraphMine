---
title: CommandArg - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.command.args](../index.html) / [CommandArg](./index.html)

# CommandArg

`abstract class CommandArg<R : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

### Types

| [Wrapper](-wrapper/index.html) | `inner class Wrapper<R : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<AnyOverload, `[`R`](-wrapper/index.html#R)`>` |

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandArg()` |

### Properties

| [default](default.html) | `var default: `[`R`](-wrapper/index.html#R)`?`<br>the default value of the arugment. If null, the argument is required. |
| [defaultPrintable](default-printable.html) | `var defaultPrintable: I18nable?`<br>the default value of the argument expressed in human-readable string. |
| [optional](optional.html) | `val optional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>whether the argument is required, deduced from "default" |
| [typeName](type-name.html) | `abstract val typeName: I18nable` |
| [validator](validator.html) | `var validator: `[`ArgValidator`](../-arg-validator.html)`<`[`R`](-wrapper/index.html#R)`>`<br>validates the result parsed by this command |

### Functions

| [invoke](invoke.html) | `operator fun invoke(fn: `[`CommandArg`](./index.html)`<`[`R`](-wrapper/index.html#R)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`CommandArg`](./index.html)`<`[`R`](-wrapper/index.html#R)`>` |
| [parseCommand](parse-command.html) | `abstract fun parseCommand(reader: FormattedStringReader): `[`R`](-wrapper/index.html#R)`?` |
| [provideDelegate](provide-delegate.html) | `operator fun provideDelegate(thisRef: AnyOverload, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<AnyOverload, `[`R`](-wrapper/index.html#R)`>` |

### Inheritors

| [IntegerArg](../-integer-arg/index.html) | `class IntegerArg : `[`CommandArg`](./index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [StringArg](../-string-arg/index.html) | `class StringArg : `[`CommandArg`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

