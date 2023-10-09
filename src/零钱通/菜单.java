package 零钱通;

import java.util.Scanner;

/**
 * 完成零钱通各个功能的类。
 * 使用面向对象完成。
 */

public class 菜单 {

    String key;
    boolean loop = true;
    public void mainMenu(){
        do {
            System.out.println("---------------零钱通菜单---------------");
            System.out.println("\t\t 1  零钱通明细 \n\t\t 2  收益入账\n\t\t 3  消费\n\t\t 4  退出");
            Scanner sca = new Scanner(System.in);
            System.out.println("请选择 （1 ~ 4)：");
            key = sca.next();
            switch (key) {
                case "1":
                    System.out.println("零钱通明细：");
                    break;
                case "2":
                    System.out.println("收益入账：");
                    break;
                case "3":
                    System.out.println("消费：");
                    break;
                case "4":
                    System.out.println("确定退出？y/n");
                    char b = sca.next().charAt(0);
                    if (b == 'y') {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");

            }
        }while (loop);
        System.out.println("已经退出零钱通。");
    }
}
