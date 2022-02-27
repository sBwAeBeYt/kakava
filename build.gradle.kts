plugins {
    id("java-library")
    id("maven-publish")
}

allprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    group = "ovh.aquilion.kakava"
    version = "0.0.1-SNAPSHOT"
    description = "An auth plugin for velocity with more features and premium login."
}