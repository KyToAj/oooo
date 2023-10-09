package Switch;
import java.util.Scanner;
public class SwitchExercise2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入您的成绩");
        double score = sca.nextInt();
        switch ((int)score/60){
            case 1 :
                System.out.println("成绩合格");
                break;
            default:
                System.out.println("成绩不合格");

        }
    }
}
