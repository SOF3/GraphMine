---
title: KtsLoader - graphmine-util
---

[graphmine-util](../../index.html) / [io.github.sof3.graphmine.util](../index.html) / [KtsLoader](./index.html)

# KtsLoader

`object KtsLoader`

State object to ensure system properties are set before loading a script

### Functions

| [load](load.html) | `fun <R> load(reader: `[`Reader`](http://docs.oracle.com/javase/6/docs/api/java/io/Reader.html)`): `[`R`](load.html#R)<br>Loads a script from a reader |
| [loadCache](load-cache.html) | `fun <T> loadCache(md5: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, cacheFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, rVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, read: (`[`DataInputStream`](http://docs.oracle.com/javase/6/docs/api/java/io/DataInputStream.html)`) -> `[`T`](load-cache.html#T)`): `[`T`](load-cache.html#T)`?` |
| [loadSerializable](load-serializable.html) | `fun <T : `[`KtsBin`](../-kts-bin/index.html)`<`[`T`](load-serializable.html#T)`, `[`F`](load-serializable.html#F)`>, F : `[`Factory`](../-kts-bin/-factory/index.html)`<`[`T`](load-serializable.html#T)`, `[`F`](load-serializable.html#F)`>> loadSerializable(factory: `[`F`](load-serializable.html#F)`, fis: `[`InputStream`](http://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`, path: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cacheDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, rVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`T`](load-serializable.html#T)<br>Loads a .kts file, optionally from cache and stores to cache |
| [writeCache](write-cache.html) | `fun writeCache(cacheFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, md5: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, rVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, value: `[`KtsBin`](../-kts-bin/index.html)`<*, *>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

