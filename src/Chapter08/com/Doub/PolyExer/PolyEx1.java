package Chapter08.com.Doub.PolyExer;

public class PolyEx1 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); //40
        System.out.println(a.sum1());//30
        //当 B 类 没有 sum 方法时，会去调用A类的sum方法
        System.out.println(a.sum()); // 会去执行 A 类的sum方法，因为有动态绑定，所以A 类的sum方法 中 return 的getCount 方法会去调用 a 的运行类型，也就是B类，所以调用的geiCount方法是B类的getCount。

        //当 B 类 没有 sum1 方法时，会去调用A类的sum1方法
        System.out.println(a.sum1());// 会去执行 A 类的sum1方法,由于属性没有动态绑定机制，所以sum1 中 所调用的count属性就是A类自己的count属性。
    }
}
class A{
    int count = 10;
    public int sum(){
        return getCount() + 10;
    }
    public int sum1(){
        return count + 20;
    }

    public int getCount() {
        return count;
    }
}
class B extends A{
    int count = 20;

    @Override
    public int getCount() {
        return count;
    }
//    public int sum(){
//        return count + 20;
//    }
    public int sum1(){
        return count + 10;
    }
}