package Search;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String arr[] = {"白","金","紫","青"};
        System.out.println("请输入名称");
        String re = sca.next();
        int t = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            if(re.equals(arr[i])){
                System.out.println("找到了 " + i);
                t++;
            }
        }
        if(t == 0){
            System.out.println("没找到");
        }
    }
}
