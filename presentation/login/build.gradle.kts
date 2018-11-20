plugins {
    id("com.android.library")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
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

    implementation(project(":domain"))

    implementation(Libs.kotlinStdLib)

    api(Libs.daggerAndroidSupport)
    kapt(Libs.daggerAndroidProcessor)

    implementation(Libs.AndroidSupport.appCompatV7)
    implementation(Libs.AndroidSupport.fragment)

    implementation(Libs.AndroidArch.lifecycleExtensions)
    kapt(Libs.AndroidArch.lifecycleCompiler)

}
