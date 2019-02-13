package com.example.guyverhopkins.bottomnavigationviewsample.sounds

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import com.example.guyverhopkins.bottomnavigationviewsample.facts.FactsFragment
import com.example.guyverhopkins.bottomnavigationviewsample.facts.FactsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * created by ghopkins 1/10/18.
 */
@Module
abstract class SoundsFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(SoundsModule::class))
    internal abstract fun providesSoundsFragmentFactory(): SoundsFragment
}