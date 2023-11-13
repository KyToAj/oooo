package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class Thread03_ {
    public static void main(String[] args) {
        T3 t1 = new T3();
        Thread thread1 = new Thread(t1);
        T2 t2 = new T2();
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }

}
class T3 implements Runnable{
    @Override
    public void run() {
        int time = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello,World! " + time++);
            if(time >= 10){
                break;
            }
        }
    }
}class T2 implements Runnable{
    @Override
    public void run() {
        int time = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi! " + time++);
            if(time >= 5){
                break;
            }
        }
    }
}