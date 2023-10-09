package TwoDimensionalArray;

public class ArrayExercise2 {
    public static void main(String[] args) {
                int arr[] = new int[10];
        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = (int)(Math.random()*100)+1;
        }
        int t = 0;
        int avg = 0 ;
        for(int i = 0 ; i < arr.length -1; i++){
            for(int j = 0 ; j < arr.length -1-i;j++){
                if(arr[j] < arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }


            }
        }
        int max = arr[0] , index = -1;
        for(int i = 0 ; i < arr.length ; i++){
            avg+=arr[i];
            if(max < arr[i]){
                index = i;
                max = arr[i+1];
            }
            else{
                index = 0;
            }
            if(arr[i] == 8){
                System.out.println("数组里边有8，他的下标为" + i);
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println("平均值为：" + (avg/arr.length) +"\t" + "最大值为：" + max +"\t" +  "它的下标为：" + index);
    }
}
