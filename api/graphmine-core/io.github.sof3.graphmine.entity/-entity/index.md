---
title: Entity - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.entity](../index.html) / [Entity](./index.html)

# Entity

`class Entity`

An entity follows the ICES structure:

* a set of Internal viewers that sees what the entity sees
* a set of Controllers that controls the behaviour of the entity
* a nullable External viewer that exposes the entity to other viewers

### Constructors

| [&lt;init&gt;](-init-.html) | `Entity()`<br>An entity follows the ICES structure: |

### Properties

| [controllers](controllers.html) | `var controllers: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`EntityController`](../-entity-controller/index.html)`>` |
| [externalViewer](external-viewer.html) | `var externalViewer: `[`ExternalViewer`](../-external-viewer/index.html)`?` |
| [internalViewers](internal-viewers.html) | `var internalViewers: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`InternalViewer`](../-internal-viewer/index.html)`>` |
| [state](state.html) | `var state: `[`EntityState`](../-entity-state.html)`?` |

