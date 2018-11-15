import io.github.sof3.graphmine.i18n.core.*
import io.github.sof3.graphmine.i18n.core.CoreLang.Startup.complete
import kotlin.math.round

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

CoreLang("en_US") {
	serverName { "GraphMine" }
	startup {
		version { "Starting GraphMine version $version on $ip:$port" }
		complete { "Startup completed in ${round(nano / 1e+6) / 1e+3}s" }
	}
}
