package com.example.guyverhopkins.bottomnavigationviewsample.sounds

import com.example.guyverhopkins.bottomnavigationviewsample.core.common.IPresenter

/**
 * TODO Create class header 1/30/17.
 */

interface SoundsContract {

    interface View {
        fun playSound(bottom_nav_view: Int)

        //    void showMessage(int resourceId
        // );

    }

    interface Presenter :IPresenter<View>{
        fun onFirstClick()
        fun onSecondClick()
        fun onThirdClick()
        fun onFourthClick()
        fun onbuttonClick()
    }
}
