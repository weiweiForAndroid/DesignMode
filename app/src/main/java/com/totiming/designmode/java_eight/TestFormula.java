package com.totiming.designmode.java_eight;

/**
 * author：supershook on 2016/7/6 15:15
 */
public class TestFormula {
    Formula formula = new Formula() {
        @Override
        public double calculate(int a) {
            return sqrt(a*a);
        }
    };
    public  void test(){
        double a = formula.calculate(100);
        double b = formula.sqrt(100);
        System.out.println(a+"//"+b);
    }
}
