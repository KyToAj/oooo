package com.studyJava.exception;

import java.util.Scanner;

/**
 * @author aj
 * @version 1.0
 */
public class ExceptionExercise {
    public static void main(String[] args) {
        int s = 0;
        boolean loop = true;
        String inputStr = " ";
        Scanner sca = new Scanner(System.in);
           while(loop){
               try {
                   System.out.println("请输入一个整数");
                   inputStr = sca.next();
                   s = Integer.parseInt(inputStr);
                   loop = false;
               } catch (Exception e) {
                   System.out.println("输入的不是整数，请重新输入");
               }
           }
        System.out.println(s);
    }
}
