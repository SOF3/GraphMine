---
title: IntVector3Range.IterationOrder - util-math
---

[util-math](../../../index.html) / [io.github.sof3.graphmine.util.math](../../index.html) / [IntVector3Range](../index.html) / [IterationOrder](./index.html)

# IterationOrder

`enum class IterationOrder`

Specifies the iteration order.

### Enum Values

| [YXZ](-y-x-z.html) | Iterate bottom-up, for each column from west to east, yields from north to south |
| [XZY](-x-z-y.html) | Iterate from west to east, for each row from north to south, yields bottom-up |
| [YZX](-y-z-x.html) | Iterate bottom-up, for each column from north to south, yields from west to east |
| [ZXY](-z-x-y.html) | Iterate from morth to south, for each row from west to east, yields bottom-up |

### Properties

| [a](a.html) | `val a: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the first axis to iterate over (increments when [b](b.html) resets, stops iteration after reaching [max](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max.html)) |
| [b](b.html) | `val b: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the second axis to iterate over (increments when [c](c.html) resets, resets after reaching [max](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max.html)) |
| [c](c.html) | `val c: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the third axis to iterate over (increments every time, resets after reaching [max](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/max.html)) |

