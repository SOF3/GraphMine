# Module graphmine-i18n
This module provides a kotlin-flavoured i18n (internationalization) framework.

## Main Concepts
### Locale
A locale refers to a human language. It does not need to be an ISO-639 language code; the convention should be determined by the user of this module based on its context, as long as it can be represented in a simple `kotlin.String`.

### i18n
An i18n object represents a text displayed differently given different locales. In code, it is represented with the `I18n` interface

Logically, i18n is the conversion `(locale: String) -> (humanReadable: String)`

### Declaration
A declaration is the specification that a dynamic i18n is required by a module based on an argument of type `Arg`. This `Arg` type should either be `Unit` or a kotlin `data class`.

Logically, a declaration has the conversions:
- `(arg: Arg) -> i18n`
- `(arg: Arg, locale: String) -> (humanReadable: String)`
- `(locale: Locale) -> Translation` (in the next section)

### Translation
A translation is the specialization of a declaration in a particular locale. In code, it is represented with the lambda function `(arg: Arg) -> (humanReadable: String)`.

Translations may perform any memoryless operations, i.e. given the same `Arg` and the same current timestamp, a translation should always return the same string.

### Path
A path is the unique identifier of a declaration within a module, composed of one or multiple valid JVM identifier (including those that require the `backtick` syntax in kotlin) strings. In code, a path is represented as an `Array<String>`.

## Usage
A module may require translations by declaring a LangSpec class:

```kotlin
class MySpecName : LangSpec<MySpecName>() {
	val declOne by accept<Unit>() // creates the declaration with path "declOne" and arg type "Unit", i.e. it does not require an argument.
	
	val declTwo by accept<ArgTwo>() // creates the declaration with path "declTwo" and arg type "ArgTwo"
	data class ArgTwo(val one: String, val two: Int) // translations can reference them as $one and $two
	
	val groupThree by group(GroupThree())
	class GroupThree : GroupSpec<GroupThree>() {
		val subFour by accept<Unit>() // creates the declaration with path "groupThree.subFour"
		val subFive by accept<ArgTwo>() // arg types may be reused.
	}
}
```

Also create a convenience infix function:

```kotlin
infix fun String.translatesMySpecName (fn: MySpecName.() -> Unit) = MySpecName().apply {
	locale = this@translatesMySpecName
	fn()
}
```

Translations scripts can then invoke strings with lambdas on this class:

```kotlin
"en_US" translatesMySpecName { // provides translations in the locale "en_US"
	declOne { "Hello world!" }
	declTwo { "arg1 is $one and arg2 is half of ${two * 2}" }
	groupThree {
		subFour = "this is an inner translation"
		subFive = "I don't actually need to use all the args provided, because I only like $two but not one."
	}
}
```

Not all messages need to be translated. If it is not provided in one locale, it fallbacks to the first locale registered, then the second one, vice versa. If it is not found in any locales, the message path will be used..

```kotlin
"zh_HK" translatesMySpecName {
	declOne { "你好，世界！" }
	declTwo { "第一個參數是$one，而第二個參數是${two}的一半" }
	groupThree {
		// we skipped subFour, and this is OK
		subFive = "英文翻譯中沒有用${one}，但是在其他語言中也可以用。"
	}
}
```

Note that in locales without spaces, translations may need to wrap variable references with `${}`. In this zh_HK example, normal Chinese characters like `的一半` are parsed as part of the variable name without the `{}`, while Chinese punctuation characters are not. Since the translator may be unsure whether a character is a valid JVM identifier, it is recommended that variables always be quoted (even unnecessarily).

Scripts should be placed in the spec class resource path, i.e. if the LangSpec subclass is `io.github.sof3.graphmine.i18n.core.CoreSpec`, the lang scripts should be placed in `io/github/sof3/graphmine/i18n/core/{locale}.lang.kts` of the corresponding resources directory.

To load the scripts into a `LangSpec` object, call `io.github.sof3.graphmine.i18n.loadLangScript` with the `LangSpec` subclass as the type parameter and a list of locale names as the argument:

```kotlin
val spec = loadLangScript<MySpecName>(listOf(
	"en_US",
	"zh_HK"
))
```

One of the instances of `MySpecName` will be returned (it is undefined which one is returned). Whichever instance it returns, the API is the same: To retrieve the I18nable representation of a message `path.to.decl`, simply call `spec.path.to.decl.i18n()` (or `spec.path.to.decl.i18n(arg)` if it requires an argument).

Note: Although a `LangSpec` object is created for every locale, the `.i18n` accessor works the same in any locale of `LangSpec`, so just take any `LangSpec` returned by the translation scripts.

