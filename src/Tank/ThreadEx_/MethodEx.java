package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class MethodEx {
    public static void main(String[] args) throws InterruptedException {
        Me me = new Me();
        Thread thread = new Thread(me);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("Hi " + i);
            if(i == 5){
                System.out.println("先执行子线程");
                thread.start();
                thread.join();
            }
        }
    }
}
class Me implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello " + i);
        }

        }


}
