package seasonvar.android.mobile.presentation.login

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import seasonvar.android.mobile.presentation.common.ViewModelFactory

@Module
abstract class LoginModule {

    @ContributesAndroidInjector
    abstract fun fragment(): LoginFragment

    @Binds
    @IntoMap
    @ViewModelFactory.Key(LoginViewModel::class)
    internal abstract fun viewModel(viewModel: LoginViewModel): ViewModel

}
