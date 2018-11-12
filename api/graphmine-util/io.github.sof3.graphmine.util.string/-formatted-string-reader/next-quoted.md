---
title: FormattedStringReader.nextQuoted - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.string](../index.html) / [FormattedStringReader](index.html) / [nextQuoted](./next-quoted.html)

# nextQuoted

`fun nextQuoted(open: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = '"', close: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = open, delimiter: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)` = ' ', openEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = '\\', closeEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = openEscape, delimiterEscape: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`? = null, dumb: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = false): `[`QuotedResult`](../-quoted-result/index.html)`?`

Similar to `nextDelimiter(delimiter)`, but if `open` is found in the token, the reader will read until the next
`close` regardless of `delimiter`, and continue reading with the same rule until a `delimiter` beyond a pair of
`open`/`close` is found or the string comes to the end.

If there is an odd number of `open`s, the last `open` is parsed normally.

Recursive open/close is not supported, i.e. for `open = '{', close = '}'`, `a{b{c}d}e` is parsed as `ab{cd}e`.

### Parameters

`open` - the character

`close` - the character to be paired

`delimiter` - the character to terminate the token

`openEscape` - the character used in front of `open` to prevent it from *starting* a pair. Pass null to
disable escaping. Two consecutive `openEscape` characters are merged (i.e. `\\` will become `\`)

`closeEscape` - the character used in front of `close` to prevent it from *closing* a pair. Pass null to
disable escaping. Two consecutive `closeEscape` characters are merged.

`delimiterEscape` - the character used in front of `delimiter` to prevent it from ending the token. Pass null
to disable escaping. Two consecutive `delimiterEscape` characters are merged.

`dumb` - in dumb mode, all escapes are ignored, and `open` is only effective at offset 0

**Return**
Returns null if end of string was already reached before calling this method.

