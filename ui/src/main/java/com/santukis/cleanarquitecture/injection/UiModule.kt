package com.santukis.cleanarquitecture.injection

import com.santukis.cleanarquitecture.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UiModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}