package seasonvar.android.mobile.data.server

import io.reactivex.Completable
import io.reactivex.Single
import seasonvar.android.mobile.domain.AuthGateway
import seasonvar.android.mobile.domain.WrongAuthCredentialsException
import seasonvar.server.website.wrapper.HomePage
import seasonvar.server.website.wrapper.SeasonVarWebsiteWrapper
import javax.inject.Inject

class AuthGatewayImpl @Inject constructor(
    private val seasonVarWebsiteWrapper: SeasonVarWebsiteWrapper
) : AuthGateway {

    override fun login(email: String, password: String): Completable =
        seasonVarWebsiteWrapper.login(email, password)
            .onErrorResumeNext {
                if (it is SeasonVarWebsiteWrapper.WrongAuthCredentialsException) {
                    return@onErrorResumeNext Single.error<HomePage>(WrongAuthCredentialsException())
                }
                return@onErrorResumeNext Single.error<HomePage>(it)
            }
            .ignoreElement()

}
