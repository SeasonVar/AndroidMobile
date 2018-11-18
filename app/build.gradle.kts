plugins {
    id("com.android.application")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {

    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {

        applicationId = "seasonvar.android.mobile"
        versionName = "1.0"
        versionCode = 1

        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)

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

    implementation(Libs.kotlinStdLib)

    implementation(Libs.AndroidSupport.appCompatV7)
    implementation(Libs.AndroidSupport.fragment)

    implementation(Libs.AndroidArch.navigation)

}
