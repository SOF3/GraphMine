---
title: ConfigSpec.GroupDelegate - graphmine-core
---

[graphmine-core](../../../index.html) / [io.github.sof3.graphmine.config](../../index.html) / [ConfigSpec](../index.html) / [GroupDelegate](./index.html)

# GroupDelegate

`protected inner class GroupDelegate<G : `[`ConfigGroupSpec`](../../-config-group-spec/index.html)`<`[`G`](index.html#G)`>>`

Used in property delegation. Config groups are included in the parent group by property delegation.

### Parameters

`G` - the actual group spec class

**See Also**

[ConfigSpec.group](../group.html)

### Constructors

| [&lt;init&gt;](-init-.html) | `GroupDelegate(group: `[`G`](index.html#G)`)`<br>Used in property delegation. Config groups are included in the parent group by property delegation. |

### Functions

| [provideDelegate](provide-delegate.html) | `operator fun provideDelegate(thisRef: `[`ConfigSpec`](../index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): Ref<`[`G`](index.html#G)`>`<br>Provides delegation to the backing group. |

