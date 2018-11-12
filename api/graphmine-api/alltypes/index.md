---
title: alltypes - graphmine-api
---

### All Types

| [io.github.sof3.graphmine.command.args.ArgValidator](../io.github.sof3.graphmine.command.args/-arg-validator.html) | Checks whether a command argument is valid. Returns null if valid, or an I18nable to be sent to the CommandSender if invalid. |
| [io.github.sof3.graphmine.scope.BaseScope](../io.github.sof3.graphmine.scope/-base-scope/index.html) | Basic implementation of BaseScope |
| [io.github.sof3.graphmine.world.Block](../io.github.sof3.graphmine.world/-block/index.html) | Represents a block type. |
| [io.github.sof3.graphmine.world.BlockInstance](../io.github.sof3.graphmine.world/-block-instance/index.html) | Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the block is really at the location, ever at the location or has been removed. This is a pure value class. |
| [io.github.sof3.graphmine.world.BlockLocation](../io.github.sof3.graphmine.world/-block-location/index.html) | A unique identifier for an integer location. |
| [io.github.sof3.graphmine.world.Blocks](../io.github.sof3.graphmine.world/-blocks/index.html) | The list of default Block instances. Plugins are not expected to add custom block types to this list |
| [io.github.sof3.graphmine.command.Command](../io.github.sof3.graphmine.command/-command/index.html) |  |
| [io.github.sof3.graphmine.command.args.CommandArg](../io.github.sof3.graphmine.command.args/-command-arg/index.html) |  |
| [io.github.sof3.graphmine.command.CommandBuilder](../io.github.sof3.graphmine.command/-command-builder/index.html) |  |
| [io.github.sof3.graphmine.command.CommandExecuteContext](../io.github.sof3.graphmine.command/-command-execute-context/index.html) |  |
| [io.github.sof3.graphmine.command.CommandOverload](../io.github.sof3.graphmine.command/-command-overload/index.html) |  |
| [io.github.sof3.graphmine.command.CommandSender](../io.github.sof3.graphmine.command/-command-sender.html) | To be implemented by anything that can send a command |
| [io.github.sof3.graphmine.config.Config](../io.github.sof3.graphmine.config/-config/index.html) | Model for the server config.yml |
| [io.github.sof3.graphmine.feature.FeatureEdge](../io.github.sof3.graphmine.feature/-feature-edge/index.html) | Represents the implementation of a feature. |
| [io.github.sof3.graphmine.feature.FeatureEvent](../io.github.sof3.graphmine.feature/-feature-event.html) | Represents an event on some node(s). Implementations shall contain mutable and immutable properties for FeatureEdges to read and modify, except the FeatureNodeInstances do not need to be in the event since they are passed to the event in a different way. |
| [io.github.sof3.graphmine.feature.FeatureGraph](../io.github.sof3.graphmine.feature/-feature-graph/index.html) | The Feature Graph is the main registry of features in the server. It is an undirected multi-graph that allows FeatureEdges (the features themselves) to handle interaction events (FeatureEvent) between FeatureNodes (the objects of features, e.g. entities, blocks, or abstract concepts like commands), or self-loop edges that handle events on a single object (e.g. player join). |
| [io.github.sof3.graphmine.feature.FeatureNode](../io.github.sof3.graphmine.feature/-feature-node.html) | Represents a concrete or abstract concept that can interact with itself or other FeatureNodes, such as an entity, a block, a client or a command. |
| [io.github.sof3.graphmine.feature.FeatureNodeInstance](../io.github.sof3.graphmine.feature/-feature-node-instance/index.html) | Represents an instance of FeatureNode. The FeatureNode represents the type in general, while FeatureNodeInstance represents each instance of the type. It is valid for FeatureNodeInstance to be singleton or even same as the FeatureNode. For example, each instance of the Client class represents one client, while the singleton Client.Node companion object represents the client type. |
| [io.github.sof3.graphmine.command.args.IntegerArg](../io.github.sof3.graphmine.command.args/-integer-arg/index.html) |  |
| [io.github.sof3.graphmine.world.Location](../io.github.sof3.graphmine.world/-location/index.html) | Represents a point in the 3D space of a world. |
| [io.github.sof3.graphmine.scope.Scope](../io.github.sof3.graphmine.scope/-scope/index.html) | A Scope represents some period of persistence. Features are enabled only during the scope is not disposed. Builtin scopes include: |
| [io.github.sof3.graphmine.Server](../io.github.sof3.graphmine/-server/index.html) | The Server should be the object that links up different components of the server. |
| [io.github.sof3.graphmine.feature.SingleFeatureEdge](../io.github.sof3.graphmine.feature/-single-feature-edge/index.html) | Convenience implementation of self-looping FeatureEdge |
| [io.github.sof3.graphmine.command.args.StringArg](../io.github.sof3.graphmine.command.args/-string-arg/index.html) |  |
| [io.github.sof3.graphmine.VersionInfo](../io.github.sof3.graphmine/-version-info/index.html) | Holds the static version information for this build |
| [io.github.sof3.graphmine.world.World](../io.github.sof3.graphmine.world/-world.html) | Each world has its set of 3D space. Usually, this is implemented as one saved map, but plugins may create virtual worlds, remote worlds or anything that features the characteristics as required by the interface. |
| [io.github.sof3.graphmine.world.WorldPartition](../io.github.sof3.graphmine.world/-world-partition.html) | Represents a partition of a World. World partitioning is controlled by the server based on WorldUser activity. |
| [io.github.sof3.graphmine.world.WorldUser](../io.github.sof3.graphmine.world/-world-user.html) | Represents a user of a world that holds resources from being freed. |

