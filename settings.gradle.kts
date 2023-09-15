@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "XQUARE Android v2"

include(":app")

// core
include(":core:core-database")
include(":core:core-datastore")
include(":core:core-jwt")
include(":core:core-network")

// domain
include(":domain:domain-user")
