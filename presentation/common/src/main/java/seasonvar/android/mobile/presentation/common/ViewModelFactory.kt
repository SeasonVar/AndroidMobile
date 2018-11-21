package seasonvar.android.mobile.presentation.common

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.MapKey
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>) = modelClass.cast(viewModels[modelClass]?.get())!!

    @MapKey
    @Target(AnnotationTarget.FUNCTION)
    annotation class Key(
        val value: KClass<out ViewModel>
    )

}
