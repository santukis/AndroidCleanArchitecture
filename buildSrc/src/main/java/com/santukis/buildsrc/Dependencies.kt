package com.santukis.buildsrc

class Dependencies {

    object Test {
        const val junit4 = "junit:junit:${Versions.Test.junit4}"
        const val junit5 = "org.junit.jupiter:junit-jupiter:${Versions.Test.junit5}"
    }

    object AndroidTest {
        const val junit4 = "androidx.test.ext:junit:${Versions.AndroidTest.junit4}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espressoCore}"
    }

    object Androidx {
        const val core = "androidx.core:core-ktx:${Versions.Androidx.core}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.Androidx.appCompat}"
        const val material = "com.google.android.material:material:${Versions.Androidx.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.Androidx.constraintLayout}"
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