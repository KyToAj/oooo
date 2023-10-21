package com.studyJava.System_;

import java.util.Arrays;

/**
 * @author aj
 * @version 1.0
 */
public class System1 {
    public static void main(String[] args) {
        System.out.println("ooo1");
        // exit(0) : 表示程序退出
//        System.exit(0);
        System.out.println("OOO2");
        int i[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(i));
        int i2[] = new int[i.length+1];
        System.arraycopy(i,1,i2,0,6);
        System.out.println(Arrays.toString(i2));
        System.out.println(System.currentTimeMillis());
    }
}
