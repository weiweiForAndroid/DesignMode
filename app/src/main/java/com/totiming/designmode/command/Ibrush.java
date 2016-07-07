package com.totiming.designmode.command;

import android.graphics.Path;

/**
 * author：supershook on 2016/5/18 16:42
 * 画笔
 */
public interface Ibrush {
    void down(Path path, float x, float y);
    void move(Path path,float x, float y);
    void up(Path path,float x, float y);
}
