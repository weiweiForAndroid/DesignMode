package com.totiming.designmode.command;

import android.graphics.Path;

/**
 * author：supershook on 2016/5/18 16:43
 * 普通画笔
 */
public class NormalBrush implements Ibrush{

    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x,y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x,y);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
