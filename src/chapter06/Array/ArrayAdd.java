package Array;

public class ArrayAdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arrNew[] = new int[arr.length+1];
        for(int i = 0 ; i < arr.length ; i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length-1] = 4;
        //让arr 指向 arrNew
        arr = arrNew;
        for(int i = 0 ; i < arrNew.length ; i++){
            System.out.print(arrNew[i] + " ");
        }
    }
}
