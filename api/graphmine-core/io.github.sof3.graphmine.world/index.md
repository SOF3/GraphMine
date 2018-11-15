---
title: io.github.sof3.graphmine.world - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.world](./index.html)

## Package io.github.sof3.graphmine.world

### Types

| [Block](-block/index.html) | `data class Block : `[`FeatureNode`](../io.github.sof3.graphmine.feature/-feature-node.html)`<`[`Block`](-block/index.html)`, `[`BlockInstance`](-block-instance/index.html)`>`<br>Represents a block type. |
| [BlockInstance](-block-instance/index.html) | `data class BlockInstance : `[`FeatureNodeInstance`](../io.github.sof3.graphmine.feature/-feature-node-instance/index.html)`<`[`BlockInstance`](-block-instance/index.html)`, `[`Block`](-block/index.html)`>`<br>Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the block is really at the location, ever at the location or has been removed. This is a pure value class. |
| [BlockLocation](-block-location/index.html) | `data class BlockLocation`<br>A unique identifier for an integer location. |
| [Blocks](-blocks/index.html) | `object Blocks`<br>The list of default Block instances. Plugins are not expected to add custom block types to this list |
| [Location](-location/index.html) | `data class Location`<br>Represents a point in the 3D space of a world. |
| [World](-world.html) | `interface World`<br>Each world has its set of 3D space. Usually, this is implemented as one saved map, but plugins may create virtual worlds, remote worlds or anything that features the characteristics as required by the interface. |
| [WorldPartition](-world-partition.html) | `interface WorldPartition`<br>Represents a partition of a World. World partitioning is controlled by the server based on WorldUser activity. |
| [WorldUser](-world-user.html) | `interface WorldUser`<br>Represents a user of a world that holds resources from being freed. |

