---
title: IntVector3 - util-math
---

[util-math](../../index.html) / [io.github.sof3.graphmine.util.math](../index.html) / [IntVector3](./index.html)

# IntVector3

`inline class IntVector3`

### Constructors

| [&lt;init&gt;](-init-.html) | `IntVector3(x: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, y: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, z: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`IntVector3(values: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`)` |

### Properties

| [length](length.html) | `val length: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [lengthSquared](length-squared.html) | `val lengthSquared: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [unit](unit.html) | `val unit: `[`Vector3`](../-vector3/index.html) |
| [x](x.html) | `val x: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [y](y.html) | `val y: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [z](z.html) | `val z: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

### Functions

| [abs](abs.html) | `fun abs(): `[`IntVector3`](./index.html) |
| [copy](copy.html) | `fun copy(): `[`IntVector3`](./index.html) |
| [cross](cross.html) | `infix fun cross(v: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html) |
| [distanceSquared](distance-squared.html) | `fun distanceSquared(that: `[`IntVector3`](./index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [distanceTo](distance-to.html) | `infix fun distanceTo(that: `[`IntVector3`](./index.html)`): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [dot](dot.html) | `infix fun dot(v: `[`IntVector3`](./index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [eachSide](each-side.html) | `fun eachSide(fn: (`[`IntVector3`](./index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [minus](minus.html) | `operator fun minus(that: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html) |
| [plus](plus.html) | `operator fun plus(that: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html) |
| [rangeTo](range-to.html) | `operator fun rangeTo(that: `[`IntVector3`](./index.html)`): `[`IntVector3Range`](../-int-vector3-range/index.html) |
| [side](side.html) | `fun side(side: `[`Side`](../-side/index.html)`): `[`IntVector3`](./index.html)<br>`fun side(side: `[`Side`](../-side/index.html)`, steps: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IntVector3`](./index.html) |
| [times](times.html) | `operator fun times(f: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IntVector3`](./index.html) |
| [toDouble](to-double.html) | `fun toDouble(): `[`Vector3`](../-vector3/index.html) |
| [unaryMinus](unary-minus.html) | `operator fun unaryMinus(): `[`IntVector3`](./index.html) |
| [unaryPlus](unary-plus.html) | `operator fun unaryPlus(): `[`IntVector3`](./index.html) |

