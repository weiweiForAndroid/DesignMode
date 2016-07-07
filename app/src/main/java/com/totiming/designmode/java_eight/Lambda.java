package com.totiming.designmode.java_eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * author：supershook on 2016/7/6 15:39
 * Lambda 表达式
 */
public class Lambda {
    /**
     * 转换接口
     *
     * @param <F>
     * @param <T>
     */
    interface Convert<F, T> {
        T convert(F from);
//        void sqrt(T t);
    }

    class A{
        void doSomething(){
            System.out.println("doSomething");
        }
    }


    public void test() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        //传统写法

//        Collections.sort(names, new Comparator<String>() {//这里就提示可以使用lambda表达式了。
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
//极简写法
        Collections.sort(names, (a, b) -> (a.compareTo(b)));
        System.out.println(names.toString());

//方法与构造的函数引用
        Convert<String, Integer> convert =Integer::valueOf;
       Integer value =  convert.convert("123");
        System.out.println("值=="+value);
//String str = "weiwe";
//        convert = str::startsWith;
//        convert.convert("sfa");

    }
}
