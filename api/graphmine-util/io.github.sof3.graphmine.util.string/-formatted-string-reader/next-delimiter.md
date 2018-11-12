---
title: FormattedStringReader.nextDelimiter - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.string](../index.html) / [FormattedStringReader](index.html) / [nextDelimiter](./next-delimiter.html)

# nextDelimiter

`fun nextDelimiter(vararg delimiters: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = arrayOf(" ")): `[`DelimiterResult`](../-delimiter-result/index.html)`?`
* If the delimiter is in the remaining string:
* consumes $x := everything before the delimiter, **b**&gt;
* consumes the delimiter itself
* returns (true, $x)
* If the delimiter is *not* in the remaining string:
* consumes $x := the remaining string
* returns (false, $x)

If multiple delimiters are provided, the first delimiter found in the remaining string is used (i.e. BFS).

If multiple delimiters match the input at the same position, the first one is used, so if the parser expects
greedy behaviour, reverse-sort the delimiters by length before passing.

