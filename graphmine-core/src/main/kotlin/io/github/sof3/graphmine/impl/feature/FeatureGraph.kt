package io.github.sof3.graphmine.impl.feature

import io.github.sof3.graphmine.feature.*
import io.github.sof3.graphmine.feature.FeatureGraph

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

class FeatureGraph : FeatureGraph {
	override val edges: MutableMap<FeatureNode<*, *>, MutableMap<FeatureNode<*, *>, MutableSet<FeatureEdge<out FeatureNode<*, *>, out FeatureNode<*, *>, out FeatureNodeInstance<*, *>, out FeatureNodeInstance<*, *>>>>> = mutableMapOf()

	override fun addNode(node: FeatureNode<*, *>) {
		edges[node] = mutableMapOf()
	}

	override fun addEdge(edge: FeatureEdge<out FeatureNode<*, *>, out FeatureNode<*, *>, out FeatureNodeInstance<*, *>, out FeatureNodeInstance<*, *>>) {
		edges[edge.node1]!![edge.node2]!!.add(edge)
		edges[edge.node2]!![edge.node1]!!.add(edge)
	}

	override fun <Inst : FeatureNodeInstance<Inst, *>> dispatch(inst: Inst, event: FeatureEvent) {
		getEdges(inst, inst)?.forEach { it.handle(inst, inst, event) }
	}

	override fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> dispatch(inst1: Inst1, inst2: Inst2, event: FeatureEvent) {
		getEdges(inst1, inst1)?.forEach { it.handle(inst1, inst1, event) }
		getEdges(inst1, inst2)?.forEach { it.handle(inst1, inst2, event) }
//		getEdges(inst2, inst1)?.forEach { it.handle(inst2, inst1, event) } // edges should have been registered bidirectionally
		getEdges(inst2, inst2)?.forEach { it.handle(inst2, inst2, event) }
	}

	@Suppress("UNCHECKED_CAST")
	private fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> getEdges(inst1: Inst1, inst2: Inst2):
			MutableSet<FeatureEdge<out FeatureNode<*, Inst1>, out FeatureNode<*, Inst2>, Inst1, Inst2>>? =
			edges[inst1.node]!![inst2.node] as MutableSet<FeatureEdge<out FeatureNode<*, Inst1>, out FeatureNode<*, Inst2>, Inst1, Inst2>>?
}
