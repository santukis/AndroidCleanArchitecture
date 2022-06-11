package com.santukis.cleanarquitecture.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import dagger.MapKey
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass


@Module(
    includes = [
        UseCasesModule::class
    ]
)
class ViewModelsModule {

    @Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER
    )
    @Retention(AnnotationRetention.RUNTIME)
    @MapKey
    internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

    @Provides
    fun providesViewModelFactory(providerMap: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>): ViewModelProvider.Factory {
        return ViewModelFactory(providerMap)
    }

}

class ViewModelFactory @Inject constructor(
    private val providerMap: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return providerMap[modelClass]?.get() as? T
            ?: throw IllegalArgumentException("Unknown model class: $modelClass")
    }
}

inline fun <reified VM : ViewModel, T : ViewModelStoreOwner> T.viewModel(crossinline viewModelFactory: () -> ViewModelProvider.Factory): Lazy<VM>  {
    return lazy { ViewModelProvider(this, viewModelFactory()).get(VM::class.java) }
}