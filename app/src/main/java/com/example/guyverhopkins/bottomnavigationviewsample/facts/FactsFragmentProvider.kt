package com.example.guyverhopkins.bottomnavigationviewsample.facts

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * created by ghopkins 1/9/18.
 */
@Module
abstract class FactsFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(FactsModule::class))
    internal abstract fun providesFactsFragmentFactory(): FactsFragment
}