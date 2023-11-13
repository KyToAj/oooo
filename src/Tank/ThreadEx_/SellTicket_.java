package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class SellTicket_ {
    public static void main(String[] args) {
        Sell sell1 = new Sell();
        Sell sell2 = new Sell();
        Sell sell3 = new Sell();
        //会出现超卖现象
        sell1.start();
        sell2.start();
        sell3.start();

    }
}
class  Sell extends Thread{
    private static int index = 100;
    public static void m1(){
        synchronized (Sell.class){

        }
    }

    public /*synchronized */void sell(){// 同步方法，在同一时刻，只能由一个线程去执行 sell方法
         /*
    同步代码块：
    锁在 this 对象

      */
        synchronized (this){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "卖出了 一张票 " + " 剩余票数为: " + index--);
        }
        }

    @Override
    //public synchronized void run() { // 同步方法，在同一时刻，只能由一个线程去执行 run方法


    public  void run() {
        while (true){
            sell();
            if (index <= 0){
                System.out.println("票已售罄");
                break;
            }
         }

        }
    }





class Sell2 implements Runnable{
    private static int index = 100;
    @Override
    public synchronized void run() {
        while (true){
            if (index <= 0){
                System.out.println("票已售罄");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "卖出了 一张票 " + " 剩余票数为: " + index--);
        }
    }
}