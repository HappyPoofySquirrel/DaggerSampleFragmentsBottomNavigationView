package com.example.guyverhopkins.bottomnavigationviewsample.main

/**
 * TODO Create class header 1/26/17.
 */

class MainPresenter : MainContract.Presenter {

    private var view: MainContract.View? = null

    //    @Override
    //    public void showFactsFragment() {
    //        view.showFactsFragment();
    //    }
    //
    //    @Override
    //    public void showSoundsFragment() {
    //        view.showSoundsFragment();
    //    }
    //
    //    @Override
    //    public void showGalleryFragment() {
    //        view.showGalleryFragment();
    //    }

    override fun attachView(view: MainContract.View) {
        this.view = view

    }
    override fun detachView() {
        view = null
    }
}
