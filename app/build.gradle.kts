plugins {
    id("com.android.application")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

val kotlinVersion: String by rootProject.extra

android {

    compileSdkVersion(28)

    defaultConfig {

        applicationId = "seasonvar.android.mobile"
        versionName = "1.0"
        versionCode = 1

        minSdkVersion(21)
        targetSdkVersion(28)

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    dataBinding {
        isEnabled = true
    }

}

dependencies {

    implementation(project(":presentation:login"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")

    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support:support-fragment:28.0.0")

    implementation("android.arch.navigation:navigation-fragment:1.0.0-alpha07")

}
