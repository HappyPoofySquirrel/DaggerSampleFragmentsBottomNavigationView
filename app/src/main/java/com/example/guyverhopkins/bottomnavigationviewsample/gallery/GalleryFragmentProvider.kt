package com.example.guyverhopkins.bottomnavigationviewsample.gallery

/**
 * created by ghopkins 1/8/18.
 */

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import com.example.guyverhopkins.bottomnavigationviewsample.main.MainModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module //(includes = arrayOf(MainModule::class))
abstract class GalleryFragmentProvider {

    @ContributesAndroidInjector(modules = arrayOf(GalleryModule::class))
    @PerFragment
    internal abstract fun provideGalleryFragmentFactory(): GalleryFragment
}
