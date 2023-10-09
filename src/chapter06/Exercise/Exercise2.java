package Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //输入整数  判断范围
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个整数，我会为您判断属于哪一个范围");
        int z = sca.nextInt();
        if(z >0){
            System.out.println("是一个大于 0 的整数");
        }
        else if( z == 0){
            System.out.println("是一个等于 0 的整数");
        }
        else {
            System.out.println("是一个小于 0 的整数");
        }
    }
}
