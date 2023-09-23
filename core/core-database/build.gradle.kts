plugins {
	alias(libs.plugins.androidLibrary)
	alias(libs.plugins.kotlinAndroid)
	alias(libs.plugins.kotlinSerialization)
	alias(libs.plugins.ksp)
}

android {
	namespace = "com.xquare.core.database"
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

	implementation(libs.androidx.room.runtime)
	implementation(libs.androidx.room.ktx)
	ksp(libs.androidx.room.compiler)
	testImplementation(libs.androidx.room.testing)

	implementation(libs.joda.android)

	implementation(libs.kotlinx.serialization.json)

	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.test.ext.junit)
	androidTestImplementation(libs.espresso.core)

	implementation(libs.koin.android)
	implementation(libs.koin.android.compat)
	testImplementation(libs.koin.android.test)

	implementation(project(":core:core-data"))
	implementation(project(":core:core-datasource"))

	implementation(project(":shared:shared-date"))
	implementation(project(":shared:shared-alias"))
}
