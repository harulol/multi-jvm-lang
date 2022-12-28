plugins {
    kotlin("jvm") version "1.8.0"
    groovy
    java
    scala
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "dev.hawu.plugins"
version = "2.1"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

val shade by configurations.creating {
    configurations.getByName("implementation").extendsFrom(this)
}

dependencies {
    shade("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    shade("org.jetbrains.kotlin:kotlin-reflect:1.8.0")
    shade("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    shade("org.jetbrains.kotlinx:kotlinx-serialization-core:1.4.1")
    shade("org.apache.groovy:groovy-all:4.0.7")
    shade("org.scala-lang:scala3-library_3:3.2.2-RC2")

    implementation("org.bukkit:bukkit:1.8-R0.1-SNAPSHOT")
    implementation("net.md-5:bungeecord-api:1.17-R0.1-SNAPSHOT")
}

tasks.jar {
    ant.withGroovyBuilder {
        "replace"(
            "file" to "src/main/resources/plugin.yml",
            "token" to "@VERSION@",
            "value" to project.version.toString(),
        )
        "replace"(
            "file" to "src/main/resources/bungee.yml",
            "token" to "@VERSION@",
            "value" to project.version.toString(),
        )
    }

    doLast {
        ant.withGroovyBuilder {
            "replace"(
                "file" to "src/main/resources/plugin.yml",
                "token" to project.version.toString(),
                "value" to "@VERSION@",
            )
            "replace"(
                "file" to "src/main/resources/bungee.yml",
                "token" to project.version.toString(),
                "value" to "@VERSION@",
            )
        }
    }
}

tasks.shadowJar {
    configurations = listOf(shade)
    dependencies {
        include(dependency("org.jetbrains.kotlin:.*:.*"))
        include(dependency("org.jetbrains.kotlinx:.*:.*"))
        include(dependency("org.apache.groovy:.*:.*"))
        include(dependency("org.scala-lang:.*:.*"))
    }
}