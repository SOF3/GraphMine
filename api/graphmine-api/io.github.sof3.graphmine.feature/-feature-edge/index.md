---
title: FeatureEdge - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [FeatureEdge](./index.html)

# FeatureEdge

`interface FeatureEdge<Node1 : `[`FeatureNode`](../-feature-node.html)`<`[`Node1`](index.html#Node1)`, `[`Inst1`](index.html#Inst1)`>, Node2 : `[`FeatureNode`](../-feature-node.html)`<`[`Node2`](index.html#Node2)`, `[`Inst2`](index.html#Inst2)`>, Inst1 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst1`](index.html#Inst1)`, `[`Node1`](index.html#Node1)`>, Inst2 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst2`](index.html#Inst2)`, `[`Node2`](index.html#Node2)`>>`

Represents the implementation of a feature.

FeatureGraph.handle() provides a convenience inline function for implementing this.

**See Also**

[FeatureGraph.handle](../handle.html)

### Properties

| [node1](node1.html) | `abstract val node1: `[`Node1`](index.html#Node1)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |
| [node2](node2.html) | `abstract val node2: `[`Node2`](index.html#Node2)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |

### Functions

| [handle](handle.html) | `abstract fun handle(inst1: `[`Inst1`](index.html#Inst1)`, inst2: `[`Inst2`](index.html#Inst2)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The implementation to handle the FeatureEvent. |

### Inheritors

| [SingleFeatureEdge](../-single-feature-edge/index.html) | `interface SingleFeatureEdge<Node : `[`FeatureNode`](../-feature-node.html)`<`[`Node`](../-single-feature-edge/index.html#Node)`, `[`Inst`](../-single-feature-edge/index.html#Inst)`>, Inst : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst`](../-single-feature-edge/index.html#Inst)`, `[`Node`](../-single-feature-edge/index.html#Node)`>> : `[`FeatureEdge`](./index.html)`<`[`Node`](../-single-feature-edge/index.html#Node)`, `[`Node`](../-single-feature-edge/index.html#Node)`, `[`Inst`](../-single-feature-edge/index.html#Inst)`, `[`Inst`](../-single-feature-edge/index.html#Inst)`>`<br>Convenience implementation of self-looping FeatureEdge |

