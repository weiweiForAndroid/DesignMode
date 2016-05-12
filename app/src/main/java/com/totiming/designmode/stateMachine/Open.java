package com.totiming.designmode.stateMachine;

/**
 * author：supershook on 2016/5/12 11:56
 */
public class Open implements LightState {
    Light light ;
    public Open(Light light) {
        this.light = light;
    }

    @Override
    public void handleLight() {
        light.state = new Close(light);
    }

    @Override
    public String toString() {
        return "开";
    }
}
