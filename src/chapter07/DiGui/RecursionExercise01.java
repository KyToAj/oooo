package DiGui;

public class RecursionExercise01 {
    public static void main(String[] args) {
    recursion1 re = new recursion1();
        System.out.println(re.fei(8));
        System.out.println(re.tao(1));
    }
}
class recursion1{
    public int fei(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else {
            return fei(n-1)+fei(n-2);
        }
    }
    public int tao(int n){
        if(n == 10){
            return 1;
        }else if(n >=1 && n <=9) {
            return (tao(n+1) +1)*2;
        }else {
            return -1;
        }
    }
}
