package XunHuan;
import java.util.Scanner;

public class DowhileTest2 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                count += 1;
            }
            i++;
        } while (i <= 200);

        System.out.println(count);


//        int a = 0;
//        Scanner sca = new Scanner(System.in);
//
//        do{
//            System.out.println("还钱吗 y/n");
//            char b = sca.next().charAt(0);
//            if(b == 'y'){
//                System.out.println("还钱");
//                break;
//            }
//            else{
//                System.out.println("老韩使出了五连鞭");
//            }
//        }while(true);
        int a = 0;
        Scanner sca = new Scanner(System.in);

        char b = ' ';
        do {
            System.out.println("老韩使出了五连鞭");
            System.out.println("还钱吗 y/n");
            b = sca.next().charAt(0);
            System.out.println("他的回答：" + b);
        } while (b != 'y');
    }
}
