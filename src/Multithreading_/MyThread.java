package Multithreading_;

/**
 * @author aj
 * @version 1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "   执行run方法");
        }

    }
}
