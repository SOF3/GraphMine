---
title: CommandExecutor.specialize - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandExecutor](index.html) / [specialize](./specialize.html)

# specialize

`inline fun <reified SubA : `[`Overload`](../-overload/index.html)`, reified SubS : `[`CommandSender`](../-command-sender.html)`> specialize(): `[`CommandExecutor`](index.html)`<`[`SubA`](specialize.html#SubA)`, `[`SubS`](specialize.html#SubS)`, `[`C`](index.html#C)`>?`

Restricts the command executor to its subtypes.

[SubA](specialize.html#SubA) and [SubS](specialize.html#SubS) are intentionally not forced to be subtypes of [A](index.html#A) and [S](index.html#S) because it is possible that [SubA](specialize.html#SubA)
is another interface that does not extend [A](index.html#A).

### Parameters

`SubA` - the new expected overload type

`SubS` - the new expected sender type

**Return**
`this` if the types can be narrowed for this instance, `null` if types are incompatible

