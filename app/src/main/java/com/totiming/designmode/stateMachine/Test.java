package com.totiming.designmode.stateMachine;

/**
 * author：supershook on 2016/5/12 16:27
 */
public class Test {
    public static void test(){
        Light light = new Light();
        light.state = new Open(light);
        light.operate();
        light.operate();
        light.operate();

    }
}
