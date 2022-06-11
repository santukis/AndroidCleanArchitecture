package com.santukis.buildsrc

class Dependencies {

    object Test {
        const val junit4 = "junit:junit:${Versions.Test.junit4}"
        const val junit5 = "org.junit.jupiter:junit-jupiter:${Versions.Test.junit5}"
    }

    object AndroidTest {
        const val junit4 = "androidx.test.ext:junit:${Versions.AndroidTest.junit4}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espressoCore}"
        const val composeUi = "androidx.compose.ui:ui-test-junit4:${Versions.Androidx.compose}"
    }

    object Androidx {
        const val core = "androidx.core:core-ktx:${Versions.Androidx.core}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.Androidx.activityCompose}"
        const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.Androidx.compose}"
        const val composeUi = "androidx.compose.ui:ui:${Versions.Androidx.compose}"
        const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.Androidx.compose}"
        const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.Androidx.compose}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.Androidx.compose}"
        const val composeMaterialIcons = "androidx.compose.material:material-icons-core:${Versions.Androidx.compose}"
        const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.Androidx.compose}"
    }

    object Dagger {
        const val dagger = "com.google.dagger:dagger:${Versions.Dagger.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.Dagger.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.Dagger.dagger}"
        const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.Dagger.dagger}"
        const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.Dagger.dagger}"
    }

    object Kotlin {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Kotlin.coroutinesCore}"
    }
}