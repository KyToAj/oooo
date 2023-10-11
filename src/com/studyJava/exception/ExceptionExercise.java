package com.studyJava.exception;

import java.util.Scanner;

/**
 * @author aj
 * @version 1.0
 */
public class ExceptionExercise {
    public static int  s;
    public static void main(String[] args) {
        boolean loop = true;

           while(loop){
               try {
                   System.out.println("请输入一个整数");
                   Scanner sca = new Scanner(System.in);
                   s = sca.nextInt();
                   loop = false;
               } catch (Exception e) {
                   System.out.println("输入的不是整数，请重新输入");
               }
           }
        System.out.println(s);
    }
}
