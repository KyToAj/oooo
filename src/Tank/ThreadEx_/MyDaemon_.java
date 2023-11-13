package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class MyDaemon_ {
    public static void main(String[] args) throws InterruptedException {
        daemon daemon = new daemon();
        daemon.setDaemon(true); // 设置为守护线程，当主线程结束时，子线程自动结束（不管是否还在工作）
        daemon.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("工作");
            Thread.sleep(100);
        }
    }
}
class  daemon extends Thread{
    @Override
    public void run() {
        int count = 0;
        for(;;){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(count ++ );
        }
    }
}
