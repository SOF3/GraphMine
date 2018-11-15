---
title: handle - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.feature](index.html) / [handle](./handle.html)

# handle

`inline fun <Node : `[`FeatureNode`](-feature-node.html)`<`[`Node`](handle.html#Node)`, `[`Inst`](handle.html#Inst)`>, Inst : `[`FeatureNodeInstance`](-feature-node-instance/index.html)`<`[`Inst`](handle.html#Inst)`, `[`Node`](handle.html#Node)`>, reified Ev : `[`FeatureEvent`](-feature-event.html)`> `[`FeatureGraph`](-feature-graph/index.html)`.handle(node: `[`Node`](handle.html#Node)`, crossinline fn: (inst: `[`Inst`](handle.html#Inst)`, event: `[`Ev`](handle.html#Ev)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

A convenient wrapper for FeatureGraph.addEdge and SingleFeatureEdge construction (for one node)

`inline fun <Node1 : `[`FeatureNode`](-feature-node.html)`<`[`Node1`](handle.html#Node1)`, `[`Inst1`](handle.html#Inst1)`>, Inst1 : `[`FeatureNodeInstance`](-feature-node-instance/index.html)`<`[`Inst1`](handle.html#Inst1)`, `[`Node1`](handle.html#Node1)`>, Node2 : `[`FeatureNode`](-feature-node.html)`<`[`Node2`](handle.html#Node2)`, `[`Inst2`](handle.html#Inst2)`>, Inst2 : `[`FeatureNodeInstance`](-feature-node-instance/index.html)`<`[`Inst2`](handle.html#Inst2)`, `[`Node2`](handle.html#Node2)`>, reified Ev : `[`FeatureEvent`](-feature-event.html)`> `[`FeatureGraph`](-feature-graph/index.html)`.handle(node1: `[`Node1`](handle.html#Node1)`, node2: `[`Node2`](handle.html#Node2)`, crossinline fn: (inst1: `[`Inst1`](handle.html#Inst1)`, inst2: `[`Inst2`](handle.html#Inst2)`, event: `[`Ev`](handle.html#Ev)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

A convenient wrapper for FeatureGraph.addEdge and FeatureEdge construction (for two nodes)

