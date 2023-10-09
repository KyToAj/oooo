package Array;

public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] a = {4,-1,9,10,23};
        int b = 0 , c = 0;
        for(int i = 0 ; i < a.length ; i++){
            if( b <a[i] ){
                b = a[i];
                c = i;
            }
        }
        System.out.println(c);
    }
}
