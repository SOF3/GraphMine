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
 * Represents a concrete or abstract concept that can interact with itself or other FeatureNodes, such as an entity,
 * a block, a client or a command.
 *
 * If the implementation is a singleton, it is recommended that FeatureNode be implemented in the companion object of
 * the corresponding FeatureNodeInstance.
 *
 * @param Self the actual class implementing FeatureNode. It is not mandatory to pass the actual instance type, but it
 * is recommended if possible to improve type prediction
 * @param Inst the FeatureNodeInstance class corresponding to Self.
 */
interface FeatureNode<Self : FeatureNode<Self, Inst>, Inst : FeatureNodeInstance<Inst, Self>>
