---
title: RawTextArg - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command.args](../index.html) / [RawTextArg](./index.html)

# RawTextArg

`class RawTextArg : `[`CommandArg`](../-command-arg/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`

Accepts the rest of the whole line literally

### Constructors

| [&lt;init&gt;](-init-.html) | `RawTextArg()`<br>Accepts the rest of the whole line literally |

### Inherited Properties

| [default](../-command-arg/default.html) | `var default: `[`T`](../-command-arg/index.html#T)`?`<br>Sets the default value of the command. Implicitly sets [optional](../-command-arg/optional.html) to `true` (even if the set value is `null`) |
| [optional](../-command-arg/optional.html) | `var optional: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Whether the command arg can be skipped |
| [value](../-command-arg/value.html) | `lateinit var value: `[`T`](../-command-arg/index.html#T)<br>The received value of the argument |

### Functions

| [parse](parse.html) | `fun parse(parser: FormattedStringReader): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Reads the next value in the parser into the value for the argument |

### Inherited Functions

| [accept](../-command-arg/accept.html) | `fun accept(parser: FormattedStringReader): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Reads the next value in the parser into the value for the argument. |
| [default](../-command-arg/default.html) | `fun default(value: `[`T`](../-command-arg/index.html#T)`): `[`CommandArg`](../-command-arg/index.html)`<`[`T`](../-command-arg/index.html#T)`>`<br>Sets the default value of the command. Implicitly sets [optional](../-command-arg/optional.html) to `true` (even if the set value is `null`) |
| [provideDelegate](../-command-arg/provide-delegate.html) | `open fun provideDelegate(thisRef: `[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, property: `[`KProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)`<*>): `[`ReadOnlyProperty`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.properties/-read-only-property/index.html)`<`[`Overload`](../../io.github.sof3.graphmine.command/-overload/index.html)`, `[`T`](../-command-arg/index.html#T)`>` |

