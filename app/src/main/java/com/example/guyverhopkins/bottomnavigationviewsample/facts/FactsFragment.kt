package com.example.guyverhopkins.bottomnavigationviewsample.facts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guyverhopkins.bottomnavigationviewsample.R
import dagger.android.DaggerFragment
import javax.inject.Inject

/**
 * TODO Create class header 10/26/16.
 */

class FactsFragment : DaggerFragment(), FactsContract.View {

    @Inject
    lateinit var presenter: FactsPresenter

    private var rootView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_facts, container, false)

        rootView = view.findViewById(R.id.facts_content)

        return view
    }
    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    override fun onPause() {
        presenter.detachView()
        super.onPause()
    }
}
