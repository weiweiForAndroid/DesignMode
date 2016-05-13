package com.totiming.designmode.builder;

/**
 * author：supershook on 2016/5/13 10:25
 */
public class TestBuilder {
    Builder builder = new MacBuilder();
    Director director = new Director();
    public void test(){
        director.setBuilder(builder);
        director.construct("技嘉","retina","MAC OS");
        System.out.println(builder.create().toString());
    }
}
