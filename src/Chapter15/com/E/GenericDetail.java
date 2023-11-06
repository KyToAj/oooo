package Chapter15.com.E;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
            List<A> list1 = new ArrayList<>();//OK
            list1.add(new B());//可以传入该类型或者其子类类型
        // 因为 E 指定了 A 类型,构造器传入了 new A()
        Animal<A> aAnimal = new Animal<>(new A());
        // 因为 B 为 A 的子类,所以也可以传入
        Animal<A> bAnimal = new Animal<>(new B());
//        ArrayList<String> strings = new ArrayList<String>();//
    }
}
class  A {

}
class  B extends A{

}
class Animal<E> {
    E key;

    public Animal(E key) {
        this.key = key;
    }
}