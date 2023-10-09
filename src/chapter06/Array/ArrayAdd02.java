package Array;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        Scanner sca = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        char result;
        do {
            int[] arrNew = new int[arr.length + 1];
            System.out.println("请输入你要添加的元素");
            int re = sca.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arrNew.length - 1] = re;
            //让arr 指向 arrNew
            arr = arrNew;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("请问你还要继续添加吗 y/n");
            result = sca2.next().charAt(0);
            if(result == 'n'){
                break;
            }
        } while (true);

    }
}
