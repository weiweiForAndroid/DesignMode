package com.totiming.designmode.command;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * author：supershook on 2016/5/18 16:59
 * 命令驱动
 */
public class DrawInvoker {
    /**
     * 绘制列表
     */
    private List<DrawPath> drawList = Collections.synchronizedList(new ArrayList<DrawPath>());
    /**
     * 重做列表
     */
    private List<DrawPath> redoList = Collections.synchronizedList(new ArrayList<DrawPath>());

    /**
     * 添加命令
     *
     * @param command
     */
    public void add(DrawPath command) {
        redoList.clear();
        drawList.add(command);
    }

    /**
     * 撤销上一步命令
     */
    public void undo() {
        if (drawList.size() > 0) {
            DrawPath undo = drawList.get(drawList.size() - 1);
            drawList.remove(undo);
            redoList.add(undo);
        }
    }

    /**
     * 重做上一步撤销的命令
     */
    public void redo() {
        if (redoList.size() > 0) {
            DrawPath drawPath = redoList.get(redoList.size() - 1);
            redoList.remove(drawPath);
            drawList.add(drawPath);
        }
    }

    /**
     * 执行命令
     */
    public void execute(Canvas canvas) {
        if (drawList != null) {
            for (DrawPath path : drawList
                    ) {
                path.draw(canvas);
            }
        }
    }

    /**
     * @return 是否可以重做
     */
    public boolean canRedo(){
        return redoList.size()>0;
    }

    /**
     * @return 是否可以撤销
     */
    public  boolean canUndo(){
        return  drawList.size()>0;
    }
}
