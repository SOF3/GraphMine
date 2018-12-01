---
title: io.github.sof3.graphmine.util.qualifier - graphmine-util
---

[graphmine-util](../index.html) / [io.github.sof3.graphmine.util.qualifier](./index.html)

## Package io.github.sof3.graphmine.util.qualifier

This package provides the Qualifier API, which is used to resolve name clashes.

When multiple modules add to the same registry with the same name, a name clash occurs. The module identifier can be
used to distinguish others from multiple modules. On the other hand, it is inconvenient if users have to type the whole
name from the module identifier. Therefore, a gradual approach is used: If the base name does not have a clash, only
typing the base name is enough. Otherwise, the user has to add one more part of the qualifier. This process repeats
until there is no longer any ambiguity.

The qualifier string should be dot-separated. By convention, it starts with the module identifier (usually the module
package), then the object name. Since the same module should not register two objects with the same name, it is not
necessary to subdivide under the package. Moreover, to make the second part of the object name (which usually
distinguishes most of the collision) more intuitive, it should be the module name.

For example, if there is a plugin called "ChestLock" and two plugins called "PortKey" that implement a "key" command,
they might have qualified command names like this:

```
io.github.foo.ChestLock.key
com.gmail.bar.PortKey.key
com.example.qux.PortKey.key
```

When the user uses the "key" command, there are three possibilities, so typing "ChestLock.key" instead (or usually the
case-insensitive situation) would distinguish that the user wants to run the key command from ChestLock. Otherwise, the
user wants to run the key command from the PortKey plugin, but there are two PortKey plugins (which is quite strange
and unlikely), so the user types the full package name of the PortKey plugin to specify which plugin to use.

### Types

| [Qualifier](-qualifier/index.html) | `class Qualifier`<br>Represents a qualified identifier. |
| [QualifierMap](-qualifier-map/index.html) | `class QualifierMap<T>` |

### Extensions for External Classes

| [kotlin.String](kotlin.-string/index.html) |  |

