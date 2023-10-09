package chapter06.DuoChongXunHuan;

public class JinZiTa {
    public static void main(String[] args) {
        int total = 10;
        for(int i = 1; i <= total; i ++ ){
            for(int a = 1; a <= total-i; a++){
                System.out.print(' ');
            }

                for (int j = 1; j <= 2*i-1 ; j++) {
                    if(j == 1 || j == 2*i-1 || i == total){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

            }
            System.out.println(' ');
        }
    }
}
