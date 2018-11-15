---
title: World - graphmine-core
---

[graphmine-core](../index.html) / [io.github.sof3.graphmine.world](index.html) / [World](./-world.html)

# World

`interface World`

Each world has its set of 3D space. Usually, this is implemented as one saved map, but plugins may create virtual
worlds, remote worlds or anything that features the characteristics as required by the interface.

As the World object itself is used as the identifier, implementations should not override the equals() and hashCode()
methods.

