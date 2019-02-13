package com.example.guyverhopkins.bottomnavigationviewsample.sounds

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import butterknife.BindView
import butterknife.OnClick
import com.example.guyverhopkins.bottomnavigationviewsample.R
import dagger.android.DaggerFragment
import kotlinx.android.synthetic.main.fragment_sounds.*
import kotlinx.android.synthetic.main.fragment_sounds.view.*
import javax.inject.Inject

/**
 * TODO Create class header 10/26/16.
 */

class SoundsFragment : DaggerFragment(), SoundsContract.View {

    @Inject
    lateinit var presenter: SoundsPresenter

    lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sounds, container, false)

        rootView = view.findViewById(R.id.sounds_content)

        view.first_button.setOnClickListener {  presenter.onFirstClick()}
        view.button.setOnClickListener {  presenter.onbuttonClick()}
        view.button2.setOnClickListener {  presenter.onSecondClick()}
        view.button3.setOnClickListener {  presenter.onThirdClick()}
        view.button4.setOnClickListener {  presenter.onFourthClick()}
        return view
    }

    override fun playSound(bottom_nav_view: Int) {
        showMessage(R.string.sounds_fragment_success)
        //((MainActivity)getActivity()).showMessage(R.string.sounds_fragment_success);
        //soundPool.play(bottom_nav_view, 1, 1, 0, 0, 1);
    }

    fun showMessage(resourceId: Int) {
        val snackbar = Snackbar.make(rootView, getText(resourceId), Snackbar.LENGTH_SHORT)
        snackbar.show()
    }
    override fun onPause() {
        super.onPause()
        presenter.detachView()
    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }
}
