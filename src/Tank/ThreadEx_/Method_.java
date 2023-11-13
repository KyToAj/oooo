package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class Method_ {
    public static void main(String[] args) throws InterruptedException {
        Th th = new Th();
        th.setPriority(Thread.MIN_PRIORITY);// 设置线程优先级设为最低
        th.setName("重庆"); // 修改线程的名称
        th.start();//执行线程
        Thread.sleep(1000); // 设置线程休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Hi " + i );
        }
        th.setName("上海");
        System.out.println(th.getPriority()); // 获取线程的优先级
        th.interrupt();//强制跳出线程休眠

    }
}
class Th extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        int count = 0;
        while (loop){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
            try {
                Thread.sleep(200000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被INTERRUPTED 了");
            }
            System.out.println(Thread.currentThread().getName() + count ++);
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}