---
title: Declaration - graphmine-i18n
---

[graphmine-i18n](../../index.html) / [io.github.sof3.graphmine.i18n](../index.html) / [Declaration](./index.html)

# Declaration

`class Declaration<Arg : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`LangSpec`](../-lang-spec/index.html)`<*>, `[`Declaration`](./index.html)`<`[`Arg`](index.html#Arg)`>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Declaration(spec: () -> `[`LangSpec`](../-lang-spec/index.html)`<*>, pathGet: () -> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)` |

### Properties

| [path](path.html) | `val path: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [pathJoined](path-joined.html) | `val pathJoined: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [translations](translations.html) | `val translations: `[`LinkedHashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-linked-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Translation`](../-translation.html)`<`[`Arg`](index.html#Arg)`>>` |

### Functions

| [getValue](get-value.html) | `fun getValue(thisRef: `[`LangSpec`](../-lang-spec/index.html)`<*>, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`Declaration`](./index.html)`<`[`Arg`](index.html#Arg)`>`<br>Dummy function to satisfy the ReadOnlyProperty interface |
| [invoke](invoke.html) | `operator fun invoke(fn: `[`Translation`](../-translation.html)`<`[`Arg`](index.html#Arg)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>To be called by translation scripts to provide a translation.`operator fun invoke(arg: `[`Arg`](index.html#Arg)`): `[`I18n`](../-i18n/index.html)<br>To be called by translation users to obtain a specific I18n for this declaration. |

