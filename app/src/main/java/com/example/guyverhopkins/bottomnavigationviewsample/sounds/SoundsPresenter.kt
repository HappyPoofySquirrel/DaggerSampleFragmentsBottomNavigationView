package com.example.guyverhopkins.bottomnavigationviewsample.sounds

import android.media.SoundPool
import com.example.guyverhopkins.bottomnavigationviewsample.R

import javax.inject.Inject

/**
 * TODO Create class header 1/30/17.
 */


class SoundsPresenter @Inject constructor(soundPool: SoundPool): SoundsContract.Presenter {

    internal var view: SoundsContract.View? = null

    override fun onFirstClick() {
            view?.playSound(R.id.bottom_nav_view)
    }

    override fun attachView(view: SoundsContract.View) {
        this.view = view
    }

    override fun detachView() {
       view = null
    }

    override fun onSecondClick() {
    }

    override fun onThirdClick() {
    }

    override fun onFourthClick() {
    }

    override fun onbuttonClick() {
    }
//
//
//    internal var mySound: SoundPool
//    internal var barkingId: Int = 0
//    internal var crywhineId: Int = 0
//    internal var funkyId: Int = 0
//    internal var purrId: Int = 0
//    internal var squakId: Int = 0
//
//    @Override
//    protected fun onCreate(savedInstanceState: Bundle) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sound_board)
//        val toolbar = findViewById(R.id.toolbar) as Toolbar
//        setSupportActionBar(toolbar)
//        getSupportActionBar().setDisplayShowHomeEnabled(true)  //add these 2 lines to display icon
//        getSupportActionBar().setIcon(R.mipmap.ic_launcher)
//        getSupportActionBar().setTitle("Sounds")
//        mySound = SoundPool(1, AudioManager.STREAM_MUSIC, 0)
//        barkingId = mySound.load(this, R.raw.barking, 1)
//        crywhineId = mySound.load(this, R.raw.crywhinee, 1)
//        funkyId = mySound.load(this, R.raw.funkypursqueek, 1)
//        purrId = mySound.load(this, R.raw.purr, 1)
//        squakId = mySound.load(this, R.raw.squakshort, 1)
//
//    }
//
//    fun playbarking(view: View) {
//        mySound.play(barkingId, 1, 1, 1, 0, 1)
//    }
//
//
//    fun playsquak(view: View) {
//        mySound.play(squakId, 1, 1, 1, 0, 1)
//    }
//
//    fun playpurr(view: View) {
//        mySound.play(purrId, 1, 1, 1, 0, 1)
//    }
//
//    fun playfunky(view: View) {
//        mySound.play(funkyId, 1, 1, 1, 0, 1)
//    }
//
//    fun playcrywhine(view: View) {
//        mySound.play(crywhineId, 1, 1, 1, 0, 1)
//    }
}
