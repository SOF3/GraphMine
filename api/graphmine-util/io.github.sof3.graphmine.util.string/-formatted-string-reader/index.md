---
title: FormattedStringReader - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.string](../index.html) / [FormattedStringReader](./index.html)

# FormattedStringReader

`data class FormattedStringReader`

### Constructors

| [&lt;init&gt;](-init-.html) | `FormattedStringReader(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)` |

### Properties

| [isComplete](is-complete.html) | `val isComplete: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns whether the reader reached the end of string |
| [pointer](pointer.html) | `var pointer: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [remaining](remaining.html) | `val remaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Peeks everything remaining in the string. Does **not** consume anything. |
| [string](string.html) | `val string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| [exactly](exactly.html) | `fun exactly(vararg oneOf: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>Returns the first value in `oneOf` that the remaining string starts with. Returns null if none is found. |
| [exec](exec.html) | `fun exec(fn: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Executes a function that may modify the state of this object, but upon completion, the state is reset. |
| [nextChar](next-char.html) | `fun nextChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`?`<br>Consumes and returns the next character. |
| [nextDelimiter](next-delimiter.html) | `fun nextDelimiter(vararg delimiters: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = arrayOf(" ")): `[`DelimiterResult`](../-delimiter-result/index.html)`?`
* If there is nothing to read (isComplete == true), returns null
* If the delimiter is in the remaining string:
* consumes $x := everything before the delimiter, **b**&gt;
* consumes the delimiter itself
* returns ($x, delimiter)
* If the delimiter is *not* in the remaining string:
* consumes $x := the remaining string
* returns ($x, null)
<br> |
| [nextQuoted](next-quoted.html) | `fun nextQuoted(open: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = '"', close: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = open, delimiter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = ' ', openEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = '\\', closeEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = openEscape, delimiterEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = null, dumb: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`QuotedResult`](../-quoted-result/index.html)`?`<br>Similar to `nextDelimiter(delimiter)`, but if `open` is found in the token, the reader will read until the next `close` regardless of `delimiter`, and continue reading with the same rule until a `delimiter` beyond a pair of `open`/`close` is found or the string comes to the end. |

