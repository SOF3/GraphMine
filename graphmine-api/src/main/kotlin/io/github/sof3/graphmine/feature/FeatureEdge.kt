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
 * Represents the implementation of a feature.
 *
 * FeatureGraph.handle() provides a convenience inline function for implementing this.
 * @see FeatureGraph.handle
 */
interface FeatureEdge<
		Node1 : FeatureNode<Node1, Inst1>,
		Node2 : FeatureNode<Node2, Inst2>,
		Inst1 : FeatureNodeInstance<Inst1, Node1>,
		Inst2 : FeatureNodeInstance<Inst2, Node2>
		> {
	/**
	 * Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter.
	 */
	val node1: Node1
	/**
	 * Represents one of the endpoint FeatureNodes. Swapping node1 and node2 does not matter.
	 */
	val node2: Node2

	/**
	 * The implementation to handle the FeatureEvent.
	 */
	fun handle(inst1: Inst1, inst2: Inst2, event: FeatureEvent)
}

/**
 * Convenience implementation of self-looping FeatureEdge
 */
interface SingleFeatureEdge<Node : FeatureNode<Node, Inst>, Inst : FeatureNodeInstance<Inst, Node>>
	: FeatureEdge<Node, Node, Inst, Inst> {
	/**
	 * the node that the edge incidents with
	 */
	val node: Node
	override val node1 get() = node
	override val node2 get() = node

	override fun handle(inst1: Inst, inst2: Inst, event: FeatureEvent) {
		assert(inst1 === inst2)
		return handle(inst1, event)
	}

	/**
	 * The implementation to handle the FeatureEvent.
	 */
	fun handle(inst: Inst, event: FeatureEvent)
}
