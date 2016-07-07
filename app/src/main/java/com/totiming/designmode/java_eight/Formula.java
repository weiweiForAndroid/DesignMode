package com.totiming.designmode.java_eight;

/**
 * author：supershook on 2016/7/6 14:45
 * java8新特性  在接口中可以存在以default修饰的 普通方法
 */
public interface Formula {
    double calculate(int a);

    /**
     * java8新特性  在接口中可以存在以default修饰的 普通方法
     * @param b
     * @return
     */
    default double sqrt(int b) {
        return Math.sqrt(b);
    }

    /**
     * 兼职抽象类
     * @return
     */
    default boolean isOk(){
        return true;
    }
}
