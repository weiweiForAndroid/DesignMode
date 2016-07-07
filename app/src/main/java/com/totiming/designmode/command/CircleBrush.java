package com.totiming.designmode.command;

import android.graphics.Path;

/**
 * author：supershook on 2016/5/18 16:50
 * 原点组成的线条
 */
public class CircleBrush implements Ibrush {
    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x,y,10,Path.Direction.CW);

    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
