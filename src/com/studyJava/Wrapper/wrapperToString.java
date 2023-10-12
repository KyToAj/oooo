package com.studyJava.Wrapper;

/**
 * @author aj
 * @version 1.0
 */
public class wrapperToString {
    public static void main(String[] args) {
//        int n1 = 10;
        //包装类转为字符串
        Integer n1 = 10;
        //1. toString
        String str1 = n1.toString();
        //2.
        String str2 = n1 + "";
        //3.
        String str3 = String.valueOf(n1);
        //字符串转为包装类
        String str4 = "12121";
        //1.
        Integer i1 = Integer.parseInt(str4);
        //2.
        Integer i2 = Integer.valueOf(str4);
        //3.
        Integer i3 = new Integer(str4);
    }
}
