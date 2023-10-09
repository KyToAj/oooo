package IfElse;

import java.util.Scanner;
public class qiantaofenzhitest {
    public static void main(String[] args) {
        Scanner danji = new Scanner(System.in);
        Scanner nianling = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = danji.nextInt();
        if(month >= 4 && month <= 10){
            System.out.println("请输入年龄");
            int age = nianling.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("您是成人，票价为:60");
            } else if (age < 18) {
                System.out.println("您是儿童，票价为:30");
            }
            else {
                System.out.println("您是老人，票价为:20");
            }
        }
        else {
            System.out.println("请输入年龄");
            int age = nianling.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("您是成人，票价为:40");
            }
            else {
                System.out.println("您是其他，票价为:20");
            }
        }
    }
}
