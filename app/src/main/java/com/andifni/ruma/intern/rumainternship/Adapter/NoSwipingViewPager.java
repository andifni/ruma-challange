package com.andifni.ruma.intern.rumainternship.Adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Andi Fajar on 03/03/2016.
 */
public class NoSwipingViewPager extends ViewPager {
    private boolean enabled;

    public NoSwipingViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        enabled = false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return this.enabled && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return this.enabled && super.onInterceptTouchEvent(event);
    }

    public void setEnableSwipe(boolean enabled) {
        this.enabled = enabled;
    }
}
