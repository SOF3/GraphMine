---
title: Overload.<init> - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Overload](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Overload()`

Defines the parameters of a command.

Commands that have parameters should create classes extending Overload. The subclass should contain backing
properties delegated to one of the [CommandArg](../../io.github.sof3.graphmine.command.args/-command-arg/index.html) factory methods like [string](string.html), [integer](integer.html), etc.

If another module wants to implement its own [CommandArg](../../io.github.sof3.graphmine.command.args/-command-arg/index.html) types, it can create extension functions on [Overload](index.html) that
constructs the CommandArg, calls the [addArg](add-arg.html) function and returns the new CommandArg instance.

