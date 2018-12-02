---
title: ConfigSpec.group - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.config](../index.html) / [ConfigSpec](index.html) / [group](./group.html)

# group

`protected fun <G : `[`ConfigGroupSpec`](../-config-group-spec/index.html)`<`[`G`](group.html#G)`>> group(group: `[`G`](group.html#G)`): `[`GroupDelegate`](-group-delegate/index.html)`<`[`G`](group.html#G)`>`

Config groups should be included by delegation to this call

``` kotlin
/**
	 * Settings for the server
	 */
	val server by group(ServerConfig())
```

### Parameters

`group` - the config to be added

**Return**
the delegate that can be included by property delegation

