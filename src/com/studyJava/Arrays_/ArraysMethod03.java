package com.studyJava.Arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
public class ArraysMethod03 {
    public static void main(String[] args) {
        Integer i2 [] = new Integer[7];
        Arrays.fill(i2,3);
        System.out.println(Arrays.toString(i2));
        Integer i[] = Arrays.copyOf(i2,i2.length-1);
        System.out.println(Arrays.equals(i,i2));

        List asList = Arrays.asList(i);
        System.out.println(asList);
    }
}
