package com.example.guyverhopkins.bottomnavigationviewsample.core.app

import android.app.Application
import android.content.Context
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.*
import javax.inject.Singleton

/**
 * TODO Create class header 1/26/17.
 */

@Module
class AppModule {
    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    fun providesGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return gsonBuilder.create()
    }

    @Provides
    @Singleton
    fun providesOkHttpClient(app: App): OkHttpClient {
        val cacheDir = File(app.cacheDir, UUID.randomUUID().toString())
        // 10 MiB cache
        val cache = Cache(cacheDir, 10 * 1024 * 1024)
        val client = OkHttpClient.Builder()
        client.cache(cache)
        return client.build()
    }

    @Provides
    fun providesRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {

        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                //                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("http://www.google.com")
                .client(okHttpClient)
                .build()
    }
}