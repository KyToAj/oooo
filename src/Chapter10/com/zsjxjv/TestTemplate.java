package Chapter10.com.zsjxjv;

public class TestTemplate {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.calculateTime();
    }
}

abstract class calculateTime{//
    abstract public void job();//定义一个抽象方法用来执行程序。
    public void calculateTime(){//定义一个计算方法用来计算程序执行所需的时间。
        long start = System.currentTimeMillis();//返回当前系统时间。（毫秒）
        job();
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间为： "+ (end - start));//得到程序运行时间。
    }
}
class Emp extends calculateTime{
    @Override
    public void job() {
        int num = 0 ;
        for (int i = 0; i < 458255522; i++) {
            num +=i;
        }
    }
}

