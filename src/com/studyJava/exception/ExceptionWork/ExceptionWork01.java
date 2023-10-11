package com.studyJava.exception.ExceptionWork;

import java.util.Scanner;

/**
 * @author aj
 * @version 1.0
 */
public class ExceptionWork01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num1 ;
        int num2 ;
//        String inputStr1 ;
//        String inputStr2 ;
        try{
//            System.out.println("请输入第一个数");
//            inputStr1 = sca.next();
//            num1 = Integer.parseInt(inputStr1);
//            System.out.println("请输入第二个数");
//            inputStr2 = sca.next();
//            num2 = Integer.parseInt(inputStr2);
//            System.out.println( cal(num1,num2));
            if(args.length > 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            System.out.println(cal(num1,num2));
        }catch (NumberFormatException e ){
            System.out.println("请输入一个整数");

        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }

    }
    public static double cal(int num1,int num2){
        return num1/num2;
    }
}
