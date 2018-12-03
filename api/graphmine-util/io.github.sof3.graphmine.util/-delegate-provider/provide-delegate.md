---
title: DelegateProvider.provideDelegate - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [DelegateProvider](index.html) / [provideDelegate](./provide-delegate.html)

# provideDelegate

`abstract operator fun provideDelegate(thisRef: `[`R`](index.html#R)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`R`](index.html#R)`, `[`T`](index.html#T)`>`

Provide the [ReadOnlyProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html) for delegation. Could use [Ref](../-ref/index.html) if no special logic is required.

