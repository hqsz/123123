import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	idea
	kotlin("jvm") version "2.0.10"

	id("org.jetbrains.kotlinx.kover") version "0.8.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))

	testImplementation("io.kotest:kotest-assertions-core-jvm:5.9.1")

	testImplementation("org.junit.jupiter:junit-jupiter:5.6.3")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.3")
	testImplementation("org.junit.jupiter:junit-jupiter-params:5.6.3")
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.3")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
