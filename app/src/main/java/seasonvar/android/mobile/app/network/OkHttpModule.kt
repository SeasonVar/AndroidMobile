package seasonvar.android.mobile.app.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import seasonvar.android.mobile.BuildConfig
import javax.inject.Named
import javax.inject.Provider
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.X509TrustManager

@Module
class OkHttpModule {

    @Provides
    fun okHttpClient(
        @Named("trustAll") trustManagerProvider: Provider<X509TrustManager>,
        @Named("trustAll") sslSocketFactoryProvider: Provider<SSLSocketFactory>
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            builder
                .sslSocketFactory(
                    sslSocketFactoryProvider.get(),
                    trustManagerProvider.get()
                )
                .hostnameVerifier { _, _ -> true }
        }

        return builder.build()
    }

}
