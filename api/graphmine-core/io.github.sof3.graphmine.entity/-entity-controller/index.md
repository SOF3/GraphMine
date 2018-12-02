---
title: EntityController - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.entity](../index.html) / [EntityController](./index.html)

# EntityController

`interface EntityController`

Controls the actions of an entity.

Each instance of EntityController should only be applied on one entity.

### Functions

| [onGainControl](on-gain-control.html) | `abstract fun onGainControl(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Invoked when the controller is added to the entity |
| [onLoseControl](on-lose-control.html) | `abstract fun onLoseControl(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Invoked when the controller is removed from the entity |

