package com.studyJava.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author aj
 * @version 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int [] arr = {1,-1,8,10,0};
        //冒泡排序
        mao(arr);
        //定制排序
        bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 =(Integer) o1;
                int i2 =(Integer) o2;

                //从小到大
                return i1 - i2;
            }
        });

    }
    public static void mao(int [] arr){
        int t = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =t ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //冒泡排序 + 定制排序
    public static void bubble(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                //数组排序有由 c.compare(arr[j],arr[j+1] 的返回值决定
                if(c.compare(arr[j],arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
