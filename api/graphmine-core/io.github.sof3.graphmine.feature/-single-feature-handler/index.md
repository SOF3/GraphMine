---
title: SingleFeatureHandler - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [SingleFeatureHandler](./index.html)

# SingleFeatureHandler

`class SingleFeatureHandler<Node : `[`FeatureNode`](../-feature-node.html)`<`[`Node`](index.html#Node)`, `[`Inst`](index.html#Inst)`>, Inst : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst`](index.html#Inst)`, `[`Node`](index.html#Node)`>> : `[`SingleFeatureEdge`](../-single-feature-edge/index.html)`<`[`Node`](index.html#Node)`, `[`Inst`](index.html#Inst)`>`

**Internal**

### Constructors

| [&lt;init&gt;](-init-.html) | `SingleFeatureHandler(node: `[`Node`](index.html#Node)`, fn: (inst: `[`Inst`](index.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Properties

| [node](node.html) | `val node: `[`Node`](index.html#Node)<br>the node that the edge incidents with |

### Inherited Properties

| [node1](../-single-feature-edge/node1.html) | `open val node1: `[`Node`](../-single-feature-edge/index.html#Node)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |
| [node2](../-single-feature-edge/node2.html) | `open val node2: `[`Node`](../-single-feature-edge/index.html#Node)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |

### Functions

| [handle](handle.html) | `fun handle(inst: `[`Inst`](index.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The implementation to handle the FeatureEvent. |

### Inherited Functions

| [handle](../-single-feature-edge/handle.html) | `open fun handle(inst1: `[`Inst`](../-single-feature-edge/index.html#Inst)`, inst2: `[`Inst`](../-single-feature-edge/index.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The implementation to handle the FeatureEvent. |

