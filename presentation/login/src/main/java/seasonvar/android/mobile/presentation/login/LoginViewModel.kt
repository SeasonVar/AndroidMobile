package seasonvar.android.mobile.presentation.login

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.schedulers.Schedulers
import seasonvar.android.mobile.domain.AuthGateway
import seasonvar.android.mobile.domain.WrongAuthCredentialsException
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val authGateway: AuthGateway,
    private val router: LoginRouter
) : ViewModel() {

    val login = ObservableField<String>("")
    val password = ObservableField<String>("")
    val isProgress = ObservableBoolean()
    val error = ObservableField<Int>(R.string.empty)

    private val disposables = CompositeDisposable()

    fun login() {

        isProgress.set(true)

        authGateway.login(login.get()!!, password.get()!!)
            .subscribeOn(Schedulers.io())
            .subscribe(router::userLoggedIn) {
                isProgress.set(false)
                when (it) {
                    is WrongAuthCredentialsException -> R.string.wrong_login_or_password
                    else -> R.string.cant_authorize
                }.apply { error.set(this) }
            }
            .addTo(disposables)

    }

    override fun onCleared() {
        disposables.dispose()
        super.onCleared()
    }

}
