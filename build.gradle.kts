plugins {
	alias(libs.plugins.androidApplication) apply false
	alias(libs.plugins.androidLibrary) apply false
	alias(libs.plugins.kotlinAndroid) apply false
	alias(libs.plugins.kotlinSerialization) apply false
	alias(libs.plugins.ksp) apply false
	alias(libs.plugins.ktlint) apply true
}
