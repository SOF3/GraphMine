import org.gradle.internal.impldep.org.testng.reporters.XMLUtils.xml
import org.gradle.testing.jacoco.tasks.JacocoReport

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

group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

buildscript {
	repositories {
		jcenter()
	}
	dependencies {
		classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17")
	}
}

plugins {
	jacoco
}

allprojects {
	repositories {
		jcenter()
	}
}

subprojects {
	repositories {
		jcenter()
	}
}

tasks.withType<JacocoReport> {
	reports {
		xml.isEnabled = true
		xml.destination = File("build/reports/jacoco.xml")
		executionData(tasks.withType<Test>())
	}
}

tasks {
	task("codeCoverageReport", type = JacocoReport::class) {
		subprojects.forEach {
			dependsOn(":${it.name}:test")
		}
	}
}
