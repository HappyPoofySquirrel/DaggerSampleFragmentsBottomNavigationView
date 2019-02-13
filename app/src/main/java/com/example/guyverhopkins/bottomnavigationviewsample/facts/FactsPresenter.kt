package com.example.guyverhopkins.bottomnavigationviewsample.facts

import javax.inject.Inject

/**
 * TODO Create class header 1/26/17.
 */

class FactsPresenter @Inject constructor() : FactsContract.Presenter {
    override fun attachView(view: FactsContract.View) {
        this.view = view

    }

    override fun detachView() {
      view = null
    }

    internal var view: FactsContract.View? = null
}
