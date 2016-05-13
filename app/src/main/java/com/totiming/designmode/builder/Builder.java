package com.totiming.designmode.builder;

/**
 * author：supershook on 2016/5/12 19:03
 */
public abstract class Builder {
    public  abstract  void buildDisplay(String display);
    public  abstract  void buildOS(String os);
    public  abstract  void buildBord(String bord);
    public abstract Computer create();
}
