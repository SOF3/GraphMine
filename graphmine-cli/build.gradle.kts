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

plugins {
	java
	kotlin("jvm")
	application
}

group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

dependencies {
	implementation(project(":graphmine-core"))
	implementation(kotlin("stdlib-jdk8"))
	implementation("commons-cli", "commons-cli", "1.4")
	implementation("commons-io", "commons-io", "2.6")
	testImplementation(kotlin("test"))
	testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.0-alpha.2")
	testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.0-alpha.2")
}

application {
	mainClassName = "io.github.sof3.graphmine.cli.MainKt"
}

val fatJar = task("fatJar", type = Jar::class) {
	baseName = "${project.name}-fat"
	manifest {
		attributes["Implementation-Title"] = "GraphMine"
		attributes["Implementation-Version"] = version
		attributes["Main-Class"] = "io.github.sof3.graphmine.cli.MainKt"
	}
	from(configurations.runtime.map { if (it.isDirectory) it else zipTree(it) })
	with(tasks["jar"] as CopySpec)
}
