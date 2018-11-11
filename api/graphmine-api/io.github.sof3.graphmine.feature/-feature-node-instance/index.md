---
title: FeatureNodeInstance - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [FeatureNodeInstance](./index.html)

# FeatureNodeInstance

`interface FeatureNodeInstance<Self : `[`FeatureNodeInstance`](./index.html)`<`[`Self`](index.html#Self)`, `[`Node`](index.html#Node)`>, Node : `[`FeatureNode`](../-feature-node.html)`<`[`Node`](index.html#Node)`, `[`Self`](index.html#Self)`>>`

Represents an instance of FeatureNode. The FeatureNode represents the type in general, while FeatureNodeInstance
represents each instance of the type. It is valid for FeatureNodeInstance to be singleton or even same as the
FeatureNode. For example, each instance of the Client class represents one client, while the singleton Client.Node
companion object represents the client type.

### Properties

| [node](node.html) | `abstract val node: `[`Node`](index.html#Node)<br>the corresponding node for the instance. |

### Inheritors

| [BlockInstance](../../io.github.sof3.graphmine.world/-block-instance/index.html) | `data class BlockInstance : `[`FeatureNodeInstance`](./index.html)`<`[`BlockInstance`](../../io.github.sof3.graphmine.world/-block-instance/index.html)`, `[`Block`](../../io.github.sof3.graphmine.world/-block/index.html)`>`<br>Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the block is really at the location, ever at the location or has been removed. This is a pure value class. |
| [CommandOverload](../../io.github.sof3.graphmine.command/-command-overload/index.html) | `abstract class CommandOverload<Self : `[`CommandOverload`](../../io.github.sof3.graphmine.command/-command-overload/index.html)`<`[`Self`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Self)`, `[`Cmd`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Cmd)`>, Cmd : `[`Command`](../../io.github.sof3.graphmine.command/-command/index.html)`<`[`Cmd`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Cmd)`, `[`Self`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Self)`>> : `[`FeatureNodeInstance`](./index.html)`<`[`Self`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Self)`, `[`Cmd`](../../io.github.sof3.graphmine.command/-command-overload/index.html#Cmd)`>` |

