package com.studyJava.Calendar_;

import java.sql.SQLOutput;
import java.util.Calendar;

/**
 * @author aj
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.YEAR) + "-年" + (c.get(Calendar.MONTH) + 1) + "-月" + c.get(Calendar.DAY_OF_MONTH) + "-日");
    }
}
