package Array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double count[] = new double[5];
        //遍历数组
        for(int i = 0 ; i < count.length; i ++) {
            System.out.println("请输入第" + (i+1) + "个元素");
            count[i] = sca.nextDouble();
            System.out.println("第" + (i+1) + "个元素的值为" + count[i]);
        }
    }
}
