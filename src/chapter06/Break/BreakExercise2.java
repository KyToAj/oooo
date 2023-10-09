package Break;

import java.util.Scanner;
public class BreakExercise2 {
    public static void main(String[] args) {
        Scanner sca1 = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);
        String name = "";
        String pass = "";
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("请输入您的姓名");
            name = sca1.next();
            System.out.println("请输入您的密码");
             pass = sca2.next();
             //字符串内容比较使用  equals 方法
            if("顶针".equals(name) && "123".equals(pass)){   // 推荐写法
/*         不推荐写法
            if(name.equals("顶针") && pass.equals("123")){
  */
                System.out.println("登录成功");
                break;
            }
            else {
                System.out.println("您还有" + (3-i) + "次登录机会");
            }
        }
    }
}
