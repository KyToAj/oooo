package Chapter08.com.Doub.Polymorphism;

public class PolymorphismEx {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.say();
        Animal dog = new Dog();
        dog.say();
        Animal animal = new Animal();
        animal.say();
        animal = new Dog();
        animal.say();
    }
}
class Animal{
    public void say(){
        System.out.println("动物");
    }
}
class Dog extends Animal{
    @Override
    public void say(){
        System.out.println("dog");
    }
}
class Cat extends Animal{
    @Override
    public void say(){
        System.out.println("cat");
    }
}
