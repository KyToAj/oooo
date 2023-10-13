package com.studyJava.String_;

import java.util.Scanner;

/**
 * @author aj
 * @version 1.0
 */
public class StringBuffer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("商品名\t商品价格");
        String name = scanner.next();
        String price = scanner.next();
//        String[] fruitArray = fruits.split(",")
        String [] price01 = price.split("\\.");
        StringBuffer sb1 = new StringBuffer(price01[0]);
        sb1.reverse();
        System.out.println(sb1.length());
        for (int i = 3; i < sb1.length()-1; i+=4) {
            sb1.insert(i,",");
        }
        sb1.reverse();
        sb1.append("."+price01[1]);
        System.out.println("商品名\t商品价格");
        System.out.print(name + "\t\t");
        System.out.print(sb1);
    }
}
