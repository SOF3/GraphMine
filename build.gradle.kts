import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension.Generator
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorPlugin
import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorTask
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Style
import guru.nidi.graphviz.model.MutableNode
import java.nio.file.Files
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.internal.impldep.org.testng.reporters.XMLUtils.xml
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.dokka.gradle.DokkaTask

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
		classpath("com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0")
	}
}

plugins {
	java
	kotlin("jvm") version "1.3.0"
	jacoco
	id("com.vanniktech.dependency.graph.generator") version "0.5.0"
}

allprojects {
	repositories {
		jcenter()
	}
}

subprojects {
	apply(plugin = "org.jetbrains.dokka")

	repositories {
		maven(url = "https://dl.bintray.com/spekframework/spek-dev")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
	}

	tasks.withType<Test> {
		useJUnitPlatform {
			includeEngines("spek2")
		}
		testLogging {
			showStandardStreams = true
			showExceptions = true
			showCauses = true
			showStackTraces = true
			events(TestLogEvent.FAILED, TestLogEvent.STANDARD_OUT, TestLogEvent.STANDARD_ERROR)
		}
	}

	tasks.withType<DokkaTask> {
		outputFormat = "jekyll"
		outputDirectory = "$buildDir/javadoc"

		File(project.projectDir, "module.md").takeIf { it.isFile }?.let { includes += it }
		Files.walk(File(project.projectDir, "src").toPath())
				.filter { it.toFile().isDirectory }
				.map { it.resolve("package.md").toFile() }
				.filter { it.isFile }
				.forEach { includes += it.absolutePath }
	}
}

fun colorNode(node: MutableNode, name: String): MutableNode {
	val rgb = name.hashCode()
	node.add(Style.FILLED, Color.rgb(rgb))
	val R = rgb shr 16 and 0xFF
	val G = rgb shr 8 and 0xFF
	val B = rgb and 0xFF
	val light = 0.299 * R + 0.587 * G + 0.114 * B
	if (light <= 152.0) {
		node.add("fontcolor", "#ffffff")
	}
	return node
}

val graphMineDepGraphGenerator = Generator(
		dependencyNode = { node, dependency -> colorNode(node, dependency.moduleGroup) },
		projectNode = { node, project -> colorNode(node, project.group.toString()) }
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
