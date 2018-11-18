plugins {
    id("com.android.library")
    id("kotlin-kapt")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

val kotlinVersion: String by rootProject.extra

android {

    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
    }

    dataBinding {
        isEnabled = true
    }

}

dependencies {

    implementation(project(":domain"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation("com.android.support:support-fragment:28.0.0")

    implementation("android.arch.lifecycle:extensions:1.1.1")
    kapt("android.arch.lifecycle:compiler:1.1.1")

}
