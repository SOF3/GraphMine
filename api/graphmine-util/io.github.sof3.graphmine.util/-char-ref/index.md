---
title: CharRef - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [CharRef](./index.html)

# CharRef

`class CharRef : `[`ReadWriteProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-write-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>, `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`

Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and
[VarDelegateProvider](../-var-delegate-provider/index.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `CharRef(value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>Useful for passing by reference or as return value in delegation providers [DelegateProvider](../-delegate-provider/index.html) and [VarDelegateProvider](../-var-delegate-provider/index.html) |

### Properties

| [value](value.html) | `var value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)<br>the backing value |

### Functions

| [getValue](get-value.html) | `operator fun getValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)<br>Used for delegation to the backing [value](value.html) |
| [setValue](set-value.html) | `operator fun setValue(thisRef: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>, value: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Used for delegation to the backing [value](set-value.html#io.github.sof3.graphmine.util.CharRef$setValue(kotlin.Any, kotlin.reflect.KProperty((kotlin.Any)), kotlin.Char)/value) |

