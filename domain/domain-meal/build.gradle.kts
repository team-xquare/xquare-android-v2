@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
	alias(libs.plugins.androidLibrary)
	alias(libs.plugins.kotlinAndroid)
}

android {
	namespace = "com.xquare.domain.meal"
	compileSdk = 34

	defaultConfig {
		minSdk = 23

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		consumerProguardFiles("consumer-rules.pro")
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(
				getDefaultProguardFile("proguard-android-optimize.txt"),
				"proguard-rules.pro",
			)
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	kotlin {
		jvmToolchain(8)
	}
}

dependencies {

	implementation(libs.core.ktx)
	implementation(libs.appcompat)

	implementation(libs.joda.android)

	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.test.ext.junit)
	androidTestImplementation(libs.espresso.core)

	implementation(libs.koin.android)
	implementation(libs.koin.android.compat)
	testImplementation(libs.koin.android.test)

	implementation(project(":core:core-data"))
	implementation(project(":core:core-domain"))

	implementation(project(":data:data-meal"))

	implementation(project(":shared:shared-alias"))
	implementation(project(":shared:shared-date"))
}
