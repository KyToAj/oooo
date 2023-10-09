package chapter07.ClassLei;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        AA aa = new AA();
        Scanner sca = new Scanner(System.in);
        System.out.println("输入一个数，判断是奇是偶");
        int in = sca.nextInt();
        if(aa.xxx(in)){
            System.out.println("奇");
        }else {
            System.out.println("偶");
        }
    }



}
 class AA{
    public boolean xxx(int ret){
//            if  (ret % 2 !=0 ) {
//                return false;
//            }
//            else {
//                return true;
//            }
        return ret % 2 != 0 ? true :false;
    }
}