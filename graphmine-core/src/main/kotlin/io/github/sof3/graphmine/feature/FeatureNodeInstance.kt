package io.github.sof3.graphmine.feature

/*
 * GraphMine
 * Copyright (C) 2018 SOFe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

/**
 * Represents an instance of FeatureNode. The FeatureNode represents the type in general, while FeatureNodeInstance
 * represents each instance of the type. It is valid for FeatureNodeInstance to be singleton or even same as the
 * FeatureNode. For example, each instance of the Client class represents one client, while the singleton Client.Node
 * companion object represents the client type.
 */
interface FeatureNodeInstance<Self : FeatureNodeInstance<Self, Node>, Node : FeatureNode<Node, Self>> {
	/**
	 * the corresponding node for the instance.
	 */
	val node: Node
}
