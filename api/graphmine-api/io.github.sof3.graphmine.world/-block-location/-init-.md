---
title: BlockLocation.<init> - graphmine-api
---

[graphmine-api](../../index.html) / [io.github.sof3.graphmine.world](../index.html) / [BlockLocation](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`BlockLocation(vector: IntVector3, world: `[`World`](../-world.html)`)`

A unique identifier for an integer location.

Out-of-bounds block locations are intentionally allowed, because normally out-of-bounds locations like negative
locations may be valid for certain world formats. While they are not valid for the client, the World implementation
is responsible for translating coordinates to something the client can see. This should not interfere with plugins'
ability to interpret the world in a sensible manner.

