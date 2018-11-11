---
title: CommandOverload - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [CommandOverload](./index.html)

# CommandOverload

`abstract class CommandOverload<Self : `[`CommandOverload`](./index.html)`<`[`Self`](index.html#Self)`, `[`Cmd`](index.html#Cmd)`>, Cmd : `[`Command`](../-command/index.html)`<`[`Cmd`](index.html#Cmd)`, `[`Self`](index.html#Self)`>> : `[`FeatureNodeInstance`](../../io.github.sof3.graphmine.feature/-feature-node-instance/index.html)`<`[`Self`](index.html#Self)`, `[`Cmd`](index.html#Cmd)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `CommandOverload(cmd: `[`Cmd`](index.html#Cmd)`)` |

### Properties

| [alias](alias.html) | `lateinit var alias: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [cmd](cmd.html) | `val cmd: `[`Cmd`](index.html#Cmd) |
| [node](node.html) | `open val node: `[`Cmd`](index.html#Cmd)<br>the corresponding node for the instance. |

### Functions

| [express](express.html) | `fun express(): `[`JointI18nable`](../../io.github.sof3.graphmine.i18n/-joint-i18nable/index.html) |
| [getArgs](get-args.html) | `fun getArgs(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Wrapper`](../../io.github.sof3.graphmine.command.args/-command-arg/-wrapper/index.html)`<*>>` |

