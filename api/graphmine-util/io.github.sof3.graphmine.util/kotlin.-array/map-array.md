---
title: mapArray - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [kotlin.Array](index.html) / [mapArray](./map-array.html)

# mapArray

`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`): `[`ShortArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`FloatArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`): `[`DoubleArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double-array/index.html)
`inline fun <T> `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`T`](map-array.html#T)`>.mapArray(transform: (`[`T`](map-array.html#T)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`BooleanArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean-array/index.html)

Returns an array containing the results of applying the given [transform](map-array.html#io.github.sof3.graphmine.util$mapArray(kotlin.Array((io.github.sof3.graphmine.util.mapArray.T)), kotlin.Function1((io.github.sof3.graphmine.util.mapArray.T, kotlin.Byte)))/transform) function to each element in the
original array

