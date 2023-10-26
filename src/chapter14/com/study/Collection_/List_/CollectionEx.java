package chapter14.com.study.Collection_.List_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author aj
 * @version 1.0
 */
public class CollectionEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("Mary",3));
        list.add(new Dog("Jack",12));

        Iterator it1 = list.iterator();
        while (it1.hasNext()){
            Object item = it1.next();
            System.out.println(item);
        }
        for (Object item : list){
            System.out.println(item);
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
