plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
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

    packagingOptions {
        exclude("META-INF/*.kotlin_module")
    }

}

dependencies {

    implementation(project(":domain"))
    implementation(project(":presentation:login"))
    implementation(project(":data:server"))

    implementation(Libs.kotlinStdLib)

    kapt(Libs.daggerCompiler)
    kapt(Libs.daggerAndroidProcessor)

    implementation(Libs.AndroidSupport.appCompatV7)
    implementation(Libs.AndroidSupport.fragment)

    implementation(Libs.AndroidArch.navigation)

}
