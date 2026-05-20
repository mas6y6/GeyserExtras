rootProject.name = "GeyserExtras"
pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        maven("https://maven.architectury.dev/")
        maven("https://maven.neoforged.net/releases")
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        gradlePluginPortal()
    }
}

include("core", "spigot", "bungee", "velocity", "extension")
include("fabric")
include("neoforge")