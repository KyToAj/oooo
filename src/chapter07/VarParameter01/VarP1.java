package chapter07.VarParameter01;

public class VarP1 {
    public static void main(String[] args) {
        method me = new method();
        System.out.println(me.n(1,2,3,4,5,6,7,8,9,10));
        System.out.println(me.showScore("阿吉" , 99,88,66,87,55));
    }
}
class method{
    public int n(int ... num){
        //使用可变参数时可以当作数组进行输出
        int a = 0;
        for(int i = 0 ; i < num.length ; i ++){
            a +=num[i];
        }
        return a;
    }
    public String showScore(String name,double...score){
        int sum = 0 ;
        for(int i = 0 ; i < score.length ; i ++){
            sum += score[i];
        }
        return  "姓名：" + name + " ,总成绩为： " + sum;
    }
}
