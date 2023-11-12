package Chapter15.com.E;

/**
 * @author aj
 * @version 1.0
 */
public class GenericClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly( "fly", 100);//调用方法时，传入参数，编译器就会确定传入类型
        King<String, Integer> stringIntegerKing = new King<>();
        stringIntegerKing.run("king",100.2);
    }
}
//普通类：
class Car{
    //普通方法
    public void run(){

    }
    //泛型方法
    /*
    1. <T,R> 就是泛型
    2. 是给 fly() 用的
     */
    public <T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
//泛型类
class  King<T,R>{
    //普通方法
    public void one(){

    }
    //泛型方法
    public <U,M> void two(U u , M m){

    }
    //1. 不是泛型方法
    //2. hi 方法使用了 类声明的 泛型
    public void hi(T t){

    }
    //泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    public<A> void run(T t,A a){
        System.out.println(a.getClass());
        System.out.println(t.getClass());
    }
        }
