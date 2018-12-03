---
title: IntVector3Range - util-math
---

[util-math](../../index.html) / [io.github.sof3.graphmine.util.math](../index.html) / [IntVector3Range](./index.html)

# IntVector3Range

`class IntVector3Range : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`IntVector3`](../-int-vector3/index.html)`>`

A unit-aligned cuboid region in the 3D space.

In integer-aligned space, this is a closed range [[min](min.html), [max](max.html)] such that the region joined with another region at
[max](max.html) + 1 on any axis will be fully continuous.

In non-integer-aligned space, this is a semi-open range [[min](min.html), [max](max.html) + 1) such that the same rule applies. It can be
thought as the vector at `(x, y, z)` covering the range `([x, x + 1), [y, y + 1), [z, z + 1))`.

### Types

| [IterationOrder](-iteration-order/index.html) | `enum class IterationOrder`<br>Specifies the iteration order. |

### Properties

| [max](max.html) | `val max: `[`IntVector3`](../-int-vector3/index.html)<br>the maximum possible point in the region |
| [min](min.html) | `val min: `[`IntVector3`](../-int-vector3/index.html)<br>the minimum possible point in the region |

### Functions

| [contains](contains.html) | `operator fun contains(vector: `[`IntVector3`](../-int-vector3/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if a vector is inside the range in integer-aligned space.`operator fun contains(vector: `[`Vector3`](../-vector3/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Checks if a vector is inside the range in non-integer-aligned space. |
| [iterator](iterator.html) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`IntVector3`](../-int-vector3/index.html)`>`<br>Iterates over every integer-aligned point in this range. |
| [with](with.html) | `infix fun with(order: `[`IterationOrder`](-iteration-order/index.html)`): `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`IntVector3`](../-int-vector3/index.html)`>`<br>Specifies the iteration order before using as an iterable. |

