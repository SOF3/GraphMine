import org.gradle.testing.jacoco.tasks.JacocoReport

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
		html.apply {
			isEnabled = true
			destination = File("build/reports/jacoco.xml")
		}
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
