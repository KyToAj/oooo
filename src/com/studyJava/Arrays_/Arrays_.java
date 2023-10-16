package com.studyJava.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author aj
 * @version 1.0
 */
public class Arrays_ {
    public static void main(String[] args) {
        Integer i[] = {1,3,5,4,7,2,8,1,9};
        // toString 输出字符串
        System.out.println(Arrays.toString(i));
        // sort 排序  可以使用冒泡排序，也可以使用sort方法进行排序
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
        // sort倒序(自定义排序)
        // 调用 定制排序 ，传入两个参数 (1) i数组
        // (2) 实现Comparator接口的匿名内部类 ， 要求实现方法 compare 方法
        Arrays.sort(i, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(i));
    }
}
