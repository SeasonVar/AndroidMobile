plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {

    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
    }

    dataBinding {
        isEnabled = true
    }

}

dependencies {
    implementation(Libs.dagger)
    implementation(Libs.kotlinStdLib)
    implementation(Libs.AndroidArch.viewmodel)
}
