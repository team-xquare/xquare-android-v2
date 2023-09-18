@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.xquare.androidv2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.xquare.androidv2"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    implementation(libs.koin.android)
    implementation(libs.koin.android.test)
    implementation(libs.koin.android.compat)
    implementation(libs.koin.androidx.navigation)
    implementation(libs.koin.androidx.workmanager)
    implementation(libs.koin.androidx.compose)
    implementation(libs.ktor.client.android)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.logging)
    implementation(libs.ktor.client.serialization)
    implementation(libs.ktor.client.contentNegotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.serialization.gson)
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(project(":database:database-user"))
    implementation(project(":datastore:datastore-user"))
    implementation(project(":datastore:datastore-meal"))
    implementation(project(":network:network-meal"))
    implementation(project(":core:core-database"))
    implementation(project(":domain:domain-meal"))
    implementation(project(":core:core-datastore"))
    implementation(project(":shared:shared-alias"))
    implementation(project(":data:data-meal"))
    implementation(project(":data:data-user"))
    implementation(project(":shared:shared-date"))
    implementation(project(":core:core-network"))
    implementation(project(":database:database-meal"))
    implementation(project(":domain:domain-user"))
    implementation(project(":core:core-jwt"))
    implementation(project(":network:network-user"))
}