package com.totiming.designmode.command;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * author：supershook on 2016/5/18 17:31
 */
public class DrawCanvas extends SurfaceView {
    public DrawCanvas(Context context) {
        super(context);
    }

    public DrawCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCanvas(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawCanvas(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
