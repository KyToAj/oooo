package Exercise;

public class WhileBreakExercise {
    public static void main(String[] args) {
        //判断 100000 元能经过多少次路口
        double money = 100000;
        int count = 0;
        while(true){
            if(money > 50000){
                money = money-(money * 1/20);
                System.out.println(money);
                count++;
            }
            else if(money <= 50000 && money >= 1000){
                money-=1000;
                System.out.println(money);
                count++;
            }
            else {
                System.out.println("可以经过" + count + "次路口");
                break;
            }
        }
    }
}
