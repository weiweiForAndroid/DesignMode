package com.totiming.designmode.FactoryMode;

/**
 * author：supershook on 2016/5/13 11:11
 */
public interface Factory {
    <T extends Product> T create(Class<T> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
