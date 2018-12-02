---
title: ConfigSpec.entry - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigSpec](index.html) / [entry](./entry.html)

# entry

`protected fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>`

Declares a required entry

### Parameters

`T` - type of entry

`validator` - returns an error string if the config value is incorrect, `null` otherwise`protected fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> entry(default: `[`T`](entry.html#T)`, validator: (`[`T`](entry.html#T)`) -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = { null }): `[`SimpleConfigEntry`](../-simple-config-entry/index.html)`<`[`T`](entry.html#T)`>`

Declares an entry with a default value

``` kotlin
/**
	 * The default language to use
	 */
	var language by entry("en_US")
```

### Parameters

`T` - type of entry

`default` - default value to use if the config does not specify this entry.

`validator` - returns an error string if the config value is incorrect, `null` otherwise