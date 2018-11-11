package seasonvar.android.mobile.domain

import io.reactivex.Completable

interface AuthGateway {

    fun login(email: String, password: String): Completable

}
