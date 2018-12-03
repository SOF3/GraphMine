---
title: ByteRef - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [ByteRef](./index.html)

# ByteRef

`class ByteRef : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>`

Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and
[VarDelegateProvider](../-var-delegate-provider/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `ByteRef(value: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`<br>Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and [VarDelegateProvider](../-var-delegate-provider/index.html) |

### Properties

| [value](value.html) | `var value: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)<br>the backing value |

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)<br>Used for delegation to the backing [value](value.html) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Used for delegation to the backing [value](set-value.html#io.github.sof3.graphmine.util.ByteRef$setValue(kotlin.Any, kotlin.reflect.KProperty((kotlin.Any)), kotlin.Byte)/value) |

