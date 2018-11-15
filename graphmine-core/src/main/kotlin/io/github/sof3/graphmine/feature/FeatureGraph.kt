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
class FeatureGraph {
	/**
	 * the features registered on this server
	 */
	val edges: MutableMap<FeatureNode<*, *>,
			MutableMap<FeatureNode<*, *>,
					MutableSet<FeatureEdge<*, *, *, *>>>> = hashMapOf()

	/**
	 * Registers a FeatureNode so that edges can be added upon it
	 */
	fun addNode(node: FeatureNode<*, *>) {
		edges[node] = mutableMapOf()
	}

	/**
	 * Registers a FeatureEdge
	 */
	fun addEdge(edge: FeatureEdge<
			out FeatureNode<*, *>,
			out FeatureNode<*, *>,
			out FeatureNodeInstance<*, *>,
			out FeatureNodeInstance<*, *>>
	) {
		edges[edge.node1]!![edge.node2]!!.add(edge)
		edges[edge.node2]!![edge.node1]!!.add(edge)
	}

	/**
	 * Dispatch a single-node event
	 */
	fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>>
			dispatch(inst1: Inst1, inst2: Inst2, event: FeatureEvent) {
		getEdges(inst1, inst1)?.forEach { it.handle(inst1, inst1, event) }
		getEdges(inst1, inst2)?.forEach { it.handle(inst1, inst2, event) }
//		getEdges(inst2, inst1)?.forEach { it.handle(inst2, inst1, event) } // edges should have been registered bidirectionally
		getEdges(inst2, inst2)?.forEach { it.handle(inst2, inst2, event) }
	}

	/**
	 * Dispatch a two-node event
	 */
	fun <Inst : FeatureNodeInstance<Inst, *>> dispatch(inst: Inst, event: FeatureEvent) {
		getEdges(inst, inst)?.forEach { it.handle(inst, inst, event) }
	}

	@Suppress("UNCHECKED_CAST")
	private fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> getEdges(inst1: Inst1, inst2: Inst2):
			MutableSet<FeatureEdge<out FeatureNode<*, Inst1>, out FeatureNode<*, Inst2>, Inst1, Inst2>>? =
			edges[inst1.node]!![inst2.node] as MutableSet<FeatureEdge<out FeatureNode<*, Inst1>, out FeatureNode<*, Inst2>, Inst1, Inst2>>?
}

/**
 * A convenient wrapper for FeatureGraph.addEdge and SingleFeatureEdge construction (for one node)
 */
inline fun <Node : FeatureNode<Node, Inst>, Inst : FeatureNodeInstance<Inst, Node>, reified Ev : FeatureEvent>
		FeatureGraph.handle(node: Node, crossinline fn: (inst: Inst, event: Ev) -> Unit) {
	addEdge(SingleFeatureHandler(node) { inst, event -> if (event is Ev) fn(inst, event) })
}

/** @internal */
class SingleFeatureHandler<Node : FeatureNode<Node, Inst>, Inst : FeatureNodeInstance<Inst, Node>>(
		override val node: Node,
		private val fn: (inst: Inst, event: FeatureEvent) -> Unit
) : SingleFeatureEdge<Node, Inst> {
	override fun handle(inst: Inst, event: FeatureEvent) = fn(inst, event)
}

/**
 * A convenient wrapper for FeatureGraph.addEdge and FeatureEdge construction (for two nodes)
 */
inline fun <Node1 : FeatureNode<Node1, Inst1>, Inst1 : FeatureNodeInstance<Inst1, Node1>,
		Node2 : FeatureNode<Node2, Inst2>, Inst2 : FeatureNodeInstance<Inst2, Node2>,
		reified Ev : FeatureEvent>
		FeatureGraph.handle(node1: Node1, node2: Node2, crossinline fn: (inst1: Inst1, inst2: Inst2, event: Ev) -> Unit) {
	addEdge(DoubleFeatureHandler(node1, node2) { inst1, inst2, event -> if (event is Ev) fn(inst1, inst2, event) })
}

/** @internal */
class DoubleFeatureHandler<Node1 : FeatureNode<Node1, Inst1>, Inst1 : FeatureNodeInstance<Inst1, Node1>,
		Node2 : FeatureNode<Node2, Inst2>, Inst2 : FeatureNodeInstance<Inst2, Node2>>(
		override val node1: Node1,
		override val node2: Node2,
		private val fn: (Inst1, Inst2, FeatureEvent) -> Unit
) : FeatureEdge<Node1, Node2, Inst1, Inst2> {
	override fun handle(inst1: Inst1, inst2: Inst2, event: FeatureEvent) = fn(inst1, inst2, event)
}
