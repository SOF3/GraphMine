# GraphMine
An experimental server software project. DO NOT TRY TO USE THIS. This is just a proof of concept.

[![Build Status](https://travis-ci.org/SOF3/GraphMine.svg?branch=master)](https://travis-ci.org/SOF3/GraphMine)

## What is this?
This is just yet another of SOFe's useless projects where he just writes the code and never tests it. **Do not expect a working server software from someone who doesn't even have a client.**

## So why is this here?
This software is created only to demonstrate some of my understanding of large project design patterns after years struggling with PocketMine.

No project is perfect, but I hope this one is going to *look* better than PocketMine.

## How to run the project?
Development jar executables can be found in https://sof3.github.io/latestMaster.jar

## Development setup
Checkout the project from IntelliJ IDEA directly. The .idea directory will have setup the project code styles, file templates, inspection profiles and gradle project paths.

There are currently 6 subprojects:
- graphmine-util: utility code that are not directly related to GraphMine
- graphmine-i18n: The i18n framework uesd by GraphMine. This may be made an independent project in the future.
- graphmine-i18n-core: Declares the i18n strings required by GraphMine in the `main/kotlin` module and implements them in the `main/resources` module
- graphmine-api: The stable plugin API
- graphmine-core: Contains the implementation of graphmine-api
- graphmine-cli: An executable project that wraps the core and exposes a user interface through standard I/O (command line interface for terminal users)

There may be a 5th subproject in the future:
- graphmine-gui: An executable project that wraps the core and exposes a user interface through Java Swing or JavaFX (graphical user interface for non-terminal users)

## Why is it called GraphMine?
GraphMine organizes features in a graph model. Features can be appended to or removed from the graph with a more intuitive approach.
