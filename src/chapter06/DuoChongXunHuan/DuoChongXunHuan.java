package DuoChongXunHuan;
import java.util.Scanner;
public class DuoChongXunHuan {
    public static void main(String[] args) {
        //统计3个班的成绩状况，每个班有五个同学，求出哥哥班的平i均分和所有班级的平均分
        Scanner sca = new Scanner(System.in);
        int a = 0;
        int avg = 0;
        int count = 0;
        for (int i = 1; i<= 3; i++){
            for(int j = 1;j<=5;j++){
                System.out.println("请输入第"+i+"班的第"+j+"位同学的成绩");
                a = sca.nextInt();
                avg = avg + a;
            }
            System.out.println("第" + i+ "班的同学的平均成绩为："+ avg/5);
            count +=avg;
            avg = 0;
        }
        System.out.println("所有班级的平均分为："+ count/15);
    }
}
