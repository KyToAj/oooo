package Array;

public class ArrayReverse2 {
    public static void main(String[] args) {
        int arr1[] = {11,22,33,44,55,66};
        int arr2[] = new int[arr1.length];
        for (int i = 0 ; i < arr1.length ; i++){
            arr2[arr1.length-1-i] = arr1[i];
        }
        for (int i = 0 ; i < arr1.length ; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
