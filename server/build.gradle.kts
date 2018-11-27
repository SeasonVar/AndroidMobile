plugins {
    id("java")
    id("kotlin")
}

dependencies {
    implementation(Libs.kotlinStdLib)
    implementation(Libs.rxKotlin)
    implementation(Libs.javaxInject)
    implementation(Libs.retrofitAdapterRxJava)
}
