package io.github.sof3.graphmine.world

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
 * Each world has its set of 3D space. Usually, this is implemented as one saved map, but plugins may create virtual
 * worlds, remote worlds or anything that features the characteristics as required by the interface.
 *
 * As the World object itself is used as the identifier, implementations should not override the equals() and hashCode()
 * methods.
 */
interface World {

}