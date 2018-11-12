import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	java
	kotlin("jvm") version "1.3.0"
}

group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

repositories {
	jcenter()
	maven(url = "https://dl.bintray.com/spekframework/spek-dev")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	api(project(":graphmine-i18n"))
	testImplementation(kotlin("test"))
	testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.0-alpha.2")
	testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.0-alpha.2")
}

configure<JavaPluginConvention> {
	sourceCompatibility = JavaVersion.VERSION_1_8
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
