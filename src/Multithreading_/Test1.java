package Multithreading_;

/**
 * @author aj
 * @version 1.0
 */
public class Test1 {

//执行main方法后会交替执行 t1 和 t2
    public static void main(String[] args) {
        /**
         * 多线程的第一种启动方式
         * 1. 定义一个类实现Thread
         * 2. 重写run方法
         * 3. 创建子类的对象，并启动线程
         */
        MyThread t1 = new MyThread();
        t1.setName("T1");
        //开启线程
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("T2");
        //开启线程
        t2.start();


    }
}
