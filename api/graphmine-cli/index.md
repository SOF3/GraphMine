---
title: graphmine-cli
---

[graphmine-cli](./index.html)

An executable project that wraps the core and exposes a user interface through standard I/O (command line interface for terminal users)

## Threading

### Main thread

This module contains a `fun main` entry point. The Server object is constructed from this thread. This thread exits after the server has been fully initialized.

### Stdin thread

This module starts a thread for reading input from stdin.

### Shutdown thread

A thread is started when the user sends a shutdown signal e.g. SIGINT. The thread exits as soon as the signal has been
sent to the server's corresponding handlers.

### Packages

| [io.github.sof3.graphmine.cli](io.github.sof3.graphmine.cli/index.html) |  |

### Index

[All Types](alltypes/index.html)