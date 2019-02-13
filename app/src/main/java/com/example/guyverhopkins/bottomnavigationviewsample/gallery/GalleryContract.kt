package com.example.guyverhopkins.bottomnavigationviewsample.gallery


import com.example.guyverhopkins.bottomnavigationviewsample.core.common.IPresenter

/**
 * TODO Create class header 1/26/17.
 */

interface GalleryContract {

    interface View {
        fun showPosts()

        fun showComplete()

        //    void showMessage(int resourceId);
    }

    interface Presenter :IPresenter<View>{

        fun loadPost()
    }

}
