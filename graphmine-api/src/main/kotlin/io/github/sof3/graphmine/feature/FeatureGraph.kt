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

interface FeatureGraph {
	fun addNode(node: FeatureNode<*, *>)

	fun <Inst : FeatureNodeInstance<Inst, *>> dispatch(inst: Inst, event: FeatureEvent)
	fun <Inst1 : FeatureNodeInstance<Inst1, *>, Inst2 : FeatureNodeInstance<Inst2, *>> dispatch(inst1: Inst1, inst2: Inst2, event: FeatureEvent)
}
