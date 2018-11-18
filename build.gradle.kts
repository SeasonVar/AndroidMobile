buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.androidGradlePlugin}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
    }

}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {

    val clean by registering(Delete::class) {
        delete(rootProject.buildDir)
    }

}
