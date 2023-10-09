package chapter06.TwoDimensionalArray;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int arr1[] = {10,12,45,90};
        int arr2[] = new int[arr1.length+1];
        for(int i = 0 ; i < arr1.length; i ++){
            arr2[i] = arr1[i];
        }
            System.out.println("请输入您想添加的数字");
            int a = sca.nextInt();
            arr2[arr2.length-1] = a;

        int t = 0;
        for(int i = 0 ; i < arr2.length-1; i ++){
            for(int j = 0 ; j < arr2.length -i -1 ; j ++){
                if(arr2[j] > arr2[j+1]){
                    t = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = t;
                }
            }
        }
        arr1 = arr2;
        for(int i = 0 ; i < arr1.length; i ++){
            System.out.print(arr1[i] + " ");
        }
    }
}
