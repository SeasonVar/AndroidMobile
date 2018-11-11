buildscript {

    val kotlinVersion by extra { "1.3.0" }

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.3.0-beta03")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
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
