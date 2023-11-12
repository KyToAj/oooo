package Tank.Ex;

/**
 * @author aj
 * @version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前cpu数量
        int num = runtime.availableProcessors();
        System.out.println(num);
    }
}
