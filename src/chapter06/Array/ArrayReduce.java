package Array;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Scanner sca = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        do{

                int [] arr2 = new int[arr.length-1];
//                System.out.println("请输入您要删除第几个元素");
//                int yu = sca.nextInt();
                for(int i = 0 ; i < arr.length-1 ; i++){
//                    if(i == yu-1){
//
//                    }
//                    else{
                        arr2[i] = arr[i];
//                    }

                }
                arr = arr2;

            for(int i = 0 ; i < arr.length  ; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("请确定是否继续缩减 y/n");
            char result = sca.next().charAt(0);
            if(arr.length <= 1){
                System.out.println("当前只剩下最后一个元素，不能再缩减");
                break;
            }
            if(result == 'n'){
                break;
            }
        }while(true);
    }
}
