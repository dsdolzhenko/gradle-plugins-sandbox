plugins {
    kotlin("jvm") version "2.2.21"
    id("io.github.dsdolzhenko.secrets") version "0.1.0"
    id("io.github.dsdolzhenko.dotenv") version "0.1.0"
    application
}

group = "io.github.dsdolzhenko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass = "io.github.dsdolzhenko.sandbox.Application"
}

secrets {
    verbose = true
}

tasks.test {
    useJUnitPlatform()
}