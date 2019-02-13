package com.example.guyverhopkins.bottomnavigationviewsample;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO Create class header 10/26/16.
 */

public class HideableBehavior extends CoordinatorLayout.Behavior  {

    public HideableBehavior(Context context, AttributeSet attrs) {
        super();
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        float translationY = Math.min(0, dependency.getTranslationY() - dependency.getHeight());
        child.setTranslationY(translationY);
        return true;
        //return super.onDependentViewChanged(parent, child, dependency);
    }

    //    @Override
//    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child,
//                               View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
//        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed,
//                dyUnconsumed);
//
//        if (dyConsumed > 0 && child.getVisibility() == View.VISIBLE) {
//            child.hide();
//        } else if (dyConsumed < 0 && child.getVisibility() != View.VISIBLE) {
//            child.show();
//        }
//    }
//
//    @Override
//    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout,
//                                       FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes) {
//        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL ||
//                super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target,
//                        nestedScrollAxes);
//    }

}
