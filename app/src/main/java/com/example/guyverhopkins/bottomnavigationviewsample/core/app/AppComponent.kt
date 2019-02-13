package com.example.guyverhopkins.bottomnavigationviewsample.core.app

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * created by ghopkins 1/8/18.
 */

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class),
    (AppModule::class),
    (ActivityBuilder::class)])
interface AppComponent : AndroidInjector<DaggerApplication>{

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: App): Builder
        fun build(): AppComponent

    }

    fun inject(app: App)

    override fun inject(instance: DaggerApplication)
}