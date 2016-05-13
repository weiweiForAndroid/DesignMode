package com.totiming.designmode.builder;

/**
 * author：supershook on 2016/5/12 19:06
 */
public class MacBuilder extends Builder {
    public  Computer mac = new Mac();

    @Override
    public void buildDisplay(String display) {
        mac.setmDisplay(display);

    }

    @Override
    public void buildOS(String os) {
        mac.setmOS(os);
    }

    @Override
    public void buildBord(String bord) {
        mac.setmBord(bord);
    }

    @Override
    public Computer create() {
        return mac;
    }
}
