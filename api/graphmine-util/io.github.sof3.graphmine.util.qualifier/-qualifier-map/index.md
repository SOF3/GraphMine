---
title: QualifierMap - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.qualifier](../index.html) / [QualifierMap](./index.html)

# QualifierMap

`class QualifierMap<T>`

A thread-safe store for qualified entries allowing search by qualified name

### Constructors

| [&lt;init&gt;](-init-.html) | `QualifierMap()`<br>A thread-safe store for qualified entries allowing search by qualified name |

### Functions

| [get](get.html) | `operator fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`T`](index.html#T)`?`<br>Gets an entry using a qualified key |
| [set](set.html) | `operator fun set(qualifier: `[`Qualifier`](../-qualifier/index.html)`, value: `[`T`](index.html#T)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds a qualified entry to the map |

