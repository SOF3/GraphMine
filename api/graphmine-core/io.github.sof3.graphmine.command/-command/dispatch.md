---
title: Command.dispatch - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [Command](index.html) / [dispatch](./dispatch.html)

# dispatch

`fun dispatch(reader: FormattedStringReader, sender: `[`CommandSender`](../-command-sender.html)`, receiver: `[`CommandReceiver`](../-command-receiver/index.html)`): Job`

Executes the command.

The command is run as a new coroutine in [the command's owner scope](scope.html).

### Parameters

`reader` - the reader containing the command arguments. The reader pointer should start at the first character
of the command arguments.

`sender` - the [CommandSender](../-command-sender.html) that sent the command

`receiver` - the object that accepts the command output and presents it to the sender.