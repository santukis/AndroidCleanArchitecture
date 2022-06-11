package com.santukis.cleanarquitecture.injection

import android.content.Context
import com.santukis.cleanarquitecture.CleanApplication

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        UiModule::class,
        ViewModelsModule::class,
        UseCasesModule::class,
        RepositoriesModule::class,
        DataSourcesModule::class
    ]
)
interface ApplicationComponent: AndroidInjector<CleanApplication> {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}