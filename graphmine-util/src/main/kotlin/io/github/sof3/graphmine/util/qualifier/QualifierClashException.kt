package io.github.sof3.graphmine.util.qualifier

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
 * Thrown when there is a qualifier clash
 * @property values a map of [Qualifier]s to their respective values. The value type of the map can be safely assumed to be
 * the type T in the [QualifierMap] that throws the exception.
 */
class QualifierClashException(val values: Map<Qualifier, *>) : Exception()
