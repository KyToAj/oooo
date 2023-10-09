package Break;

public class BreakExercise1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100 ; i++){
            if(sum > 20){
                System.out.println(i-1);
                break;
            }
            else{
                sum = sum +i;
                System.out.println("i 是" + i);
            }
        }
    }
}
