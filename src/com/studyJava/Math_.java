package com.studyJava;

/**
 * @author aj
 * @version 1.0
 */
public class Math_ {
    public static void main(String[] args) {
        //返回数的绝对值
        int n1 = Math.abs(-5);
        System.out.println(n1);
        //返回大于等于参数的最小整数
        double n2 = Math.ceil(6.1);
        System.out.println(n2);
        //返回小于等于参数的最大整数
        double n3 = Math.floor(9.8);
        System.out.println(n3);
        //返回最接近参数的整数
        double n4 = Math.round(5.4);
        System.out.println(n4);
    }
}
