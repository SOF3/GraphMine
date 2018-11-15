---
title: FeatureGraph.<init> - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.feature](../index.html) / [FeatureGraph](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`FeatureGraph()`

The Feature Graph is the main registry of features in the server. It is an undirected multi-graph that allows
FeatureEdges (the features themselves) to handle interaction events (FeatureEvent) between FeatureNodes (the objects
of features, e.g. entities, blocks, or abstract concepts like commands), or self-loop edges that handle events on
a single object (e.g. player join).

