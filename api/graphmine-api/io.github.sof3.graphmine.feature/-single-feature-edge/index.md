---
title: SingleFeatureEdge - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [SingleFeatureEdge](./index.html)

# SingleFeatureEdge

`interface SingleFeatureEdge<Node : `[`FeatureNode`](../-feature-node.html)`<`[`Node`](index.html#Node)`, `[`Inst`](index.html#Inst)`>, Inst : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst`](index.html#Inst)`, `[`Node`](index.html#Node)`>> : `[`FeatureEdge`](../-feature-edge/index.html)`<`[`Node`](index.html#Node)`, `[`Node`](index.html#Node)`, `[`Inst`](index.html#Inst)`, `[`Inst`](index.html#Inst)`>`

Convenience implementation of self-looping FeatureEdge

### Properties

| [node](node.html) | `abstract val node: `[`Node`](index.html#Node)<br>the node that the edge incidents with |
| [node1](node1.html) | `open val node1: `[`Node`](index.html#Node)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |
| [node2](node2.html) | `open val node2: `[`Node`](index.html#Node)<br>Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter. |

### Functions

| [handle](handle.html) | `open fun handle(inst1: `[`Inst`](index.html#Inst)`, inst2: `[`Inst`](index.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun handle(inst: `[`Inst`](index.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The implementation to handle the FeatureEvent. |

