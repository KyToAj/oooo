package XunHuan;

public class ForTest2 {
    public static void main(String[] args) {
        int j = 0;
        int count = 0;
        for (int i = 1 ; i <= 100 ; i++ ){
            if(i % 9 == 0){
                System.out.println(i);
                j += i;

                count = count + 1;
            }
        }
        System.out.println("一共有" + count +"个 9 的倍数的整数");
        System.out.println("总和为"+ j);

        int v = 5;
        for( int a = 0;a<=v;a++){
            System.out.println(a +"+" + (v-a) + "=5"  );
        }
    }
}
