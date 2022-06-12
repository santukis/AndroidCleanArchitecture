package com.santukis.cleanarquitecture.injection

import org.kodein.di.*

fun dataSources() = DI.Module(
    name = "dataSources",
    allowSilentOverride = true
) {

}