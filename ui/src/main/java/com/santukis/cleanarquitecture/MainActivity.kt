package com.santukis.cleanarquitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.santukis.cleanarquitecture.components.SampleComposable
import com.santukis.cleanarquitecture.theme.CleanArchitectureTheme
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI

class MainActivity : ComponentActivity(), DIAware {

    override val di: DI by closestDI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CleanArchitectureTheme {
                SampleComposable()
            }
        }
    }
}