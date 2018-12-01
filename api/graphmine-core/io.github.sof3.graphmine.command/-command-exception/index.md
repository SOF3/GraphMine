---
title: CommandException - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandException](./index.html)

# CommandException

`abstract class CommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, I18nable`

Represents any user-friendly errors reported from commands.

Commands are not required to do this. This exception is only here for more convenient control flow.

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandException()`<br>Represents any user-friendly errors reported from commands. |

### Inheritors

| [WrongSyntaxException](../-wrong-syntax-exception/index.html) | `class WrongSyntaxException : `[`CommandException`](./index.html)<br>Thrown when a command with wrong syntax is sent. |

