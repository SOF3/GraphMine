---
title: DoubleFeatureHandler - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [DoubleFeatureHandler](./index.html)

# DoubleFeatureHandler

`class DoubleFeatureHandler<Node1 : `[`FeatureNode`](../-feature-node.html)`<`[`Node1`](index.html#Node1)`, `[`Inst1`](index.html#Inst1)`>, Inst1 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst1`](index.html#Inst1)`, `[`Node1`](index.html#Node1)`>, Node2 : `[`FeatureNode`](../-feature-node.html)`<`[`Node2`](index.html#Node2)`, `[`Inst2`](index.html#Inst2)`>, Inst2 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst2`](index.html#Inst2)`, `[`Node2`](index.html#Node2)`>> : `[`FeatureEdge`](../-feature-edge/index.html)`<`[`Node1`](index.html#Node1)`, `[`Node2`](index.html#Node2)`, `[`Inst1`](index.html#Inst1)`, `[`Inst2`](index.html#Inst2)`>`

**Internal**

### Constructors

| [&lt;init&gt;](-init-.html) | `DoubleFeatureHandler(node1: `[`Node1`](index.html#Node1)`, node2: `[`Node2`](index.html#Node2)`, fn: (`[`Inst1`](index.html#Inst1)`, `[`Inst2`](index.html#Inst2)`, `[`FeatureEvent`](../-feature-event.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`)` |

### Properties

| [node1](node1.html) | `val node1: `[`Node1`](index.html#Node1)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |
| [node2](node2.html) | `val node2: `[`Node2`](index.html#Node2)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |

### Functions

| [handle](handle.html) | `fun handle(inst1: `[`Inst1`](index.html#Inst1)`, inst2: `[`Inst2`](index.html#Inst2)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The implementation to handle the FeatureEvent. |

