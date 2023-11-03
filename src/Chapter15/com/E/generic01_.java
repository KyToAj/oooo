package Chapter15.com.E;

import java.util.ArrayList;

/**
 * @author aj
 * @version 1.0
 */
public class generic01_ {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("aj",18));
        dogs.add(new Dog("john",8));
        dogs.add(new Dog("aj1",13));
//        dogs.add(new cat("aj1",13));
        for (Dog o1 : dogs) {
//            Dog o1 = (Dog) o;
            System.out.println(o1.getName() + "  " + o1.getAge());
        }


    }
}
class Dog{
    private String name;
    public int age;

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

    public void setAge(int age) {
        this.age = age;
    }
}class cat{
    private String name;
    public int age;

    public cat(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }
}