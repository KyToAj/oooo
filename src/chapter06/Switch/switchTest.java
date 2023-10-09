package Switch;

import java.util.Scanner;
public class switchTest {
    public static void main(String[] args) {
        /*
        编写一个程序，该程序可以接受一个字符，比如：a,b,c,d,e,f,...
        a 表示星期1  ， b表示星期2
        根据用户的输入显示相应的信息，要求使用switch语句完成。
         */
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char a = sca.next().charAt(0);
        //if(s)
        switch(a){
            case 'a':
                System.out.println("今天是周一");
                break;
            case 'b':
                System.out.println("今天是周二");
                break;
            case 'c':
                System.out.println("今天是周三");
                break;
            case 'd':
                System.out.println("今天是周四");
                break;
            case 'e':
                System.out.println("今天是周五");
                break;
            case 'f':
                System.out.println("今天是周六");
                break;
            case 'g':
                System.out.println("今天是周日");
                break;
            default:
                System.out.println("您输入的字符都不匹配");
        }
    }
}
