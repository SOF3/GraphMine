package io.github.sof3.graphmine.entity

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
 * An entity follows the ICES structure:
 * - a set of Internal viewers that sees what the entity sees
 * - a set of Controllers that controls the behaviour of the entity
 * - a nullable External viewer that exposes the entity to other viewers
 */
class Entity {
	var internalViewers = mutableSetOf<InternalViewer>()
	var controllers = mutableSetOf<EntityController>()
	var externalViewer: ExternalViewer? = null
	var state: EntityState? = null
}
