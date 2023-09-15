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

// data
include(":data:data-meal")

// domain
include(":domain:domain-meal")
include(":domain:domain-user")
