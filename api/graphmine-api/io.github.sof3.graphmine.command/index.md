---
title: io.github.sof3.graphmine.command - graphmine-api
---

[graphmine-api](../index.html) / [io.github.sof3.graphmine.command](./index.html)

## Package io.github.sof3.graphmine.command

### Types

| [Command](-command/index.html) | `abstract class Command<Cmd : `[`Command`](-command/index.html)`<`[`Cmd`](-command/index.html#Cmd)`, `[`Overload`](-command/index.html#Overload)`>, Overload : `[`CommandOverload`](-command-overload/index.html)`<`[`Overload`](-command/index.html#Overload)`, `[`Cmd`](-command/index.html#Cmd)`>> : `[`FeatureNode`](../io.github.sof3.graphmine.feature/-feature-node.html)`<`[`Cmd`](-command/index.html#Cmd)`, `[`Overload`](-command/index.html#Overload)`>` |
| [CommandBuilder](-command-builder/index.html) | `class CommandBuilder<Cmd : `[`Command`](-command/index.html)`<`[`Cmd`](-command-builder/index.html#Cmd)`, `[`Overload`](-command-builder/index.html#Overload)`>, Overload : `[`CommandOverload`](-command-overload/index.html)`<`[`Overload`](-command-builder/index.html#Overload)`, `[`Cmd`](-command-builder/index.html#Cmd)`>>` |
| [CommandExecuteContext](-command-execute-context/index.html) | `data class CommandExecuteContext<Overload : `[`CommandOverload`](-command-overload/index.html)`<in `[`Overload`](-command-execute-context/index.html#Overload)`, `[`Cmd`](-command-execute-context/index.html#Cmd)`>, Cmd : `[`Command`](-command/index.html)`<`[`Cmd`](-command-execute-context/index.html#Cmd)`, in `[`Overload`](-command-execute-context/index.html#Overload)`>, Sender : `[`CommandSender`](-command-sender.html)`>` |
| [CommandOverload](-command-overload/index.html) | `abstract class CommandOverload<Self : `[`CommandOverload`](-command-overload/index.html)`<`[`Self`](-command-overload/index.html#Self)`, `[`Cmd`](-command-overload/index.html#Cmd)`>, Cmd : `[`Command`](-command/index.html)`<`[`Cmd`](-command-overload/index.html#Cmd)`, `[`Self`](-command-overload/index.html#Self)`>> : `[`FeatureNodeInstance`](../io.github.sof3.graphmine.feature/-feature-node-instance/index.html)`<`[`Self`](-command-overload/index.html#Self)`, `[`Cmd`](-command-overload/index.html#Cmd)`>` |
| [CommandSender](-command-sender.html) | `interface CommandSender`<br>To be implemented by anything that can send a command |

