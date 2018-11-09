package io.github.sof3.graphmine.impl.client

import io.github.sof3.graphmine.feature.FeatureNode
import io.github.sof3.graphmine.feature.FeatureNodeInstance

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
 * Represents an established incoming connection.
 */
class Client : FeatureNodeInstance<Client, Client.Node> {
	/**
	 * The FeatureNode for Client
	 */
	companion object Node : FeatureNode<Node, Client>

	override val node get() = Node

	/**
	 * The ClientAttachable that the client is currently attached to. `null` if client is currently not attached to anything
	 */
	var attached: ClientAttachable? = null
}
