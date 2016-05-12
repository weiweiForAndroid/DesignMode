package com.totiming.designmode.stateMachine;

/**
 * author：supershook on 2016/5/12 11:56
 */
public class Close implements LightState {
    Light light;
    public Close(Light light){
        this.light = light;
    }

    @Override
    public void handleLight() {
        light.state = new Open(light);
    }

    @Override
    public String toString() {
        return "关";
    }
}
