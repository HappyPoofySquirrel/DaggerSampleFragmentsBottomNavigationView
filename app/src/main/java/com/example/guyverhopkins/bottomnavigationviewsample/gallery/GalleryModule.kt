package com.example.guyverhopkins.bottomnavigationviewsample.gallery

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * created by ghopkins 1/10/18.
 */
@Module
class GalleryModule {

    @Provides
    fun providesGalleryPresenter(retrofit: Retrofit): GalleryPresenter = GalleryPresenter(retrofit)
}