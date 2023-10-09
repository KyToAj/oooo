package Return;

public class ReturnExercise {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            if( i == 3){
                System.out.println("i = " + i );
                continue;
            }
            System.out.println("Hello,World");
        }
        System.out.println("go on ...");
    }
}
