---
title: FeatureGraph - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [FeatureGraph](./index.html)

# FeatureGraph

`interface FeatureGraph`

The Feature Graph is the main registry of features in the server. It is an undirected multi-graph that allows
FeatureEdges (the features themselves) to handle interaction events (FeatureEvent) between FeatureNodes (the objects
of features, e.g. entities, blocks, or abstract concepts like commands), or self-loop edges that handle events on
a single object (e.g. player join).

### Properties

| [edges](edges.html) | `abstract val edges: `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`FeatureNode`](../-feature-node.html)`<*, *>, `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`FeatureNode`](../-feature-node.html)`<*, *>, `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`FeatureEdge`](../-feature-edge/index.html)`<*, *, *, *>>>>`<br>the features registered on this server |

### Functions

| [addEdge](add-edge.html) | `abstract fun addEdge(edge: `[`FeatureEdge`](../-feature-edge/index.html)`<out `[`FeatureNode`](../-feature-node.html)`<*, *>, out `[`FeatureNode`](../-feature-node.html)`<*, *>, out `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<*, *>, out `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<*, *>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers a FeatureEdge |
| [addNode](add-node.html) | `abstract fun addNode(node: `[`FeatureNode`](../-feature-node.html)`<*, *>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers a FeatureNode so that edges can be added upon it |
| [dispatch](dispatch.html) | `abstract fun <Inst1 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst1`](dispatch.html#Inst1)`, *>, Inst2 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst2`](dispatch.html#Inst2)`, *>> dispatch(inst1: `[`Inst1`](dispatch.html#Inst1)`, inst2: `[`Inst2`](dispatch.html#Inst2)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Dispatch a single-node event`abstract fun <Inst : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst`](dispatch.html#Inst)`, *>> dispatch(inst: `[`Inst`](dispatch.html#Inst)`, event: `[`FeatureEvent`](../-feature-event.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Dispatch a two-node event |

### Extension Functions

| [handle](../handle.html) | `fun <Node : `[`FeatureNode`](../-feature-node.html)`<`[`Node`](../handle.html#Node)`, `[`Inst`](../handle.html#Inst)`>, Inst : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst`](../handle.html#Inst)`, `[`Node`](../handle.html#Node)`>, Ev : `[`FeatureEvent`](../-feature-event.html)`> `[`FeatureGraph`](./index.html)`.handle(node: `[`Node`](../handle.html#Node)`, fn: (inst: `[`Inst`](../handle.html#Inst)`, event: `[`Ev`](../handle.html#Ev)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>A convenient wrapper for FeatureGraph.addEdge and SingleFeatureEdge construction (for one node)`fun <Node1 : `[`FeatureNode`](../-feature-node.html)`<`[`Node1`](../handle.html#Node1)`, `[`Inst1`](../handle.html#Inst1)`>, Inst1 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst1`](../handle.html#Inst1)`, `[`Node1`](../handle.html#Node1)`>, Node2 : `[`FeatureNode`](../-feature-node.html)`<`[`Node2`](../handle.html#Node2)`, `[`Inst2`](../handle.html#Inst2)`>, Inst2 : `[`FeatureNodeInstance`](../-feature-node-instance/index.html)`<`[`Inst2`](../handle.html#Inst2)`, `[`Node2`](../handle.html#Node2)`>, Ev : `[`FeatureEvent`](../-feature-event.html)`> `[`FeatureGraph`](./index.html)`.handle(node1: `[`Node1`](../handle.html#Node1)`, node2: `[`Node2`](../handle.html#Node2)`, fn: (inst1: `[`Inst1`](../handle.html#Inst1)`, inst2: `[`Inst2`](../handle.html#Inst2)`, event: `[`Ev`](../handle.html#Ev)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>A convenient wrapper for FeatureGraph.addEdge and FeatureEdge construction (for two nodes) |

