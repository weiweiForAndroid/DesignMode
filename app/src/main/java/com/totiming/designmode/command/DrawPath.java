package com.totiming.designmode.command;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * author：supershook on 2016/5/18 16:56
 * 绘制路径命令
 */
public class DrawPath implements Command {
    public Path path;
    public Paint paint;
    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(path,paint);
    }

    @Override
    public void undo() {

    }
}
