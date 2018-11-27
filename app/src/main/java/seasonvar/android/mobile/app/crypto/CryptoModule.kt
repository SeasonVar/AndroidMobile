package seasonvar.android.mobile.app.crypto

import dagger.Module
import dagger.Provides
import java.security.SecureRandom
import javax.inject.Named
import javax.net.ssl.SSLContext
import javax.net.ssl.X509TrustManager

@Module
class CryptoModule {

    @Provides
    @Named("trustAll")
    fun sslSocketFactory(@Named("trustAll") trustManager: X509TrustManager) =
        SSLContext.getInstance("SSL")
            .apply { init(null, arrayOf(trustManager), SecureRandom()) }
            .socketFactory!!

    @Provides
    @Named("trustAll")
    fun trustManager(): X509TrustManager = TrustAllX509Manager()

}
