pluginManagement {
    val githubUsername: String? by settings
    val githubToken: String? by settings

    repositories {
        mavenLocal()
        maven {
            url = uri("https://maven.pkg.github.com/dsdolzhenko/gradle-secrets-plugin")
            credentials {
                username = githubUsername ?: System.getenv("GITHUB_USERNAME")
                password = githubToken ?: System.getenv("GITHUB_TOKEN")
            }
        }
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "gradle-plugins-sandbox"
