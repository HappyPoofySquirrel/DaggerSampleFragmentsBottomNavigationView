package com.example.guyverhopkins.bottomnavigationviewsample.core.common;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.app.FragmentManager;

import com.example.guyverhopkins.bottomnavigationviewsample.R;
import com.example.guyverhopkins.bottomnavigationviewsample.facts.FactsFragment;
import com.example.guyverhopkins.bottomnavigationviewsample.gallery.GalleryFragment;
import com.example.guyverhopkins.bottomnavigationviewsample.sounds.SoundsFragment;

import javax.inject.Inject;

/**
 * TODO Create class header 1/26/17.
 */

public class FragmentHelper {

    SoundsFragment soundsFragment;

    FactsFragment factsFragment;

    GalleryFragment galleryFragment;

    FragmentManager fragmentManager;

    Context context;

//    @Inject
//    public FragmentHelper(FragmentManager fragmentManager, Context context) {
//        this.context = context;
//        this.fragmentManager = fragmentManager;
//    }
//
//
//    public void showSoundsFragment() {
//        if ((factsFragment = (FactsFragment) fragmentManager.findFragmentByTag(FactsFragment.Companion.getFACTS_FRAG_TAG())) != null) {
//            newFragmentTransaction().detach(factsFragment).commit();
//        }  if((galleryFragment = (GalleryFragment) fragmentManager.findFragmentByTag(GalleryFragment.Companion.getGALLERY_FRAG_TAG()))!=null){
//            newFragmentTransaction().detach(galleryFragment).commit();
//        }
//        soundsFragment = (SoundsFragment) fragmentManager.findFragmentByTag(SoundsFragment.Companion.getSOUNDS_FRAG_TAG());
//        if (soundsFragment == null) {
//            soundsFragment = (SoundsFragment) Fragment.instantiate(context, SoundsFragment.class.getName());
//            newFragmentTransaction().add(R.id.fragment_container, soundsFragment, SoundsFragment.Companion.getSOUNDS_FRAG_TAG()).commit();
//        } else {
//            newFragmentTransaction().attach(soundsFragment).commit();
//        }
//    }
//
//    public void showFactsFragment() {
//        if ((soundsFragment = (SoundsFragment) fragmentManager.findFragmentByTag(SoundsFragment.Companion.getSOUNDS_FRAG_TAG())) != null) {
//            newFragmentTransaction().detach(soundsFragment).commit();
//        }  if((galleryFragment = (GalleryFragment) fragmentManager.findFragmentByTag(GalleryFragment.Companion.getGALLERY_FRAG_TAG()))!=null){
//            newFragmentTransaction().detach(galleryFragment).commit();
//        }
//
//        factsFragment = (FactsFragment) fragmentManager.findFragmentByTag(FactsFragment.Companion.getFACTS_FRAG_TAG());
//        if (factsFragment == null) {
//            factsFragment = (FactsFragment) Fragment.instantiate(context, FactsFragment.class.getName());
//            newFragmentTransaction().add(R.id.fragment_container, factsFragment, FactsFragment.Companion.getFACTS_FRAG_TAG()).commit();
//        } else {
//            newFragmentTransaction().attach(factsFragment).commit();
//        }
//    }
//
//    public void showGalleryFragment() {
//        if ((soundsFragment = (SoundsFragment) fragmentManager.findFragmentByTag(SoundsFragment.Companion.getSOUNDS_FRAG_TAG())) != null) {
//            newFragmentTransaction().detach(soundsFragment).commit();
//        } if ((factsFragment = (FactsFragment) fragmentManager.findFragmentByTag(FactsFragment.Companion.getFACTS_FRAG_TAG())) != null) {
//            newFragmentTransaction().detach(factsFragment).commit();
//        }
//        galleryFragment = (GalleryFragment) fragmentManager.findFragmentByTag(GalleryFragment.Companion.getGALLERY_FRAG_TAG());
//        if (galleryFragment == null) {
//            galleryFragment = (GalleryFragment) Fragment.instantiate(context, GalleryFragment.class.getName());
//            newFragmentTransaction().add(R.id.fragment_container, galleryFragment, GalleryFragment.Companion.getGALLERY_FRAG_TAG()).commit();
//        } else {
//            newFragmentTransaction().attach(galleryFragment).commit();
//        }
//    }

    public FragmentTransaction newFragmentTransaction(){
        return fragmentManager.beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
    }

    public boolean fragmentExists(String tag){
        return  fragmentManager.findFragmentByTag(tag) !=null;
    }
}
