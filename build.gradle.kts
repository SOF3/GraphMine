import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension
import org.gradle.internal.impldep.org.testng.reporters.XMLUtils.xml
import org.gradle.testing.jacoco.tasks.JacocoReport
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorPlugin
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension.Generator
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorTask
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Style

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
		mavenCentral()
	}
	dependencies {
		classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17")
		classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0")
	}
}

plugins {
	jacoco
	id("com.vanniktech.dependency.graph.generator") version "0.5.0"
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

val graphMineDepGraphGenerator = Generator(
		dependencyNode = { node, dependency ->
			if (dependency.moduleGroup.startsWith("io.github.sof3.graphmine"))
				node.add(Style.FILLED, Color.rgb("#cbff2b"))
			if (dependency.moduleGroup.startsWith("org.jetbrains.kotlin"))
				node.add(Style.FILLED, Color.rgb("#f2831e"))
			else node
		}
)

configure<DependencyGraphGeneratorExtension> {
	generators = listOf(graphMineDepGraphGenerator)
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
