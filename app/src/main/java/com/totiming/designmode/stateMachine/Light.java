package com.totiming.designmode.stateMachine;

/**
 * author：supershook on 2016/5/12 11:55
 */
public class Light {
    public LightState state;

    public Light() {

    }

    public Light(LightState state) {
        this.state = state;
    }

    public void operate() {
        if (state != null) state.handleLight();
        System.out.println("当前状态："+state.toString());
    }
}
