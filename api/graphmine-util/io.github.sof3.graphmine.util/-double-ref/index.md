---
title: DoubleRef - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [DoubleRef](./index.html)

# DoubleRef

`class DoubleRef : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`

Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and
[VarDelegateProvider](../-var-delegate-provider/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `DoubleRef(value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)`<br>Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and [VarDelegateProvider](../-var-delegate-provider/index.html) |

### Properties

| [value](value.html) | `var value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>the backing value |

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Used for delegation to the backing [value](value.html) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Used for delegation to the backing [value](set-value.html#io.github.sof3.graphmine.util.DoubleRef$setValue(kotlin.Any, kotlin.reflect.KProperty((kotlin.Any)), kotlin.Double)/value) |
