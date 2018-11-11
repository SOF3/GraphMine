---
title: BlockInstance - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.world](../index.html) / [BlockInstance](./index.html)

# BlockInstance

`data class BlockInstance : `[`FeatureNodeInstance`](../../io.github.sof3.graphmine.feature/-feature-node-instance/index.html)`<`[`BlockInstance`](./index.html)`, `[`Block`](../-block/index.html)`>`

Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the
block is really at the location, ever at the location or has been removed. This is a pure value class.

### Constructors

| [&lt;init&gt;](-init-.html) | `BlockInstance(block: `[`Block`](../-block/index.html)`, location: `[`BlockLocation`](../-block-location/index.html)`)`<br>Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the block is really at the location, ever at the location or has been removed. This is a pure value class. |

### Properties

| [block](block.html) | `val block: `[`Block`](../-block/index.html)<br>the block type |
| [location](location.html) | `val location: `[`BlockLocation`](../-block-location/index.html)<br>the expected location of the block |
| [node](node.html) | `val node: `[`Block`](../-block/index.html)<br>the corresponding node for the instance. |

