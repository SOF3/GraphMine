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
 * Controls the actions of an entity.
 *
 * Each instance of EntityController should only be applied on one entity.
 */
interface EntityController {
	/**
	 * Invoked when the controller is added to the entity
	 */
	fun onGainControl()

	/**
	 * Invoked when the controller is removed from the entity
	 */
	fun onLoseControl()
}
