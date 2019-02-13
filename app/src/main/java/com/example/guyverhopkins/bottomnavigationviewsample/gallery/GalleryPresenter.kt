package com.example.guyverhopkins.bottomnavigationviewsample.gallery


import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * TODO Create class header 1/26/17.
 */

class GalleryPresenter
@Inject
constructor(var retrofit: Retrofit) : GalleryContract.Presenter {

    internal var view: GalleryContract.View? = null

    override fun loadPost() {
//        view!!.showMessage(R.string.gallery_success)
        //        retrofit.create(PostService.class).getPostList().subscribeOn(Schedulers.io())
        //                .observeOn(AndroidSchedulers.mainThread())
        //                .unsubscribeOn(Schedulers.io())
        //                .subscribe(new Observer<List<Post>>() {
        //                    @Override
        //                    public void onCompleted() {
        //                        mView.showComplete();
        //                    }
        //
        //                    @Override
        //                    public void onError(Throwable e) {
        //                        mView.showError(e.getMessage());
        //                    }
        //
        //                    @Override
        //                    public void onNext(List<Post> posts) {
        //                        mView.showPosts(posts);
        //                    }
        //                });
    }

    override fun attachView(view: GalleryContract.View) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }
}
