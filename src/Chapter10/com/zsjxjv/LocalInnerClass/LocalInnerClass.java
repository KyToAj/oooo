package Chapter10.com.zsjxjv.LocalInnerClass;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {

    }
}
class Outer{//外部类
    private int n1 = 100;
    public void h1(){
        //局部内部类定义在外部类的局部位置
        final class Inner01{//局部内部类
            //可以访问外部类的所有成员(包含私有成员)
            private int n1 = 200;
            public void sou(){
                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果像访问外部类的成员，使用 外部类名.this.成员 去访问
                System.out.println(n1 + Outer.this.n1);
                //输出Outer 的hashcode
                //Outer.this 本质就是外部类的对象，即哪个对象调用了h1，Outer.this就是哪个对象
                System.out.println(Outer.this);
            }

        }
        Inner01 inner01 = new Inner01();
        inner01.sou();
    }
}
