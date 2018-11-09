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
 * The Feature Graph is the main registry of features in the server. It is an undirected multi-graph that allows
 * FeatureEdges (the features themselves) to handle interaction events (FeatureEvent) between FeatureNodes (the objects
 * of features, e.g. entities, blocks, or abstract concepts like commands), or self-loop edges that handle events on
 * a single object (e.g. player join).
 */
interface FeatureGraph {
	/**
	 * the features registered on this server
	 */
	val edges: MutableMap<FeatureNode<*, *>, MutableMap<FeatureNode<*, *>, MutableSet<FeatureEdge<out FeatureNode<*, *>, out FeatureNode<*, *>, out FeatureNodeInstance<*, *>, out FeatureNodeInstance<*, *>>>>>

	/**
	 * Registers a FeatureNode so that edges can be added upon it
	 */
	fun addNode(node: FeatureNode<*, *>)

	/**
	 * Registers a FeatureEdge
	 */
	fun addEdge(edge: FeatureEdge<out FeatureNode<*, *>, out FeatureNode<*, *>, out FeatureNodeInstance<*, *>, out FeatureNodeInstance<*, *>>)

	/**
	 * Dispatch a single-node event
	 */
	fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> dispatch(inst1: Inst1, inst2: Inst2, event: FeatureEvent)

	/**
	 * Dispatch a two-node event
	 */
	fun <Inst : FeatureNodeInstance<Inst, *>> dispatch(inst: Inst, event: FeatureEvent)
}

/**
 * A convenient wrapper for FeatureGraph.addEdge and SingleFeatureEdge construction (for one node)
 */
inline fun <Node : FeatureNode<Node, Inst>, Inst : FeatureNodeInstance<Inst, Node>, reified Ev : FeatureEvent>
		FeatureGraph.handle(node: Node, crossinline fn: (inst: Inst, event: Ev) -> Unit) {
	addEdge(object : SingleFeatureEdge<Node, Inst> {
		override val node = node
		override fun handle(inst: Inst, event: FeatureEvent) {
			if (event is Ev) {
				fn(inst, event)
			}
		}
	})
}

/**
 * A convenient wrapper for FeatureGraph.addEdge and FeatureEdge construction (for two nodes)
 */
inline fun <Node1 : FeatureNode<Node1, Inst1>, Inst1 : FeatureNodeInstance<Inst1, Node1>,
		Node2 : FeatureNode<Node2, Inst2>, Inst2 : FeatureNodeInstance<Inst2, Node2>,
		reified Ev : FeatureEvent>
		FeatureGraph.handle(node1: Node1, node2: Node2, crossinline fn: (inst1: Inst1, inst2: Inst2, event: Ev) -> Unit) {
	addEdge(object : FeatureEdge<Node1, Node2, Inst1, Inst2> {
		override val node1: Node1 = node1
		override val node2: Node2 = node2
		override fun handle(inst1: Inst1, inst2: Inst2, event: FeatureEvent) {
			if (event is Ev) {
				fn(inst1, inst2, event)
			}
		}
	})
}
