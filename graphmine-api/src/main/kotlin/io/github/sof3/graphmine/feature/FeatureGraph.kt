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
	 * Registers a FeatureNode so that edges can be added upon it
	 */
	fun addNode(node: FeatureNode<*, *>)

	/**
	 * Registers a FeatureEdge
	 */
	fun addEdge(edge: FeatureEdge<out FeatureNode<*,*>,out FeatureNode<*,*>,out FeatureNodeInstance<*,*>,out FeatureNodeInstance<*,*>>)

	/**
	 * Dispatch a single-node event
	 */
	fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> dispatch(inst1: Inst1, inst2: Inst2, event: FeatureEvent)
	/**
	 * Dispatch a two-node event
	 */
	fun <Inst : FeatureNodeInstance<Inst, *>> dispatch(inst: Inst, event: FeatureEvent)
}
