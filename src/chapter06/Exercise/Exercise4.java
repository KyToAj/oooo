package Exercise;

public class Exercise4 {
    public static void main(String[] args) {
        //输出小写的  a-z 和大写的 Z - A
        for(char a = 'a' ; a <= 'z' ; a ++){
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for(char z = 'Z' ; z >= 'A' ; z--){
            System.out.print(z + " ");
        }
    }
}
