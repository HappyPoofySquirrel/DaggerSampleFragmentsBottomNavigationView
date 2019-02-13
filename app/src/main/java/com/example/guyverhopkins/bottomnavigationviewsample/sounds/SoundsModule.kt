package com.example.guyverhopkins.bottomnavigationviewsample.sounds

import android.media.AudioManager
import android.media.SoundPool
import com.example.guyverhopkins.bottomnavigationviewsample.core.common.PerFragment
import dagger.Module
import dagger.Provides

/**
 * created by ghopkins 1/10/18.
 */
@Module
class SoundsModule {

    @Provides
    fun providesSoundsModule(): SoundsPresenter = SoundsPresenter(SoundPool.Builder().setMaxStreams(1).build())
}