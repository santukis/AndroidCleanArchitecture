package com.santukis.cleanarquitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.santukis.cleanarquitecture.components.SampleComposable
import com.santukis.cleanarquitecture.theme.CleanArchitectureTheme
import dagger.android.AndroidInjection

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        setContent {
            CleanArchitectureTheme {
                SampleComposable()
            }
        }
    }
}