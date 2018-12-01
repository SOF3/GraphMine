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
 * The feature package manages features enabled on the server.
 *
 * Features are laid out in a "graph" concept, with the aim to support the following example cases:
 * - When implementing the interaction between two block types, the interaction should be coded as a feature edge on the
 * two block types rather than implementing in one of the blocks.
 * - When implementing the interaction between an entity type and a block type (e.g. a dropped item and a pressure
 * plate), the interaction should be coded as an edge on the entity type and the block type.
 * - When implementing the generic interaction of an entity type and any block, e.g. fall damage, the interaction should
 * be coded as a feature edge on the entity type and the "block" type (not on any particular block types)
 *   - When implementing the specific semantics that disables another edge, e.g. no fall damage if landed on water or
 *   air block, it should be coded as an edge between the specific types that suppress the original edge
 * - When implementing the specific semantics between a specific block and a specific player, e.g. a player and his own
 * shop block, it should be coded as an edge between the
 */
package io.github.sof3.graphmine.feature;
