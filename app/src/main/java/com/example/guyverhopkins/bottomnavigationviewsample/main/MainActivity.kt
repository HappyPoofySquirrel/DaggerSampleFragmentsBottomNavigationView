package com.example.guyverhopkins.bottomnavigationviewsample.main

import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.app.FragmentTransaction
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.view.MenuItem
import android.widget.RelativeLayout

import com.example.guyverhopkins.bottomnavigationviewsample.R
import com.example.guyverhopkins.bottomnavigationviewsample.core.common.FragmentHelper
import com.example.guyverhopkins.bottomnavigationviewsample.facts.FactsFragment
import com.example.guyverhopkins.bottomnavigationviewsample.gallery.GalleryFragment
import com.example.guyverhopkins.bottomnavigationviewsample.sounds.SoundsFragment

import javax.inject.Inject

import butterknife.BindView
import butterknife.ButterKnife
import dagger.android.AndroidInjector
import dagger.android.DaggerFragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.HasSupportFragmentInjector

class MainActivity : DaggerAppCompatActivity(), MainContract.View {

    @BindView(R.id.bottom_nav_view)
    lateinit var bottomNavigationView: BottomNavigationView

//    lateinit var fragmentManager: FragmentManager


    lateinit var fragment: DaggerFragment

    @Inject
     lateinit var presenter: MainPresenter

//    @BindView(R.id.main_content)
//     var rlContent: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

//        if ((resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) or (resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK < Configuration.SCREENLAYOUT_SIZE_LARGE)) {
//            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//        } else {
//            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
//        }
//        fragmentManager = getFragmentManager()

        val listener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when {
                item.itemId == R.id.sounds_nav_button -> fragment = SoundsFragment()
                item.itemId == R.id.facts_nav_button -> fragment = FactsFragment()
                item.itemId == R.id.gallery_nav_button -> fragment = GalleryFragment()
            }
            val transaction = fragmentManager.beginTransaction()
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.replace(R.id.main_content, fragment).commit()
            true
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(listener)

        bottomNavigationView.performClick() //show one of the fragments
    }

    //    @Override
    //    public void showSoundsFragment() {
    //        fragmentHelper.showSoundsFragment();
    //    }
    //
    //    @Override
    //    public void showFactsFragment() {
    //        fragmentHelper.showFactsFragment();
    //    }
    //
    //    @Override
    //    public void showGalleryFragment() {
    //        fragmentHelper.showGalleryFragment();
    //    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    public override fun onPause() {
        super.onPause()
        presenter.detachView()
    }
}
//if (item.getItemId() == R.id.delete_button) {
//        if (deleteFragment != null) {
//        fragmentTransaction.replace(R.id.fragment_container, deleteFragment);
//        }
//        deleteFragment = new SoundsFragment();
//        fragmentTransaction.add(R.id.fragment_container, deleteFragment).commit();
//        }
//        if (item.getItemId() == R.id.add_button) {
//        if (addFragment != null) {
//        fragmentTransaction.replace(R.id.fragment_container, addFragment);
//        } else {
//        addFragment = new FactsFragment();
//        fragmentTransaction.add(R.id.fragment_container, addFragment).commit();
//        }
//        }