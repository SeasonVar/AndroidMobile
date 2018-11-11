plugins {
    id("com.android.application")
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

}

dependencies {
    implementation(project(":presentation:login"))
}
