plugins {
    id("java")
    id("kotlin")
}

val kotlinVersion: String by rootProject.extra

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation("io.reactivex.rxjava2:rxkotlin:2.3.0")
}
