---
title: BlockLocation - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.world](../index.html) / [BlockLocation](./index.html)

# BlockLocation

`data class BlockLocation`

A unique identifier for an integer location.

Out-of-bounds block locations are intentionally allowed, because normally out-of-bounds locations like negative
locations may be valid for certain world formats. While they are not valid for the client, the World implementation
is responsible for translating coordinates to something the client can see. This should not interfere with plugins'
ability to interpret the world in a sensible manner.

### Constructors

| [&lt;init&gt;](-init-.html) | `BlockLocation(vector: IntVector3, world: `[`World`](../-world.html)`)`<br>A unique identifier for an integer location. |

### Properties

| [vector](vector.html) | `val vector: IntVector3`<br>The positional vector of the location |
| [world](world.html) | `val world: `[`World`](../-world.html)<br>The world that the location is in |

