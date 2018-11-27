package seasonvar.android.mobile.data.server

import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import seasonvar.android.mobile.domain.AuthGateway
import seasonvar.server.website.wrapper.AuthService
import seasonvar.server.website.wrapper.SERVER_URL


@Module(
    includes = [
        DataServerModule.ServerModule::class
    ]
)
abstract class DataServerModule {

    @Binds
    abstract fun authGateway(authGateway: AuthGatewayImpl): AuthGateway

    @Module
    class ServerModule {

        @Provides
        fun retrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
            .baseUrl(SERVER_URL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        @Provides
        fun authService(retrofit: Retrofit) = retrofit.create(AuthService::class.java)

    }

}
