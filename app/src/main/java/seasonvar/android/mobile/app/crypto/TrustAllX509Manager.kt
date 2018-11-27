package seasonvar.android.mobile.app.crypto

import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager
import javax.security.cert.CertificateException

class TrustAllX509Manager : X509TrustManager {

    override fun getAcceptedIssuers() = arrayOf<X509Certificate>()

    @Throws(CertificateException::class)
    override fun checkClientTrusted(
        chain: Array<X509Certificate>,
        authType: String
    ) = Unit

    @Throws(CertificateException::class)
    override fun checkServerTrusted(
        chain: Array<X509Certificate>,
        authType: String
    ) = Unit

}
