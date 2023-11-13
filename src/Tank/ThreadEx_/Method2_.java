package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class Method2_ extends Thread {
    public int count = 0;
    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("被终止了");
            }
            System.out.println("Hi " + count++ );

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Th2 th2 = new Th2();
        th2.start();
        int count = 0 ;
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("Hi" + count++);
            if (i == 5){
                System.out.println("FFFFFFFFFFFFFF");
                th2.join(); // 让子线程先执行完在执行主线程
            }
        }



    }
}
class Th2 extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        int count = 0;
        while (loop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("被插队了");
            }
            System.out.println("Hello " + count++);
            if(count > 20){
                break;
            }
        }
    }
}
