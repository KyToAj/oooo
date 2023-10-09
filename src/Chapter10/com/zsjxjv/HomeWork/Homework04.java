package Chapter10.com.zsjxjv.HomeWork;

/**
 * @author aj
 * @version 1.0
 *  1- 计算器接口具有work方法，功能是计算，有一个手机类Cellphone，
 *  定义方法testWork 测试计算功能，调用计算接口的work方法，
 *  2- 要求调用Cellphone 对象的testWork方法，使用 匿名内部类
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },15,52);
    }
}
interface computer{
    public double work(double n1 , double n2);
}
class Cellphone{

    public void testWork(computer com,double n1 ,double n2){
        double result =com.work(n1,n2);
        System.out.println("计算结果： " + result);
    }

}
