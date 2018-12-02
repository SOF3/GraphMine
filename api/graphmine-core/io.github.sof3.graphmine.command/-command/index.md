---
title: Command - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Command](./index.html)

# Command

`abstract class Command<C : `[`Scope`](../../io.github.sof3.graphmine.scope/-scope/index.html)`>`

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

### Constructors

| [&lt;init&gt;](-init-.html) | `Command(fn: `[`Command`](./index.html)`<`[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)`<br>This class represents a command type. Each instance of Command should represent one registered command. |

### Properties

| [aliases](aliases.html) | `var aliases: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>The list of aliases |
| [description](description.html) | `var description: I18n`<br>The description of the command, shown in action lists like /help. |
| [name](name.html) | `lateinit var name: Qualifier`<br>The qualified name of the command. |
| [scope](scope.html) | `lateinit var scope: `[`C`](index.html#C)<br>The scope that owns the command |

### Functions

| [dispatch](dispatch.html) | `fun dispatch(reader: FormattedStringReader, sender: `[`CommandSender`](../-command-sender.html)`, receiver: `[`CommandReceiver`](../-command-receiver/index.html)`): Job`<br>Executes the command. |
| [handle](handle.html) | `fun <A : `[`Overload`](../-overload/index.html)`, S : `[`CommandSender`](../-command-sender.html)`> handle(fn: suspend `[`CommandExecutor`](../-command-executor/index.html)`<`[`A`](handle.html#A)`, `[`S`](handle.html#S)`, `[`C`](index.html#C)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds a handler to the command. |

### Inheritors

| [VersionCommand](../../io.github.sof3.graphmine.command.impl/-version-command.html) | `object VersionCommand : `[`Command`](./index.html)`<`[`Server`](../../io.github.sof3.graphmine/-server/index.html)`>`<br>Implements the /version command |

