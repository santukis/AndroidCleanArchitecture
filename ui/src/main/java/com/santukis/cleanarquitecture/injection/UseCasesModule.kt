package com.santukis.cleanarquitecture.injection

import org.kodein.di.*

fun useCases() = DI.Module(
    name = "useCases",
    allowSilentOverride = true
) {

}