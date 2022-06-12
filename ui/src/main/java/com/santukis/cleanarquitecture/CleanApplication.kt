package com.santukis.cleanarquitecture

import android.app.Application
import android.content.Context
import com.santukis.cleanarquitecture.injection.appModule
import org.kodein.di.DI
import org.kodein.di.DIAware

class CleanApplication: Application(), DIAware {

    private var overriddenModules: DI.Module? = null

    override val di by DI.lazy(allowSilentOverride = true) {
        importAll(appModule(application = this@CleanApplication), allowOverride = true)
        overriddenModules?.apply { importAll(this, allowOverride = true) }
    }

    fun overrideModules(modules: DI.Module) {
        overriddenModules = modules
    }
}

fun Context.asApp() = this.applicationContext as CleanApplication