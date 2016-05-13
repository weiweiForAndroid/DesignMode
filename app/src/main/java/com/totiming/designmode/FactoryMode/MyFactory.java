package com.totiming.designmode.FactoryMode;

/**
 * author：supershook on 2016/5/13 11:15
 * 通过反射，快速创建用户要的实例
 */
public class MyFactory implements Factory {

    @Override
    public <T extends Product> T create(Class<T> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Product product = null;
        product = (Product) clazz.forName(clazz.getName()).newInstance();
        return (T) product;
    }
}
