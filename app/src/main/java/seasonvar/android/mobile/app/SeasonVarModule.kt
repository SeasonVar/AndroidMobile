package seasonvar.android.mobile.app

import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import seasonvar.android.mobile.app.crypto.CryptoModule
import seasonvar.android.mobile.app.network.OkHttpModule
import seasonvar.android.mobile.data.server.DataServerModule
import seasonvar.android.mobile.presentation.login.LoginModule
import seasonvar.android.mobile.presentation.login.LoginRouter

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        LoginModule::class,
        DataServerModule::class,
        OkHttpModule::class,
        CryptoModule::class
    ]
)
class SeasonVarModule {

    @Provides
    fun loginRouter(): LoginRouter = object : LoginRouter {

        override fun userLoggedIn() {
            TODO("not implemented")
        }

    }

}
