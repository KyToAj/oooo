package Chapter08.com.Doub.duandian;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        int arr[] = {1,-2,45,-16,76};
        // 使用断点查看 arrays.sort 方法底层实现
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+ (i+1) + "] = " + arr[i]);
        }
    }
}
