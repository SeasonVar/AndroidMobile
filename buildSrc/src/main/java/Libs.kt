object Libs {

    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.3.0"

    object AndroidSupport {
        val appCompatV7 = "com.android.support:appcompat-v7:${Versions.androidSupport}"
        val fragment = "com.android.support:support-fragment:${Versions.androidSupport}"
    }

    object AndroidArch {
        val navigation = "android.arch.navigation:navigation-fragment:1.0.0-alpha07"
        val lifecycleExtensions = "android.arch.lifecycle:extensions:${Versions.androidArchLifecycle}"
        val lifecycleCompiler = "android.arch.lifecycle:compiler:${Versions.androidArchLifecycle}"
    }

}
