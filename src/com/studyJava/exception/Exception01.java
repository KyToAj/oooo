package com.studyJava.exception;

/**
 * @author aj
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int num3 = -15;
        try {
            int result = num1/num2 + num3;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println( " 程序顺利运行");
        int nu = num1 / num2;
        System.out.println(nu);
    }

}
