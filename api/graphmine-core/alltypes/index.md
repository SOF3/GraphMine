---
title: alltypes - graphmine-core
---

Main GraphMine code. All public classes and functions are stable API.

### All Types

| [io.github.sof3.graphmine.scope.BaseScope](../io.github.sof3.graphmine.scope/-base-scope/index.html) | Basic implementation of BaseScope |
| [io.github.sof3.graphmine.world.Block](../io.github.sof3.graphmine.world/-block/index.html) | Represents a block type. |
| [io.github.sof3.graphmine.world.BlockInstance](../io.github.sof3.graphmine.world/-block-instance/index.html) | Represents a block type at a certain location. The existence persistence of this block is irrelevant to whether the block is really at the location, ever at the location or has been removed. This is a pure value class. |
| [io.github.sof3.graphmine.world.BlockLocation](../io.github.sof3.graphmine.world/-block-location/index.html) | A unique identifier for an integer location. |
| [io.github.sof3.graphmine.world.Blocks](../io.github.sof3.graphmine.world/-blocks/index.html) | The list of default Block instances. Plugins are not expected to add custom block types to this list |
| [io.github.sof3.graphmine.client.Client](../io.github.sof3.graphmine.client/-client/index.html) |  |
| [io.github.sof3.graphmine.command.args.ClientArg](../io.github.sof3.graphmine.command.args/-client-arg/index.html) | Accepts a client name |
| [io.github.sof3.graphmine.client.ClientAttachable](../io.github.sof3.graphmine.client/-client-attachable.html) |  |
| [io.github.sof3.graphmine.command.Command](../io.github.sof3.graphmine.command/-command/index.html) | This class represents a command type. Each instance of Command should represent one registered command. |
| [io.github.sof3.graphmine.command.args.CommandArg](../io.github.sof3.graphmine.command.args/-command-arg/index.html) | Superclass of a command argument. |
| [io.github.sof3.graphmine.command.CommandException](../io.github.sof3.graphmine.command/-command-exception/index.html) | Represents any user-friendly errors reported from commands. |
| [io.github.sof3.graphmine.command.CommandExecutor](../io.github.sof3.graphmine.command/-command-executor/index.html) | The `this` context of command handlers. |
| [io.github.sof3.graphmine.command.CommandMap](../io.github.sof3.graphmine.command/-command-map/index.html) | Stores a list of commands. This class can also be instantiated at individual commands to provide a sub-command list. |
| [io.github.sof3.graphmine.command.CommandReceiver](../io.github.sof3.graphmine.command/-command-receiver/index.html) | Accepts output from a command. |
| [io.github.sof3.graphmine.command.CommandSender](../io.github.sof3.graphmine.command/-command-sender.html) | Represents an object that sends the command. |
| [io.github.sof3.graphmine.config.ConfigEntryDelegate](../io.github.sof3.graphmine.config/-config-entry-delegate/index.html) | The delegate class to a config entry |
| [io.github.sof3.graphmine.config.ConfigException](../io.github.sof3.graphmine.config/-config-exception/index.html) | Thrown when a config has some problems |
| [io.github.sof3.graphmine.config.ConfigGroupSpec](../io.github.sof3.graphmine.config/-config-group-spec/index.html) | Superclass of type specifications of groups in a [ConfigSpec](../io.github.sof3.graphmine.config/-config-spec/index.html) |
| [io.github.sof3.graphmine.config.ConfigMissingException](../io.github.sof3.graphmine.config/-config-missing-exception/index.html) | Thrown when a required entry is missing from a config |
| [io.github.sof3.graphmine.config.ConfigSpec](../io.github.sof3.graphmine.config/-config-spec/index.html) | Superclass for type specifications of .kts config files |
| [io.github.sof3.graphmine.config.ConfigValidationException](../io.github.sof3.graphmine.config/-config-validation-exception/index.html) | Thrown when an entry from a config is invalid |
| [io.github.sof3.graphmine.config.CoreConfig](../io.github.sof3.graphmine.config/-core-config/index.html) | Model for the server config.yml |
| [io.github.sof3.graphmine.feature.DoubleFeatureHandler](../io.github.sof3.graphmine.feature/-double-feature-handler/index.html) |  |
| [io.github.sof3.graphmine.command.EmptyOverload](../io.github.sof3.graphmine.command/-empty-overload/index.html) | An empty overload, reused for commands that do not require arguments. |
| [io.github.sof3.graphmine.entity.Entity](../io.github.sof3.graphmine.entity/-entity/index.html) | An entity is a mobile object that exists in a world |
| [io.github.sof3.graphmine.entity.EntityController](../io.github.sof3.graphmine.entity/-entity-controller/index.html) | Controls the actions of an entity. |
| [io.github.sof3.graphmine.entity.EntityState](../io.github.sof3.graphmine.entity/-entity-state/index.html) | Contains the savable data of an entity |
| [io.github.sof3.graphmine.entity.EntityViewEvent](../io.github.sof3.graphmine.entity/-entity-view-event.html) | Events that an entity's view changes. This may be due to changes in entity external views, blocks in world views, or other reasons. |
| [io.github.sof3.graphmine.command.args.EnumArg](../io.github.sof3.graphmine.command.args/-enum-arg/index.html) | Accepts a value that names one of the constants in the enum class |
| [io.github.sof3.graphmine.entity.ExternalView](../io.github.sof3.graphmine.entity/-external-view.html) | Represents one of the appearances of an entity. |
| [io.github.sof3.graphmine.entity.ExternalViewer](../io.github.sof3.graphmine.entity/-external-viewer/index.html) | Provides an adapter that determines how this entity looks to other entities. |
| [io.github.sof3.graphmine.feature.FeatureEdge](../io.github.sof3.graphmine.feature/-feature-edge/index.html) | Represents the implementation of a feature. |
| [io.github.sof3.graphmine.feature.FeatureEvent](../io.github.sof3.graphmine.feature/-feature-event.html) | Represents an event on some node(s). Implementations shall contain mutable and immutable properties for FeatureEdges to read and modify, except the FeatureNodeInstances do not need to be in the event since they are passed to the event in a different way. |
| [io.github.sof3.graphmine.feature.FeatureGraph](../io.github.sof3.graphmine.feature/-feature-graph/index.html) | The Feature Graph is the main registry of features in the server. It is an undirected multi-graph that allows FeatureEdges (the features themselves) to handle interaction events (FeatureEvent) between FeatureNodes (the objects of features, e.g. entities, blocks, or abstract concepts like commands), or self-loop edges that handle events on a single object (e.g. player join). |
| [io.github.sof3.graphmine.feature.FeatureNode](../io.github.sof3.graphmine.feature/-feature-node.html) | Represents a concrete or abstract concept that can interact with itself or other FeatureNodes, such as an entity, a block, a client or a command. |
| [io.github.sof3.graphmine.feature.FeatureNodeInstance](../io.github.sof3.graphmine.feature/-feature-node-instance/index.html) | Represents an instance of FeatureNode. The FeatureNode represents the type in general, while FeatureNodeInstance represents each instance of the type. It is valid for FeatureNodeInstance to be singleton or even same as the FeatureNode. For example, each instance of the Client class represents one client, while the singleton Client.Node companion object represents the client type. |
| [io.github.sof3.graphmine.HasLogger](../io.github.sof3.graphmine/-has-logger/index.html) | This interface only exists to avoid the boilerplate of calling the logger. |
| [io.github.sof3.graphmine.command.args.IntegerArg](../io.github.sof3.graphmine.command.args/-integer-arg/index.html) | Accepts integer arguments. |
| [io.github.sof3.graphmine.entity.InternalViewer](../io.github.sof3.graphmine.entity/-internal-viewer/index.html) | Acts like the receiver to the camera signals of an entity |
| [io.github.sof3.graphmine.world.Location](../io.github.sof3.graphmine.world/-location/index.html) | Represents a point in the 3D space of a world. |
| [io.github.sof3.graphmine.command.args.NumberArg](../io.github.sof3.graphmine.command.args/-number-arg/index.html) | Accepts any finite real-numeric arguments. |
| [io.github.sof3.graphmine.command.Overload](../io.github.sof3.graphmine.command/-overload/index.html) | Defines the parameters of a command. |
| [io.github.sof3.graphmine.command.args.RawTextArg](../io.github.sof3.graphmine.command.args/-raw-text-arg/index.html) | Accepts the rest of the whole line literally |
| [io.github.sof3.graphmine.command.RegisteredOverload](../io.github.sof3.graphmine.command/-registered-overload/index.html) | A factory that creates a new instance of a known command overload for each command execution. |
| [io.github.sof3.graphmine.scope.Scope](../io.github.sof3.graphmine.scope/-scope/index.html) | A Scope represents some period of persistence. Features are enabled only during the scope is not disposed. Builtin scopes include: |
| [io.github.sof3.graphmine.Server](../io.github.sof3.graphmine/-server/index.html) | The Server should be the object that links up different components of the server. |
| [io.github.sof3.graphmine.config.ServerConfig](../io.github.sof3.graphmine.config/-server-config/index.html) | Settings for the server |
| [io.github.sof3.graphmine.config.SimpleConfigEntry](../io.github.sof3.graphmine.config/-simple-config-entry/index.html) |  |
| [io.github.sof3.graphmine.feature.SingleFeatureEdge](../io.github.sof3.graphmine.feature/-single-feature-edge/index.html) | Convenience implementation of self-looping FeatureEdge |
| [io.github.sof3.graphmine.feature.SingleFeatureHandler](../io.github.sof3.graphmine.feature/-single-feature-handler/index.html) |  |
| [io.github.sof3.graphmine.command.args.StringArg](../io.github.sof3.graphmine.command.args/-string-arg/index.html) | Accepts the next value in the line. Multi-word arguments can be quoted by `""` or their spaces escaped by `\` before. |
| [io.github.sof3.graphmine.command.impl.VersionCommand](../io.github.sof3.graphmine.command.impl/-version-command.html) | Implements the /version command |
| [io.github.sof3.graphmine.VersionInfo](../io.github.sof3.graphmine/-version-info/index.html) | Holds the static version information for this build |
| [io.github.sof3.graphmine.world.World](../io.github.sof3.graphmine.world/-world.html) | Each world has its set of 3D space. Usually, this is implemented as one saved map, but plugins may create virtual worlds, remote worlds or anything that features the characteristics as required by the interface. |
| [io.github.sof3.graphmine.world.WorldPartition](../io.github.sof3.graphmine.world/-world-partition.html) | Represents a partition of a World. World partitioning is controlled by the server based on WorldUser activity. |
| [io.github.sof3.graphmine.world.WorldUser](../io.github.sof3.graphmine.world/-world-user.html) | Represents a user of a world that holds resources from being freed. |
| [io.github.sof3.graphmine.world.WorldView](../io.github.sof3.graphmine.world/-world-view.html) | An adapter that intercepts between a world viewer and the actual world. |
| [io.github.sof3.graphmine.command.WrongSyntaxException](../io.github.sof3.graphmine.command/-wrong-syntax-exception/index.html) | Thrown when a command with wrong syntax is sent. |

