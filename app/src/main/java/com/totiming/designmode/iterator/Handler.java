package com.totiming.designmode.iterator;

/**
 * author：supershook on 2016/5/17 17:25
 */
public abstract class Handler {
    protected Handler nextHandler;
    public void handleRequest(Request request) {
        if (request.getLevel() == getLevel()) {
            //进行匹配如果不符合规则，则分配给下一个处理者。
            handle(request);
            System.out.println("handler"+getLevel()+" handered request"+request.getLevel());
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }
    }

    public abstract void handle(Request request);

    public abstract int getLevel();
}
