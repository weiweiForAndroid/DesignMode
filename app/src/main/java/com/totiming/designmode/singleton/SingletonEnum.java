package com.totiming.designmode.singleton;

import java.io.ObjectStreamException;

/**
 * author：supershook on 2016/5/12 18:41
 * 枚举类单例是线程安全的。
 */
public enum SingletonEnum {
    INSTANCE;
    public void doSomething(){

    }

    /**
     * 反序列化的时候会调用该方法。防止破坏单例模式。
     * @return
     * @throws ObjectStreamException
     */
    private  Object readResolve() throws ObjectStreamException{
        return  INSTANCE;
    }
}
