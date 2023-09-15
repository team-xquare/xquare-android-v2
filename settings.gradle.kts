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
include(":data:data-user")

// database
include(":database:database-meal")
include(":database:database-user")

// datastore
include(":datastore:datastore-meal")
include(":datastore:datastore-user")

// domain
include(":domain:domain-meal")
include(":domain:domain-user")

// network
include(":network:network-meal")
