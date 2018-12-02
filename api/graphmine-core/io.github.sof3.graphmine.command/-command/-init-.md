---
title: Command.<init> - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Command](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Command(fn: `[`Command`](index.html)`<`[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`

This class represents a command type. Each instance of Command should represent one registered command.

Subclasses must initialize the [name](name.html) property.

``` kotlin
/**
 * Implements the /version command
 */
object VersionCommand : Command<Server>({
	name = "graphmine.version".qualify()
	aliases += "v"

	description = CoreLang.commands.version.description(Unit)

	handle<EmptyOverload, CommandSender> {
		respond(CoreLang.commands.version.response(VersionResponse(VersionInfo.VERSION)))
	}
})
```

### Parameters

`fn` - A lambda to initialize the command.