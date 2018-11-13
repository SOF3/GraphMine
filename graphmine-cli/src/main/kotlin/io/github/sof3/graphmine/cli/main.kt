package io.github.sof3.graphmine.cli

import io.github.sof3.graphmine.VersionInfo
import io.github.sof3.graphmine.impl.Server
import io.github.sof3.graphmine.impl.config.ConfigLoader
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Options
import org.apache.commons.io.IOUtils
import java.io.File
import java.io.FileOutputStream
import java.text.DateFormat

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

fun main(args: Array<String>) {
	val options = Options().apply {
		addOption("v", "version", false, "GraphMine version")
		addOption("h", "help", false, "Command line description")
		addOption("c", "config", true, "Path to config.kts")
	}
	val cmd = DefaultParser().parse(options, args)

	if (cmd.hasOption("h")) {
		HelpFormatter().printHelp("graphmine", options)
		return
	}

	if (cmd.hasOption("v")) {
		println("GraphMine v${VersionInfo.VERSION}, built on ${DateFormat.getDateTimeInstance().format(VersionInfo.BUILD_DATE)}")
		return
	}

	println("Loading...")

	val dataDir = File("data")
	if (!dataDir.exists()) dataDir.mkdirs()

	val configFile = File(cmd.getOptionValue("c", "data/config.kts"))
	if (!configFile.exists()) {
		val default = object {}.javaClass.classLoader.getResourceAsStream("config.kts")
		FileOutputStream(configFile).use { IOUtils.copy(default, it) }
	}

	Server(
			config = ConfigLoader.load(configFile)
	)
}
