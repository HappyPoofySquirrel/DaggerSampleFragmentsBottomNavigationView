package com.example.guyverhopkins.bottomnavigationviewsample.core.app

import com.example.guyverhopkins.bottomnavigationviewsample.facts.FactsFragmentProvider
import com.example.guyverhopkins.bottomnavigationviewsample.gallery.GalleryFragmentProvider
import com.example.guyverhopkins.bottomnavigationviewsample.main.MainModule
import com.example.guyverhopkins.bottomnavigationviewsample.main.MainActivity
import com.example.guyverhopkins.bottomnavigationviewsample.sounds.SoundsFragmentProvider
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * created by ghopkins 1/8/18.
 */

@Module
abstract class ActivityBuilder {

//    @ContributesAndroidInjector(modules = [(MainModule::class)])
//    internal abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [(MainModule::class), (FactsFragmentProvider::class), (SoundsFragmentProvider::class), (GalleryFragmentProvider::class)])
    abstract fun bindMainActivity(): MainActivity
}