---
title: Vector3 - util-math
---

[util-math](../../index.html) / [io.github.sof3.graphmine.util.math](../index.html) / [Vector3](./index.html)

# Vector3

`inline class Vector3`

A 3-dimensional vector in floating point precision. Intended to store non-aligned positions, e.g. entity positions.

The class is a value class. Values in this class cannot be changed. Therefore, no copy method is present.

### Constructors

| [&lt;init&gt;](-init-.html) | `Vector3(x: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, y: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`, z: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)`<br>Constructs a [Vector3](./index.html) by specifying all coordinates`Vector3(values: `[`DoubleArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double-array/index.html)`)`<br>A 3-dimensional vector in floating point precision. Intended to store non-aligned positions, e.g. entity positions. |

### Properties

| [length](length.html) | `val length: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the length (a.k.a. norm or modulus) of this vector. |
| [lengthSquared](length-squared.html) | `val lengthSquared: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the squared length of this vector |
| [unit](unit.html) | `val unit: `[`Vector3`](./index.html) |
| [x](x.html) | `val x: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>The *x*-component value |
| [y](y.html) | `val y: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>The *y*-component value, which is orthogonal to *x* |
| [z](z.html) | `val z: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>The *z*-component value, which is in the direction of *x*&times;*y* |

### Functions

| [abs](abs.html) | `fun abs(): `[`Vector3`](./index.html) |
| [ceil](ceil.html) | `fun ceil(): `[`IntVector3`](../-int-vector3/index.html)<br>Rounds up this vector to an [IntVector3](../-int-vector3/index.html) |
| [cross](cross.html) | `infix fun cross(v: `[`Vector3`](./index.html)`): `[`Vector3`](./index.html)<br>Calculates the cross product of `this` and [v](cross.html#io.github.sof3.graphmine.util.math.Vector3$cross(io.github.sof3.graphmine.util.math.Vector3)/v) |
| [distanceSquared](distance-squared.html) | `fun distanceSquared(that: `[`Vector3`](./index.html)`): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the squared distance between `this` and [that](distance-squared.html#io.github.sof3.graphmine.util.math.Vector3$distanceSquared(io.github.sof3.graphmine.util.math.Vector3)/that) |
| [distanceTo](distance-to.html) | `infix fun distanceTo(that: `[`Vector3`](./index.html)`): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the distance between `this` and [that](distance-to.html#io.github.sof3.graphmine.util.math.Vector3$distanceTo(io.github.sof3.graphmine.util.math.Vector3)/that). |
| [div](div.html) | `operator fun div(scalar: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`Vector3`](./index.html)<br>Divides the components of `this` by [scalar](div.html#io.github.sof3.graphmine.util.math.Vector3$div(kotlin.Double)/scalar) |
| [dot](dot.html) | `infix fun dot(v: `[`Vector3`](./index.html)`): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Calculates the dot product of `this` and [v](dot.html#io.github.sof3.graphmine.util.math.Vector3$dot(io.github.sof3.graphmine.util.math.Vector3)/v) |
| [floor](floor.html) | `fun floor(): `[`IntVector3`](../-int-vector3/index.html)<br>Rounds down this vector to an [IntVector3](../-int-vector3/index.html) |
| [minus](minus.html) | `operator fun minus(that: `[`Vector3`](./index.html)`): `[`Vector3`](./index.html)<br>Calculates `this` - [that](minus.html#io.github.sof3.graphmine.util.math.Vector3$minus(io.github.sof3.graphmine.util.math.Vector3)/that) |
| [plus](plus.html) | `operator fun plus(that: `[`Vector3`](./index.html)`): `[`Vector3`](./index.html)<br>Calculates `this` + [that](plus.html#io.github.sof3.graphmine.util.math.Vector3$plus(io.github.sof3.graphmine.util.math.Vector3)/that) |
| [round](round.html) | `fun round(): `[`IntVector3`](../-int-vector3/index.html)<br>Rounds this vector to an [IntVector3](../-int-vector3/index.html)`fun round(dp: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Vector3`](./index.html)<br>Rounds this vector to [dp](round.html#io.github.sof3.graphmine.util.math.Vector3$round(kotlin.Int)/dp) decimal places |
| [side](side.html) | `fun side(side: `[`Side`](../-side/index.html)`): `[`Vector3`](./index.html)<br>`fun side(side: `[`Side`](../-side/index.html)`, steps: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`Vector3`](./index.html) |
| [times](times.html) | `operator fun times(scalar: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`Vector3`](./index.html)<br>Multiplies the components of `this` by [scalar](times.html#io.github.sof3.graphmine.util.math.Vector3$times(kotlin.Double)/scalar) |
| [unaryMinus](unary-minus.html) | `operator fun unaryMinus(): `[`Vector3`](./index.html) |
| [unaryPlus](unary-plus.html) | `operator fun unaryPlus(): `[`Vector3`](./index.html) |

### Companion Object Properties

| [INF](-i-n-f.html) | `val INF: `[`Vector3`](./index.html)<br>A vector pointing to the infinity in the (+,+,+) octant |
| [INF_NEG](-i-n-f_-n-e-g.html) | `val INF_NEG: `[`Vector3`](./index.html)<br>A vector pointing to the infinity in the (-,-,-) octant |
| [UNIT_X](-u-n-i-t_-x.html) | `val UNIT_X: `[`Vector3`](./index.html)<br>A unit vector in the direction of *x* (east) |
| [UNIT_X_NEG](-u-n-i-t_-x_-n-e-g.html) | `val UNIT_X_NEG: `[`Vector3`](./index.html)<br>A unit vector in the direction of *-x* (west) |
| [UNIT_Y](-u-n-i-t_-y.html) | `val UNIT_Y: `[`Vector3`](./index.html)<br>A unit vector in the direction of *y* (up) |
| [UNIT_Y_NEG](-u-n-i-t_-y_-n-e-g.html) | `val UNIT_Y_NEG: `[`Vector3`](./index.html)<br>A unit vector in the direction of *-y* (down) |
| [UNIT_Z](-u-n-i-t_-z.html) | `val UNIT_Z: `[`Vector3`](./index.html)<br>A unit vector in the direction of *z* (south) |
| [UNIT_Z_NEG](-u-n-i-t_-z_-n-e-g.html) | `val UNIT_Z_NEG: `[`Vector3`](./index.html)<br>A unit vector in the direction of *-z* (north) |
| [ZERO](-z-e-r-o.html) | `val ZERO: `[`Vector3`](./index.html)<br>A zero vector |

