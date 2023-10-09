package DuoChongXunHuan;

public class LinXing {
    public static void main(String[] args) {
        int total = 10;
        for(int i = 1; i <= total ; i ++){
            for(int a = 1 ; a <= total - i ; a++){
                System.out.print(" ");
            }
            for(int j = 1; j<= 2*i-1 ; j++){
                if(j == 1 || j  == 2*i-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(' ');
                }

            }

            System.out.println(" ");
        }
        for(int b = total ; b >= 1 ; b--){
            for(int a = 1 ; a <= total - b ; a++){
                System.out.print(" ");
            }
            for(int v = 2*b-1; v>= 1 ; v--){
                if(v == 1 || v  == 2*b-1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(' ');
                }

            }
            System.out.println(" ");
        }
    }
}
