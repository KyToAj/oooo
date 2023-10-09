package com.studyJava.exception;

/**
 * @author aj
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1/num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( " ，程序顺利运行");

    } 
}
