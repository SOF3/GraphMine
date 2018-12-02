---
title: io.github.sof3.graphmine.i18n - graphmine-i18n
---

[graphmine-i18n](../index.html) / [io.github.sof3.graphmine.i18n](./index.html)

## Package io.github.sof3.graphmine.i18n

### Types

| [Declaration](-declaration/index.html) | `class Declaration<Arg : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`LangSpec`](-lang-spec/index.html)`<*>, `[`Declaration`](-declaration/index.html)`<`[`Arg`](-declaration/index.html#Arg)`>>` |
| [GroupSpec](-group-spec/index.html) | `abstract class GroupSpec<Self : `[`GroupSpec`](-group-spec/index.html)`<`[`Self`](-group-spec/index.html#Self)`>> : `[`LangSpec`](-lang-spec/index.html)`<`[`Self`](-group-spec/index.html#Self)`>` |
| [I18n](-i18n/index.html) | `interface I18n` |
| [I18nable](-i18nable/index.html) | `interface I18nable`<br>An object that can be expressed i18nly |
| [LangSpec](-lang-spec/index.html) | `abstract class LangSpec<Self : `[`LangSpec`](-lang-spec/index.html)`<`[`Self`](-lang-spec/index.html#Self)`>>` |
| [LiteralI18N](-literal-i18-n/index.html) | `class LiteralI18N : `[`I18n`](-i18n/index.html) |
| [SpecI18N](-spec-i18-n/index.html) | `class SpecI18N<Arg : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`I18n`](-i18n/index.html) |

### Type Aliases

| [Translation](-translation.html) | `typealias Translation<T> = `[`T`](-translation.html#T)`.() -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Extensions for External Classes

| [kotlin.String](kotlin.-string/index.html) |  |

### Functions

| [loadLangScript](load-lang-script.html) | `fun <T : `[`LangSpec`](-lang-spec/index.html)`<`[`T`](load-lang-script.html#T)`>> loadLangScript(locales: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

