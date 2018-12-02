# GraphMine
An experimental server software project. DO NOT TRY TO USE THIS. This is just a proof of concept.

[![Build Status](https://travis-ci.org/SOF3/GraphMine.svg?branch=master)](https://travis-ci.org/SOF3/GraphMine)

## What is this?
This is just yet another of SOFe's useless projects where he just writes the code and never tests it. **Do not expect a
working server software from someone who doesn't even have a client.**

Yes, there are unit tests, but there are no integration tests.

## So why is this here?
Often, I have some cool ideas for PocketMine, but the idea is too big, complicated or impractical to be implemented on
PocketMine. Since I am addicted in implementing crazy stuff, I created this repo to satisfy my own desires for
sophistication. Most ideas here are probably too impractical, e.g. a lot of effort is put into making sure multiple
players can control the same entity at the same time but see different things. And some effort is put into making sure
the server can run fluently as a pure proxy, and the server can also run fluently as a pure backend without actual
connecting players. Sound confusing and pointless? Yes, pointlessness is the point of this project.

In addition, Kotlin is a cool language that I want to master, but I don't have cool ideas to work on, so I resorted to
Minecraft server software again. I am too stupid to learn to make anything other than Minecraft-related stuff.

No project is perfect, but I hope this one is going to *look* better than PocketMine.

## How to run the project?
Development jar executables can be found in https://sof3.github.io/GraphMine/latestMaster.jar (but make sure you
actually want to run it -- it doesn't do anything useful!)

Oracle JDK 9 is not supported, but Oracle JDK 8 and OpenJDK 8 are both OK.

#### Project dependency graph

![](https://sof3.github.io/GraphMine/depGraph.png)

## Why is it called GraphMine?
GraphMine organizes features in a graph model. Features can be appended to or removed from the graph with a more
intuitive approach. However, the exact modelling of this graph is still yet to be defined.
