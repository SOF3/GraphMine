---
title: DEADCODE - graphmine-util
---

[graphmine-util](../index.html) / [io.github.sof3.graphmine.util](index.html) / [DEADCODE](./-d-e-a-d-c-o-d-e.html)

# DEADCODE

`inline val DEADCODE: `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)

Always throws [AssertionError](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-assertion-error/index.html) stating that control flow should never reach this point. Useful in `when` blocks when
Kotlin is unable to detect that the conditions are exhaustive

`inline fun DEADCODE(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "Control flow error"): `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)

Always throws [AssertionError](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-assertion-error/index.html) stating that control flow should never reach this point. Useful in `when` blocks when
Kotlin is unable to detect that the conditions are exhaustive

### Parameters

`message` - a string to use as the error message