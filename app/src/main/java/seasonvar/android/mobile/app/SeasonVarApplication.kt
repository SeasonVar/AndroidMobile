package seasonvar.android.mobile.app

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class SeasonVarApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerSeasonVarAppComponent.builder().build()
    }

}
