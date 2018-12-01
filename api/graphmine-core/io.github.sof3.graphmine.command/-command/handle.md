---
title: Command.handle - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Command](index.html) / [handle](./handle.html)

# handle

`inline fun <reified A : `[`Overload`](../-overload/index.html)`, reified S : `[`CommandSender`](../-command-sender.html)`> handle(crossinline fn: suspend `[`CommandExecutor`](../-command-executor/index.html)`<`[`A`](handle.html#A)`, `[`S`](handle.html#S)`, `[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Adds a handler to the command.

Type parameters [A](handle.html#A) and [S](handle.html#S) are explicitly specified to filter the overloads and sender types.

If the command does not require any parameters, [EmptyOverload](../-empty-overload/index.html) can be used.

### Parameters

`A` - the restricted [Overload](../-overload/index.html) type

`S` - the restricted [CommandSender](../-command-sender.html) type

`fn` - the handler function