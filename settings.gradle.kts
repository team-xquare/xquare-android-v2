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
		maven { setUrl("https://jitpack.io") }
	}
}

rootProject.name = "XQUARE Android v2"

include(":app")

// core
include(":core:core-data")
include(":core:core-database")
include(":core:core-datasource")
include(":core:core-datastore")
include(":core:core-di")
include(":core:core-domain")
include(":core:core-jwt")
include(":core:core-network")
include(":core:core-project")

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

// feature
include(":feature:feature-auth")
include(":feature:feature-home")

// network
include(":network:network-meal")
include(":network:network-user")

// shared
include(":shared:shared-alias")
include(":shared:shared-date")
include(":shared:shared-di")
