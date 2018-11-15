import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.dokka.gradle.DokkaTask
import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Properties
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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
	kotlin("jvm") version "1.3.0"
}

group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

repositories{
	jcenter()
	maven(url = "https://dl.bintray.com/spekframework/spek-dev")
}

dependencies {
	api(project(":graphmine-util"))
	api(project(":graphmine-i18n"))
	api(project(":graphmine-i18n-core"))
	api("org.apache.logging.log4j", "log4j-api", "2.11.1")
	runtimeOnly("org.apache.logging.log4j", "log4j-core", "2.11.1")
	implementation("com.fasterxml.jackson.core", "jackson-annotations", "2.9.7")
	implementation(kotlin("stdlib-jdk8"))
	implementation(kotlin("reflect"))
	api("com.fasterxml.jackson.module", "jackson-module-kotlin", "2.9.7")
	api("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", "2.9.7")
	api("com.fasterxml.jackson.core", "jackson-databind", "2.9.4")
	testImplementation(kotlin("test"))
	testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.0-alpha.2")
	testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.0-alpha.2")
}

configure<JavaPluginConvention> {
	sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		jvmTarget = "1.8"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
	testLogging {
		showStandardStreams = true
		events(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED, TestLogEvent.STANDARD_OUT, TestLogEvent.STANDARD_ERROR)
	}
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<DokkaTask> {
	outputFormat = "jekyll"
	outputDirectory = "$buildDir/javadoc"
}


open class CreateVersionProperties : DefaultTask() {
	@TaskAction
	fun create() {
	}
}

tasks {
	"createVersionProperties"(CreateVersionProperties::class) {
		dependsOn("processResources")
		doLast {
			val resDir = File(project.buildDir, "resources/main")
			resDir.mkdirs()
			FileWriter(File(resDir, "build.properties")).use {
				Properties().apply {
					this["version"] = project.version
					this["build-date"] = SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").format(Date())
				}.store(it, "Generated by gradle build script")
			}
		}
	}
	"classes"{
		dependsOn("createVersionProperties")
	}
}
