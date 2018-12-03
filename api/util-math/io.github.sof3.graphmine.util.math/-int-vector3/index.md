---
title: IntVector3 - util-math
---

[util-math](../../index.html) / [io.github.sof3.graphmine.util.math](../index.html) / [IntVector3](./index.html)

# IntVector3

`inline class IntVector3`

A 3-dimensional vector in integers. Intended to store aligned positions e.g. block positions.

The class is a value class. Values in this class cannot be changed. Therefore, no copy method is present.

### Constructors

| [&lt;init&gt;](-init-.html) | `IntVector3(x: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, y: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, z: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Consrtucts a [Vector3](../-vector3/index.html) by specifying all coordinates`IntVector3(values: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`)`<br>A 3-dimensional vector in integers. Intended to store aligned positions e.g. block positions. |

### Properties

| [length](length.html) | `val length: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the length (a.k.a. norm or modulus) of this vector. |
| [lengthSquared](length-squared.html) | `val lengthSquared: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Calculates the squared length of this vector |
| [unit](unit.html) | `val unit: `[`Vector3`](../-vector3/index.html) |
| [x](x.html) | `val x: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The *x*-component value |
| [y](y.html) | `val y: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The *y*-component value, which is orthogonal to *x* |
| [z](z.html) | `val z: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The *z*-component value, which is in the direction of *x*&times;*y* |

### Functions

| [abs](abs.html) | `fun abs(): `[`IntVector3`](./index.html) |
| [cross](cross.html) | `infix fun cross(v: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html)<br>Calculates the cross product of `this` and [v](cross.html#io.github.sof3.graphmine.util.math.IntVector3$cross(io.github.sof3.graphmine.util.math.IntVector3)/v) |
| [distanceSquared](distance-squared.html) | `fun distanceSquared(that: `[`IntVector3`](./index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Calculates the squared distance between `this` and [that](distance-squared.html#io.github.sof3.graphmine.util.math.IntVector3$distanceSquared(io.github.sof3.graphmine.util.math.IntVector3)/that) |
| [distanceTo](distance-to.html) | `infix fun distanceTo(that: `[`IntVector3`](./index.html)`): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the distance between `this` and [that](distance-to.html#io.github.sof3.graphmine.util.math.IntVector3$distanceTo(io.github.sof3.graphmine.util.math.IntVector3)/that). |
| [dot](dot.html) | `infix fun dot(v: `[`IntVector3`](./index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Calculates the dot product of `this` and [v](dot.html#io.github.sof3.graphmine.util.math.IntVector3$dot(io.github.sof3.graphmine.util.math.IntVector3)/v) |
| [eachSide](each-side.html) | `fun eachSide(fn: (`[`IntVector3`](./index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [minus](minus.html) | `operator fun minus(that: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html)<br>Calculates `this` - [that](minus.html#io.github.sof3.graphmine.util.math.IntVector3$minus(io.github.sof3.graphmine.util.math.IntVector3)/that) |
| [plus](plus.html) | `operator fun plus(that: `[`IntVector3`](./index.html)`): `[`IntVector3`](./index.html)<br>Calculates `this` + [that](plus.html#io.github.sof3.graphmine.util.math.IntVector3$plus(io.github.sof3.graphmine.util.math.IntVector3)/that) |
| [rangeTo](range-to.html) | `operator fun rangeTo(that: `[`IntVector3`](./index.html)`): `[`IntVector3Range`](../-int-vector3-range/index.html)<br>Returns the minimum [IntVector3Range](../-int-vector3-range/index.html) that inclusively contains both `this` and [that](range-to.html#io.github.sof3.graphmine.util.math.IntVector3$rangeTo(io.github.sof3.graphmine.util.math.IntVector3)/that) |
| [side](side.html) | `fun side(side: `[`Side`](../-side/index.html)`): `[`IntVector3`](./index.html)<br>`fun side(side: `[`Side`](../-side/index.html)`, steps: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IntVector3`](./index.html) |
| [times](times.html) | `operator fun times(scalar: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IntVector3`](./index.html)<br>Multiplies the components of `this` by [scalar](times.html#io.github.sof3.graphmine.util.math.IntVector3$times(kotlin.Int)/scalar) |
| [toDouble](to-double.html) | `fun toDouble(): `[`Vector3`](../-vector3/index.html)<br>Converts to a [Vector3](../-vector3/index.html) with approximately equivalent positions |
| [unaryMinus](unary-minus.html) | `operator fun unaryMinus(): `[`IntVector3`](./index.html) |
| [unaryPlus](unary-plus.html) | `operator fun unaryPlus(): `[`IntVector3`](./index.html) |

### Companion Object Properties

| [UNIT_X](-u-n-i-t_-x.html) | `val UNIT_X: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *x* (east) |
| [UNIT_X_NEG](-u-n-i-t_-x_-n-e-g.html) | `val UNIT_X_NEG: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *-x* (west) |
| [UNIT_Y](-u-n-i-t_-y.html) | `val UNIT_Y: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *y* (up) |
| [UNIT_Y_NEG](-u-n-i-t_-y_-n-e-g.html) | `val UNIT_Y_NEG: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *-y* (up) |
| [UNIT_Z](-u-n-i-t_-z.html) | `val UNIT_Z: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *z* (south) |
| [UNIT_Z_NEG](-u-n-i-t_-z_-n-e-g.html) | `val UNIT_Z_NEG: `[`IntVector3`](./index.html)<br>A unit vector in the direction of *-z* (north) |
| [ZERO](-z-e-r-o.html) | `val ZERO: `[`IntVector3`](./index.html)<br>A zero vector |

