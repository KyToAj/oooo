package Chapter15.com.E;

/**
 * @author aj
 * @version 1.0
 */
public class Generic02_ {
    public static void main(String[] args) {
        //在创建类对象时传入属性类型
        Person<String> 朱音 = new Person<>("朱音");
        System.out.println(朱音.getKey());
    }
}
class Person<E>{
    //这个成员变量的数据类型为 E, E 的类型由外部传入
    E key;
    // 泛型构造方法形参 key 的类型也为 E, E 的类型由外部传入
    public Person(E key) {
        this.key = key;
    }
    // 泛型方法 getKey 的返回值类型为 E, E 的类型由外部指定
    public E getKey(){
        return key;
    }
}
