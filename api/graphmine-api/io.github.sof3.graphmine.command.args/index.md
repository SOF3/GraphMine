---
title: io.github.sof3.graphmine.command.args - graphmine-api
---

[graphmine-api](../index.html) / [io.github.sof3.graphmine.command.args](./index.html)

## Package io.github.sof3.graphmine.command.args

### Types

| [CommandArg](-command-arg/index.html) | `abstract class CommandArg<R : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` |
| [IntegerArg](-integer-arg/index.html) | `class IntegerArg : `[`CommandArg`](-command-arg/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [StringArg](-string-arg/index.html) | `class StringArg : `[`CommandArg`](-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Type Aliases

| [ArgValidator](-arg-validator.html) | `typealias ArgValidator<R> = (`[`R`](-arg-validator.html#R)`) -> I18nable?`<br>Checks whether a command argument is valid. Returns null if valid, or an I18nable to be sent to the CommandSender if invalid. |

