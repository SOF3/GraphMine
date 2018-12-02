---
title: LangSpec - graphmine-i18n
---

[graphmine-i18n](../../index.html) / [io.github.sof3.graphmine.i18n](../index.html) / [LangSpec](./index.html)

# LangSpec

`abstract class LangSpec<Self : `[`LangSpec`](./index.html)`<`[`Self`](index.html#Self)`>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `LangSpec()` |

### Properties

| [declarations](declarations.html) | `val declarations: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Declaration`](../-declaration/index.html)`<*>>` |
| [groups](groups.html) | `val groups: `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`GroupSpec`](../-group-spec/index.html)`<*>>` |
| [locale](locale.html) | `open var locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [path](path.html) | `open val path: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [rootSpec](root-spec.html) | `open val rootSpec: `[`LangSpec`](./index.html)`<*>` |

### Functions

| [accept](accept.html) | `fun <Arg : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> accept(): DelegateProvider<`[`Self`](index.html#Self)`, `[`Declaration`](../-declaration/index.html)`<`[`Arg`](accept.html#Arg)`>>`<br>Invoked by declaration subclasses to create a single declaration |
| [group](group.html) | `fun <Grp : `[`GroupSpec`](../-group-spec/index.html)`<`[`Grp`](group.html#Grp)`>> group(group: `[`Grp`](group.html#Grp)`): DelegateProvider<`[`Self`](index.html#Self)`, `[`Grp`](group.html#Grp)`>`<br>Invoked by declaration subclasses to create a declaration group |
| [invoke](invoke.html) | `operator fun invoke(locale: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, fn: `[`Self`](index.html#Self)`.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`LangSpec`](./index.html)`<`[`Self`](index.html#Self)`>` |

### Inheritors

| [GroupSpec](../-group-spec/index.html) | `abstract class GroupSpec<Self : `[`GroupSpec`](../-group-spec/index.html)`<`[`Self`](../-group-spec/index.html#Self)`>> : `[`LangSpec`](./index.html)`<`[`Self`](../-group-spec/index.html#Self)`>` |

