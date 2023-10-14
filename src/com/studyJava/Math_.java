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
        //返回两个数中的较大值或较小值
        double n5 = Math.max(n1,n3);
        double n6 = Math.min(n1,n3);
        System.out.println("max = " + n5 + ",min = " + n6);
        //求幂
        double n7 = Math.pow(2.5,6);
        System.out.println(n7);
        //求算数平方根
        double n8 = Math.sqrt(n7);
        System.out.println(n8);
        double n9 = (int)(6 * Math.random()+2);
        System.out.println(n9);
    }
}
