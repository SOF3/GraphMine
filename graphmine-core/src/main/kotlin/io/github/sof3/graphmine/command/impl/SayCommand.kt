package io.github.sof3.graphmine.command.impl

import io.github.sof3.graphmine.Server
import io.github.sof3.graphmine.command.Command
import io.github.sof3.graphmine.command.CommandSender
import io.github.sof3.graphmine.command.Overload
import io.github.sof3.graphmine.i18n.i18n
import io.github.sof3.graphmine.util.qualifier.qualify

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

internal class SayCommand : Overload() {
	companion object : Command<Server>({
		name = "graphmine.say".qualify()
		aliases += "announce"

		description = "".i18n // TODO

		handle<SayCommand, CommandSender> {
			TODO("Implement")
		}
	})

	val message by rawText()
}
