package Array;

public class Array01 {
    public static void main(String[] args) {
        //创建一个数组，用于存储母鸡的数据
        double[] hens = {3,5,1,3.4,2,50};
        double totalWeight = 0;
//通过for循环对数组进行遍历
        for(int i = 0 ; i < 6  ; i ++ ){
            System.out.println("第" + (i+1) + "个元素的值" + hens[i] );
            totalWeight += hens[i];
        }
        System.out.println(totalWeight/6);

    }
}
