package Exercise;

public class Exercise3 {
    public static void main(String[] args) {
        //输出 1 - 100 之间不能被 5 整除的数， 每 5 个一行
        int count = 0;
        for (int i = 1 ; i <= 100 ;  i++) {
            if( i %5 != 0){
                count ++;
                if(count %5 == 0 ){
                    System.out.println(" ");
                }
                System.out.print(i+" ");
            }

        }
    }
}
