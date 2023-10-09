package Array;

public class ArrayExercise1 {
    public static void main(String[] args) {
        char arr[];
        arr = new char[26];
        int j = 0;
        for(char i = 'A'; i < 'Z' ; i ++) {
            arr[j] = i;
            j++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
