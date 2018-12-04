---
title: TerminalSignal - graphmine-core
---

[graphmine-core](../../index.html) / [io.github.sof3.graphmine.command](../index.html) / [TerminalSignal](./index.html)

# TerminalSignal

`sealed class TerminalSignal`

Any signals received from the abstract console are expressed as a [TerminalSignal](./index.html).

### Types

| [Cmd](-cmd/index.html) | `class Cmd : `[`TerminalSignal`](./index.html)<br>Represents a line of command |
| [Eod](-eod.html) | `object Eod : `[`TerminalSignal`](./index.html)<br>Represents an EOD (end of data) signal, implying that the input is closed |
| [Int](-int.html) | `object Int : `[`TerminalSignal`](./index.html)<br>Represents a SIGINT or otherwise force-shutdown signal. |

### Inheritors

| [Cmd](-cmd/index.html) | `class Cmd : `[`TerminalSignal`](./index.html)<br>Represents a line of command |
| [Eod](-eod.html) | `object Eod : `[`TerminalSignal`](./index.html)<br>Represents an EOD (end of data) signal, implying that the input is closed |
| [Int](-int.html) | `object Int : `[`TerminalSignal`](./index.html)<br>Represents a SIGINT or otherwise force-shutdown signal. |

