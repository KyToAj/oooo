package Chapter10.com.zsjxjv.HomeWork;

/**
 * @author aj
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    abstract public void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}