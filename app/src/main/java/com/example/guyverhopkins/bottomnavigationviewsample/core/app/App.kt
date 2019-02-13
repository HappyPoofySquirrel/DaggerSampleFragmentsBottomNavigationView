package com.example.guyverhopkins.bottomnavigationviewsample.core.app


import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * TODO Create class header 1/27/17.
 */

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }
}