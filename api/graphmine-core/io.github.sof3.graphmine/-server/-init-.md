---
title: Server.<init> - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine](../index.html) / [Server](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Server(config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html)`, initNano: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = System.nanoTime())`

The Server should be the object that links up different components of the server.

To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.

### Parameters

`initNano` - System.nanoTime() when the server start command was created