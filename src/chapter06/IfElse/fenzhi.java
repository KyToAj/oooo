package IfElse;

import java.util.Scanner;
public class fenzhi {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入马保国的芝麻信用分");
        int sca = myscanner.nextInt();
        //首先对输入的信用分进行范围判断，在0 - 100 是有效范围，否则提示输入错误
        if(sca >= 100 && sca <= 1 ) {
            if (sca == 100) {
                System.out.println("信用极好");
            } else if (sca <= 99 && sca > 80) {
                System.out.println("信用优秀");
            } else if (sca >= 60 && sca < 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("不及格！");
            }
        }
        else{
            System.out.println("输入错误");
        }
    }
}
