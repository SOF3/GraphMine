group = "io.github.sof3.graphmine"
version = "1.0.0-SNAPSHOT"

buildscript{
	repositories{
		jcenter()
	}
	dependencies {
		classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17")
	}
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
