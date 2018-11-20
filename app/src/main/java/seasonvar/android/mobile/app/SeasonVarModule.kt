package seasonvar.android.mobile.app

import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import io.reactivex.Completable
import seasonvar.android.mobile.domain.AuthGateway
import seasonvar.android.mobile.presentation.login.LoginModule
import seasonvar.android.mobile.presentation.login.LoginRouter

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        LoginModule::class
    ]
)
class SeasonVarModule {

    @Provides
    fun authGateway(): AuthGateway = object : AuthGateway {

        override fun login(email: String, password: String) = Completable.complete()

    }

    @Provides
    fun loginRouter(): LoginRouter = object : LoginRouter {

        override fun userLoggedIn() {
            TODO("not implemented")
        }

    }

}
