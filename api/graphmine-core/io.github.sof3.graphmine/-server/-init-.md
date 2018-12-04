---
title: Server.<init> - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine](../index.html) / [Server](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Server(dataDir: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, config: `[`CoreConfig`](../../io.github.sof3.graphmine.config/-core-config/index.html)`, signalFlux: Flux<`[`TerminalSignal`](../../io.github.sof3.graphmine.command/-terminal-signal/index.html)`>, initNano: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = System.nanoTime(), scope: `[`BaseScope`](../../io.github.sof3.graphmine.scope/-base-scope/index.html)` = BaseScope(Server::class))`

The Server should be the object that links up different components of the server.

To prevent cyclic dependency, instead of passing the Server object around, pass the objects that will actually be used, e.g. the logger, the config, etc.

