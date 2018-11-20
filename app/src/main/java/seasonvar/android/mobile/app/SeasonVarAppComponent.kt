package seasonvar.android.mobile.app

import dagger.Component
import dagger.android.AndroidInjector

@Component(
    modules = [
        SeasonVarModule::class
    ]
)
interface SeasonVarAppComponent : AndroidInjector<SeasonVarApplication>
