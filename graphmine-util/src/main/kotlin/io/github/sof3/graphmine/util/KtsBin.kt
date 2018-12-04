package io.github.sof3.graphmine.util

import java.io.DataInputStream
import java.io.DataOutputStream

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

interface KtsBin<T : KtsBin<T, F>, F : KtsBin.Factory<T, F>> {
	fun write(dis: DataOutputStream)

	interface Factory<T : KtsBin<T, F>, F : Factory<T, F>> {
		fun read(dis: DataInputStream): T
	}
}
