---
title: Qualifier - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.qualifier](../index.html) / [Qualifier](./index.html)

# Qualifier

`class Qualifier`

Represents a qualified identifier.

### Parameters

`string` - the dot-delimited qualified identifier

### Constructors

| [&lt;init&gt;](-init-.html) | `Qualifier(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Represents a qualified identifier. |

### Properties

| [parts](parts.html) | `val parts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>The string parts of the qualifier |
| [simple](simple.html) | `val simple: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The last part of the qualifier, which is also the most frequently used one |

### Functions

| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if two identifiers are fully equal based on the contents of [parts](parts.html) |
| [forEachPermutation](for-each-permutation.html) | `fun forEachPermutation(fn: (`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Executes [fn](for-each-permutation.html#io.github.sof3.graphmine.util.qualifier.Qualifier$forEachPermutation(kotlin.Function1((kotlin.collections.List((kotlin.String)), kotlin.Unit)))/fn) on each possible representation of this qualifier |
| [hashCode](hash-code.html) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the lazily-evaluated hash code of the qualifier only based on the contents of [parts](parts.html) |
| [toString](to-string.html) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the dot-delimited representation of the qualifier |

