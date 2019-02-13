package com.example.guyverhopkins.bottomnavigationviewsample.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.guyverhopkins.bottomnavigationviewsample.R
import dagger.android.DaggerFragment
import javax.inject.Inject


class GalleryFragment : DaggerFragment(), GalleryContract.View {

    @Inject
    lateinit var presenter: GalleryPresenter

    private var rootView: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        rootView = view.findViewById(R.id.gallery_content)

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

    override fun showPosts() {

    }

    override fun showComplete() {

    }

    companion object {
        var GALLERY_FRAG_TAG = "gallery"
    }

    //    @Override
    //    public void showMessage(int resourceId) {
    //        Snackbar snackbar = Snackbar.make(rootView, getText(resourceId), Snackbar.LENGTH_SHORT);
    //        snackbar.show();
    //    }

//
//    //the images to display
//    internal var imageIDs = arrayOf<Integer>(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3)
//
//    @Override
//    protected fun onCreate(savedInstanceState: Bundle) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_gallery)
//
//        // Note that Gallery view is deprecated in Android 4.1---
//        val gallery = findViewById(R.id.gallery1) as Gallery
//        gallery.setAdapter(ImageAdapter(this))
//        gallery.setOnItemClickListener(object : OnItemClickListener() {
//            fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
//                Toast.makeText(getBaseContext(), "pic" + (position + 1) + " selected",
//                        Toast.LENGTH_SHORT).show()
//                // display the images selected
//                val imageView = findViewById(R.id.image1) as ImageView
//                imageView.setImageResource(imageIDs[position])
//            }
//        })
//    }
//
//    inner class ImageAdapter(private val context: Context) : BaseAdapter() {
//        private val itemBackground: Int
//        // returns the number of images
//        val count: Int
//            get() = imageIDs.size
//
//        init {
//            // sets a grey background; wraps around the images
//            val a = obtainStyledAttributes(R.styleable.MyGallery)
//            itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0)
//            a.recycle()
//        }
//
//        // returns the ID of an item
//        fun getItem(position: Int): Object {
//            return position
//        }
//
//        // returns the ID of an item
//        fun getItemId(position: Int): Long {
//            return position.toLong()
//        }
//
//        // returns an ImageView view
//        fun getView(position: Int, convertView: View, parent: ViewGroup): View {
//            val imageView = ImageView(context)
//            imageView.setImageResource(imageIDs[position])
//            imageView.setLayoutParams(Gallery.LayoutParams(100, 100))
//            imageView.setBackgroundResource(itemBackground)
//            return imageView
//        }
//    }
}
