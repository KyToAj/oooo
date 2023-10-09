package Chapter10.com.zsjxjv.HomeWork;

import javax.swing.*;

/**
 * @author aj
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {

    }
}
class A{
    private String name;
    public void show(){
        class B{
            private final     String name = "天";

            public String getName() {
                return name;
            }

        }
        System.out.println(new B().name + A.this.name);
    }
}
