package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 * 通过实现接口Runnable 开发线程
 */
public class Runnable_ {
    public static void main(String[] args) {
        //创建一个 run1对象（实现了 Runnable 接口）
        Run run1 = new Run();
        // run1.start(); //无法调用start方法
        //创建一个 Thread对象，把run1 对象放入 Thread
        //对象代理，让Thread 类 去调用start方法 （动态绑定到run1 的run() 方法）
        Thread thread = new Thread(run1);
        thread.start();
    }
}
//通过Runnable接口开发线程
class Run  implements Runnable {
    @Override
    public void run() {
        int time = 0;
        while (true){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hi " + time++);
            if(time >= 10){
                break;
            }
        }

    }
}