---
title: FeatureNode - graphmine-api
---

[graphmine-api](../index.html) / [io.github.sof3.graphmine.feature](index.html) / [FeatureNode](./-feature-node.html)

# FeatureNode

`interface FeatureNode<Self : `[`FeatureNode`](./-feature-node.html)`<`[`Self`](-feature-node.html#Self)`, `[`Inst`](-feature-node.html#Inst)`>, Inst : `[`FeatureNodeInstance`](-feature-node-instance/index.html)`<`[`Inst`](-feature-node.html#Inst)`, `[`Self`](-feature-node.html#Self)`>>`

Represents a concrete or abstract concept that can interact with itself or other FeatureNodes, such as an entity,
a block, a client or a command.

If the implementation is a singleton, it is recommended that FeatureNode be implemented in the companion object of
the corresponding FeatureNodeInstance.

### Parameters

`Self` - the actual class implementing FeatureNode. It is not mandatory to pass the actual instance type, but it
is recommended if possible to improve type prediction

`Inst` - the FeatureNodeInstance class corresponding to Self.

### Inheritors

| [Block](../io.github.sof3.graphmine.world/-block/index.html) | `data class Block : `[`FeatureNode`](./-feature-node.html)`<`[`Block`](../io.github.sof3.graphmine.world/-block/index.html)`, `[`BlockInstance`](../io.github.sof3.graphmine.world/-block-instance/index.html)`>`<br>Represents a block type. |
| [Command](../io.github.sof3.graphmine.command/-command/index.html) | `abstract class Command<Cmd : `[`Command`](../io.github.sof3.graphmine.command/-command/index.html)`<`[`Cmd`](../io.github.sof3.graphmine.command/-command/index.html#Cmd)`, `[`Overload`](../io.github.sof3.graphmine.command/-command/index.html#Overload)`>, Overload : `[`CommandOverload`](../io.github.sof3.graphmine.command/-command-overload/index.html)`<`[`Overload`](../io.github.sof3.graphmine.command/-command/index.html#Overload)`, `[`Cmd`](../io.github.sof3.graphmine.command/-command/index.html#Cmd)`>> : `[`FeatureNode`](./-feature-node.html)`<`[`Cmd`](../io.github.sof3.graphmine.command/-command/index.html#Cmd)`, `[`Overload`](../io.github.sof3.graphmine.command/-command/index.html#Overload)`>` |
