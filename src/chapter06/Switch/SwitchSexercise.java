package Switch;

import java.util.Scanner;
public class SwitchSexercise {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个字符(a~e)");
        char a = sca.next().charAt(0);
        switch(a){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }
    }
}
