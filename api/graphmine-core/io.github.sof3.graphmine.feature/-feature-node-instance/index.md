---
title: FeatureNodeInstance - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [FeatureNodeInstance](./index.html)

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
| [Client](../../io.github.sof3.graphmine.client/-client/index.html) | `interface Client : `[`FeatureNodeInstance`](./index.html)`<`[`Client`](../../io.github.sof3.graphmine.client/-client/index.html)`, `[`Client.Node`](../../io.github.sof3.graphmine.client/-client/-node.html)`>` |

