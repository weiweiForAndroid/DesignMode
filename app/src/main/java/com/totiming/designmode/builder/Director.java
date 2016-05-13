package com.totiming.designmode.builder;

/**
 * author：supershook on 2016/5/13 10:18
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void construct(String bord, String display, String os) {
        builder.buildBord(bord);
        builder.buildDisplay(display);
        builder.buildOS(os);
    }
}
