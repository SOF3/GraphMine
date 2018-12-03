---
title: CommandException - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandException](./index.html)

# CommandException

`abstract class CommandException : `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, I18nable`

Represents any user-friendly errors reported from commands.

Commands are not required to use this exception. It is only here for more convenient control flow (e.g. can throw
exception directly instead of calling response() then return)

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandException()`<br>Represents any user-friendly errors reported from commands. |

### Properties

| [i18n](i18n.html) | `abstract val i18n: I18n`<br>A user-friendly [I18n](#) describing the problem |

### Inheritors

| [WrongSyntaxException](../-wrong-syntax-exception/index.html) | `class WrongSyntaxException : `[`CommandException`](./index.html)<br>Thrown when a command with wrong syntax is sent. |

