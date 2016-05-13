package com.totiming.designmode.FactoryMode;

/**
 * author：supershook on 2016/5/13 11:15
 */
public class TestFactory {
    public void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyFactory m = new MyFactory();
        Product product = m.create(ProductA.class);
        System.out.println(product);
    }
}
