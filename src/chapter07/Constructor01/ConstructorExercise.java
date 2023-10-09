package Constructor01;

public class ConstructorExercise {
    public static void main(String[] args) {
        Person2 person = new Person2();
        System.out.println(person.age);
        Person2 person2 = new Person2("jack",15);
        System.out.println(person2.age + " " + person2.name);
    }
}

class Person2{
    String name;
    int age;
    public  Person2(){
        age = 18;
    }
    public Person2(String pName , int pAge){
        name = pName;
        age = pAge;
    }
}