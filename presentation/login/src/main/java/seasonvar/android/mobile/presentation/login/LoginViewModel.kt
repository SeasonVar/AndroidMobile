package seasonvar.android.mobile.presentation.login

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean

data class LoginViewModel(
    val isProgress: ObservableBoolean = ObservableBoolean()
) : ViewModel() {

    fun login() {
        isProgress.set(true)
    }

}
