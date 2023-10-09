package ClassLei;

import java.util.Scanner;

public class ZiFuDaYin {
    public static void main(String[] args) {
        Scanner sca1 = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        Scanner sca3 = new Scanner(System.in);
        System.out.println("请输入需要打印的 字符 行 列");
        char q = sca1.next().charAt(0);
        int e = sca2.nextInt();
        int w = sca3.nextInt();
        zifu z = new zifu();
        z.zi(q,e,w);
    }
}
class zifu{
    public void zi(char in,int a,int b){
        for(int i = 0 ; i < a; i ++){
            for(int j = 0 ; j < b ; j ++){
                System.out.print(in);
            }
            System.out.println(" ");
        }
    }
}
