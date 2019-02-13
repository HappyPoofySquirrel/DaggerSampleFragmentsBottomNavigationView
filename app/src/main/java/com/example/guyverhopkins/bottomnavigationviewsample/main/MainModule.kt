package com.example.guyverhopkins.bottomnavigationviewsample.main

import android.app.Application
import android.content.Context
import com.example.guyverhopkins.bottomnavigationviewsample.core.app.AppComponent
import com.example.guyverhopkins.bottomnavigationviewsample.core.app.AppModule
import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerActivity
import com.example.guyverhopkins.bottomnavigationviewsample.gallery.`GalleryFragmentProvider_ProvideGalleryFragmentFactory$app_debug`
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * TODO Create class header 1/26/17.
 */

//provides the instance of the presenter

@Module
 class MainModule {
    @Provides
    fun providesMainPresenter(): MainPresenter = MainPresenter()

//    abstract fun exposeRetrofit(): Retrofit
//    @Provides
//    fun providesRetrofit(retrofit: Retrofit): Retrofit = retrofit


//    @Provides
//    fun providesFragmentHelper(activity : DaggerActivity): FragmentHelper = FragmentHelper(activity.fragmentManager, activity.baseContext)

}
