package Tank.ThreadEx_;

/**
 * @author aj
 * @version 1.0
 */
public class Thread_ {
    public static void main(String[] args) {
        //创建一个对象，该对象可以当作一个线程
        cat cat = new cat("1");
        cat.start();//启动线程 -> 最终会执行cat 的run 方法
        //cat.run(); //如果直接调用方法， 不会开启子线程，而是在主线程执行，会导致主线程阻塞
        //当 main 线程启动了一个子线程 Thread-0 ，主线程不会继续阻塞，会继续执行
        //这时  主线程和子线程 交替执行
        cat cat2 = new cat("2");
        cat2.start();
        cat cat3 = new cat("3");
        cat3.start();
    }
}
class cat extends Thread{
    private String Catname;


    public cat(String name) {
        this.Catname = name;
    }

    public String getCatName() {
        return Catname;
    }

    @Override
    public void run() {
        int time = 0;
        while (true){
            //每休眠一秒输出内容
            try {
                Thread.sleep(1000);
                System.out.println(getCatName() + ": 休眠一秒再次执行" + Thread.currentThread().getName());
                if(time++ > 80 ){
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
