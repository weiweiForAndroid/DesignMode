package com.totiming.designmode.iterator;

/**
 * author：supershook on 2016/5/17 17:34
 */
public class TestIterator {
    public void test() {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        Request1 request1 = new Request1();
        Request2 request2 = new Request2();
        Request3 request3 = new Request3();

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);

    }
}
