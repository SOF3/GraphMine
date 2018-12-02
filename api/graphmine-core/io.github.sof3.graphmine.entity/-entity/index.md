---
title: Entity - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.entity](../index.html) / [Entity](./index.html)

# Entity

`class Entity`

An entity is a mobile object that exists in a world

An entity follows the ICES structure:

* a set of Internal viewers that sees what the entity sees
* a set of Controllers that controls the behaviour of the entity
* a nullable External viewer that exposes the entity to other viewers

### Constructors

| [&lt;init&gt;](-init-.html) | `Entity()`<br>An entity is a mobile object that exists in a world |

### Properties

| [controllers](controllers.html) | `val controllers: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`EntityController`](../-entity-controller/index.html)`>`<br>The list of objects that control the entity's motion and behaviour. They may gain or lose control on the entity, or co-work with other controllers to control the entity. |
| [externalViewer](external-viewer.html) | `var externalViewer: `[`ExternalViewer`](../-external-viewer/index.html)`?`<br>The adapter that determines how this entity looks to other viewers, e.g. which model to look like. |
| [internalViewers](internal-viewers.html) | `val internalViewers: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`InternalViewer`](../-internal-viewer/index.html)`>`<br>The list of viewers that can view the world from the entity's perspective, i.e. using the entity as a camera |
| [state](state.html) | `var state: `[`EntityState`](../-entity-state/index.html)`?`<br>Stores the entity-specific information. Can be directly written to or read from disk. |

