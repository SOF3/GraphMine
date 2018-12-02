---
title: GroupSpec - graphmine-i18n
---

[graphmine-i18n](../../index.html) / [io.github.sof3.graphmine.i18n](../index.html) / [GroupSpec](./index.html)

# GroupSpec

`abstract class GroupSpec<Self : `[`GroupSpec`](./index.html)`<`[`Self`](index.html#Self)`>> : `[`LangSpec`](../-lang-spec/index.html)`<`[`Self`](index.html#Self)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `GroupSpec()` |

### Properties

| [locale](locale.html) | `open var locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.html) | `lateinit var name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parent](parent.html) | `lateinit var parent: `[`LangSpec`](../-lang-spec/index.html)`<*>` |
| [path](path.html) | `open val path: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [rootSpec](root-spec.html) | `open val rootSpec: `[`LangSpec`](../-lang-spec/index.html)`<*>` |

### Inherited Properties

| [declarations](../-lang-spec/declarations.html) | `val declarations: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Declaration`](../-declaration/index.html)`<*>>` |
| [groups](../-lang-spec/groups.html) | `val groups: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`GroupSpec`](./index.html)`<*>>` |

### Functions

| [invoke](invoke.html) | `operator fun invoke(fn: `[`Self`](index.html#Self)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inherited Functions

| [accept](../-lang-spec/accept.html) | `fun <Arg : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> accept(): DelegateProvider<`[`Self`](../-lang-spec/index.html#Self)`, `[`Declaration`](../-declaration/index.html)`<`[`Arg`](../-lang-spec/accept.html#Arg)`>>`<br>Invoked by declaration subclasses to create a single declaration |
| [group](../-lang-spec/group.html) | `fun <Grp : `[`GroupSpec`](./index.html)`<`[`Grp`](../-lang-spec/group.html#Grp)`>> group(group: `[`Grp`](../-lang-spec/group.html#Grp)`): DelegateProvider<`[`Self`](../-lang-spec/index.html#Self)`, `[`Grp`](../-lang-spec/group.html#Grp)`>`<br>Invoked by declaration subclasses to create a declaration group |
| [invoke](../-lang-spec/invoke.html) | `operator fun invoke(locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fn: `[`Self`](../-lang-spec/index.html#Self)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`LangSpec`](../-lang-spec/index.html)`<`[`Self`](../-lang-spec/index.html#Self)`>` |

