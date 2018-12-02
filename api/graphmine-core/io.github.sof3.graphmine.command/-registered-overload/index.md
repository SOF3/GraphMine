---
title: RegisteredOverload - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [RegisteredOverload](./index.html)

# RegisteredOverload

`class RegisteredOverload : I18nable`

A factory that creates a new instance of a known command overload for each command execution.

### Constructors

| [&lt;init&gt;](-init-.html) | `RegisteredOverload(klass: `[`KClass`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)`<out `[`Overload`](../-overload/index.html)`>)`<br>A factory that creates a new instance of a known command overload for each command execution. |

### Properties

| [args](args.html) | `val args: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CommandArg`](../../io.github.sof3.graphmine.command.args/-command-arg/index.html)`<*>>`<br>The arguments applicable to this overload |
| [i18n](i18n.html) | `val i18n: I18n` |

### Functions

| [accept](accept.html) | `fun accept(parser: FormattedStringReader): `[`Overload`](../-overload/index.html)`?`<br>Accepts a command and tries to parse it. |

