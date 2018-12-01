import java.nio.file.Files
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.dokka.gradle.DokkaTask
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
	id("org.jetbrains.dokka")
}

group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

repositories {
	jcenter()
	maven(url = "https://dl.bintray.com/spekframework/spek-dev")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation(kotlin("reflect"))
	runtimeOnly(kotlin("compiler-embeddable"))
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
		freeCompilerArgs += "-XXLanguage:+InlineClasses"
	}
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

	Files.walk(File(project.projectDir, "src/main/kotlin/io/github/sof3/graphmine").toPath())
			.filter { it.toFile().isDirectory }
			.map { it.resolve("package.md").toFile() }
			.filter { it.isFile }
			.forEach { includes += it.absolutePath }
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
