plugins {
    id("java")
    id("kotlin")
    id("kotlin-kapt")
}

dependencies {

    api(project(":domain"))
    implementation(project(":server"))

    implementation(Libs.kotlinStdLib)
    implementation(Libs.rxKotlin)

    api(Libs.dagger)
    kapt(Libs.daggerCompiler)

}
