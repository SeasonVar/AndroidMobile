package seasonvar.server.website.wrapper

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class SeasonVarWebsiteWrapper @Inject constructor(
    private val authService: AuthService
) {

    companion object {
        const val WRONG_CREDENTIALS_DOM_ELEMENT =
            "<div class=\"pgs-msg full error\">Логин или пароль указан не верно.</div>"
    }

    fun login(email: String, password: String): Single<HomePage> =
        authService.login(email, password)
            .map(Response<ResponseBody>::body)
            .flatMap { body ->
                if (body.string().contains(WRONG_CREDENTIALS_DOM_ELEMENT)) {
                    return@flatMap Single.error<ResponseBody>(WrongAuthCredentialsException())
                }
                return@flatMap Single.just(body)
            }
            .map {
                HomePage(
                    header = HomePage.Header(
                        tvSeriesCount = (Math.random() * 1000).toInt() //TODO Extract value from HTML
                    )
                )
            }

    class WrongAuthCredentialsException : Exception()

}
