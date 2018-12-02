package io.github.sof3.graphmine.entity

import io.github.sof3.graphmine.util.math.Vector3
import io.github.sof3.graphmine.world.World

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
 * Contains the savable data of an entity
 * @property world the world that the entity belongs to
 * @param vector the entity's initial position
 * @property vector the position of the entity
 */
open class EntityState(
		var world: World,
		var vector: Vector3
)
