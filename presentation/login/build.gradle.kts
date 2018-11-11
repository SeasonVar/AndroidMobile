plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

val kotlinVersion: String by rootProject.extra

android {
    compileSdkVersion(28)
}

dependencies {
    implementation(project(":domain"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation("com.android.support:support-fragment:28.0.0")
}
