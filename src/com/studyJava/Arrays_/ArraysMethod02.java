package com.studyJava.Arrays_;

import java.util.Arrays;

/**
 * @author aj
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer i[] = {41,5552,412,32,-147};
        Arrays.binarySearch(i,41);
        // binarySearch 通过二分搜索法进行查找
        System.out.println(Arrays.binarySearch(i,41));
        Arrays.sort(i);
        // binarySearch 必须先进行排序（要求该数组是有序的，如果该数组是无序的，不能使用binarySearch）
        System.out.println(Arrays.binarySearch(i,41));
        // 负数值的计算方式是 - (插入点 + 1)，其中 "插入点" 是指如果要将该元素插入到数组中以保持有序性，应该放在数组的哪个位置。
        System.out.println(Arrays.binarySearch(i,-1111));
        //
        Integer i2[] = Arrays.copyOf(i,i.length);
        System.out.println(Arrays.toString(i2));
    }
}
