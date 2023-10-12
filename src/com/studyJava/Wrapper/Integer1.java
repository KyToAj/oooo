package com.studyJava.Wrapper;

/**
 * @author aj
 * @version 1.0
 */
public class Integer1 {
    public static void main(String[] args) {
        int n1 = 9;
        //手动装箱
        Integer integer =Integer.valueOf(n1);
        //自动装箱
        Integer integer1 = n1;
        //自动拆箱
        int n2 = integer;
        //手动拆箱
        int n3 = integer.intValue();

    }
}
