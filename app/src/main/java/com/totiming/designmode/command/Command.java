package com.totiming.designmode.command;

import android.graphics.Canvas;

/**
 * author：supershook on 2016/5/18 16:54
 * 命令
 */
public interface Command {
    void draw(Canvas canvas);
    void undo();
}
