---
title: FormattedStringReader.exactly - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.string](../index.html) / [FormattedStringReader](index.html) / [exactly](./exactly.html)

# exactly

`fun exactly(vararg oneOf: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = ""): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`

Returns the first value in `oneOf` that the remaining string starts with. Returns null if none is found.

If suffix is provided, each `oneOf` is appended with the suffix, but the suffix itself will not be returned.

Consumes both the matched `oneOf` value and the suffix.

The options are searched in order. If a greedy approach is desired, the caller should reverse-sort the args by
length before passing.

