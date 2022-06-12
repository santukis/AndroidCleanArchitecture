package com.santukis.cleanarquitecture.injection

import org.kodein.di.*

fun repositories() = DI.Module(
    name = "repositories",
    allowSilentOverride = true
) {

}