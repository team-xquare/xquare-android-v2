plugins {
	alias(libs.plugins.androidLibrary)
	alias(libs.plugins.kotlinAndroid)
}

android {
	namespace = "com.xquare.network.meal"
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

	implementation(libs.kotlinx.serialization.json)

	implementation(libs.koin.android)
	implementation(libs.koin.android.compat)
	testImplementation(libs.koin.android.test)

	implementation(libs.ktor.client.android)
	implementation(libs.ktor.client.serialization)
	implementation(libs.ktor.serialization.kotlinx.json)

	testImplementation(libs.junit)
	androidTestImplementation(libs.androidx.test.ext.junit)
	androidTestImplementation(libs.espresso.core)

	implementation(project(":core:core-datasource"))
	implementation(project(":core:core-network"))

	implementation(project(":shared:shared-date"))
	implementation(project(":shared:shared-alias"))
}
