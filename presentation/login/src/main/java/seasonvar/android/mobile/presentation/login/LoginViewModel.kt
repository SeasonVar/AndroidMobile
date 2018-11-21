package seasonvar.android.mobile.presentation.login

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import seasonvar.android.mobile.domain.AuthGateway
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    private val authGateway: AuthGateway,
    private val router: LoginRouter
) : ViewModel() {

    val login = ObservableField<String>("")
    val password = ObservableField<String>("")
    val isProgress = ObservableBoolean()

    private val disposables = CompositeDisposable()

    fun login() {

        isProgress.set(true)

        Completable.complete()
            .delay(5, TimeUnit.SECONDS)
            .andThen(authGateway.login(login.get()!!, password.get()!!))
            .doOnComplete { router.userLoggedIn() }
            .doOnError { TODO("Show error") }
            .subscribe()
            .addTo(disposables)

    }

    override fun onCleared() {
        disposables.dispose()
        super.onCleared()
    }

}
