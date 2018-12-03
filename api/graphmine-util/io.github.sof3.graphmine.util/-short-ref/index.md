---
title: ShortRef - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [ShortRef](./index.html)

# ShortRef

`class ShortRef : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>`

Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and
[VarDelegateProvider](../-var-delegate-provider/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `ShortRef(value: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`)`<br>Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and [VarDelegateProvider](../-var-delegate-provider/index.html) |

### Properties

| [value](value.html) | `var value: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)<br>the backing value |

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)<br>Used for delegation to the backing [value](value.html) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Used for delegation to the backing [value](set-value.html#io.github.sof3.graphmine.util.ShortRef$setValue(kotlin.Any, kotlin.reflect.KProperty((kotlin.Any)), kotlin.Short)/value) |

