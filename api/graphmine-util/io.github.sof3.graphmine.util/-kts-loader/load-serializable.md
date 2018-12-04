---
title: KtsLoader.loadSerializable - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [KtsLoader](index.html) / [loadSerializable](./load-serializable.html)

# loadSerializable

`inline fun <reified T : `[`KtsBin`](../-kts-bin/index.html)`<`[`T`](load-serializable.html#T)`, `[`F`](load-serializable.html#F)`>, F : `[`Factory`](../-kts-bin/-factory/index.html)`<`[`T`](load-serializable.html#T)`, `[`F`](load-serializable.html#F)`>> loadSerializable(factory: `[`F`](load-serializable.html#F)`, fis: `[`InputStream`](http://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`, path: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cacheDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, rVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`T`](load-serializable.html#T)

Loads a .kts file, optionally from cache and stores to cache

### Parameters

`T` - the type