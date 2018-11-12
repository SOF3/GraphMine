---
title: StringArg - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.command.args](../index.html) / [StringArg](./index.html)

# StringArg

`class StringArg : `[`CommandArg`](../-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StringArg(fn: `[`StringArg`](./index.html)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = {})` |

### Properties

| [typeName](type-name.html) | `val typeName: `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html) |

### Inherited Properties

| [default](../-command-arg/default.html) | `var default: `[`R`](../-command-arg/-wrapper/index.html#R)`?`<br>the default value of the arugment. If null, the argument is required. |
| [defaultPrintable](../-command-arg/default-printable.html) | `var defaultPrintable: I18nable?`<br>the default value of the argument expressed in human-readable string. |
| [optional](../-command-arg/optional.html) | `val optional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>whether the argument is required, deduced from "default" |
| [validator](../-command-arg/validator.html) | `var validator: `[`ArgValidator`](../-arg-validator.html)`<`[`R`](../-command-arg/-wrapper/index.html#R)`>`<br>validates the result parsed by this command |

### Functions

| [parseCommand](parse-command.html) | `fun parseCommand(reader: FormattedStringReader): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Inherited Functions

| [invoke](../-command-arg/invoke.html) | `operator fun invoke(fn: `[`CommandArg`](../-command-arg/index.html)`<`[`R`](../-command-arg/-wrapper/index.html#R)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`CommandArg`](../-command-arg/index.html)`<`[`R`](../-command-arg/-wrapper/index.html#R)`>` |
| [provideDelegate](../-command-arg/provide-delegate.html) | `operator fun provideDelegate(thisRef: AnyOverload, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<AnyOverload, `[`R`](../-command-arg/-wrapper/index.html#R)`>` |

