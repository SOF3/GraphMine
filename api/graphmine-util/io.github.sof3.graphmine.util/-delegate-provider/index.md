---
title: DelegateProvider - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [DelegateProvider](./index.html)

# DelegateProvider

`interface DelegateProvider<in R, out T>`

An interface to help completing the `provideDelegate` operator function for `val` property delegation.

### Functions

| [provideDelegate](provide-delegate.html) | `abstract operator fun provideDelegate(thisRef: `[`R`](index.html#R)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`R`](index.html#R)`, `[`T`](index.html#T)`>`<br>Provide the [ReadOnlyProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html) for delegation. Could use [Ref](../-ref/index.html) if no special logic is required. |

