---
title: QualifierClashException - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util.qualifier](../index.html) / [QualifierClashException](./index.html)

# QualifierClashException

`class QualifierClashException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)

Thrown when there is a qualifier clash

### Constructors

| [&lt;init&gt;](-init-.html) | `QualifierClashException(values: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Qualifier`](../-qualifier/index.html)`, *>)`<br>Thrown when there is a qualifier clash |

### Properties

| [values](values.html) | `val values: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`Qualifier`](../-qualifier/index.html)`, *>`<br>a map of [Qualifier](../-qualifier/index.html)s to their respective values. The value type of the map can be safely assumed to be the type T in the [QualifierMap](../-qualifier-map/index.html) that throws the exception. |

