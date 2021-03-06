package io.github.sof3.graphmine.util.math

import kotlin.annotation.AnnotationRetention.BINARY
import kotlin.annotation.AnnotationTarget.*

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
 * Applied on a [Vector3] or [IntVector3] to indicate that it represents a positional vector, e.g. the position of an
 * object
 */
@Target(PROPERTY, LOCAL_VARIABLE, VALUE_PARAMETER, FUNCTION)
@Retention(BINARY)
@MustBeDocumented
annotation class Positional

/**
 * Applied on a [Vector3] or [IntVector3] to indicate that it represents a relative vector, e.g. the distance between
 * two vectors
 */
@Target(PROPERTY, LOCAL_VARIABLE, VALUE_PARAMETER, FUNCTION)
@Retention(BINARY)
@MustBeDocumented
annotation class Relative
