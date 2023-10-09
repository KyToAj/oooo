package Constructor01;

public class Constructor01 {
    public static void main(String[] args) {
        Person person = new Person("阿吉",22,174.5);
        System.out.println(person.age + person.name + person.high);
    }
}
//在创建人类对象时，就直接指定这个对象的年龄和姓名
class Person{
    int age;
    String name;
    double high;
    //第一个构造器
    public Person(String pName , int pAge , double pHigh){
        System.out.println("构造器，完成对象的初始化");
        name = pName;
        age = pAge;
        high = pHigh;
    }
    //第二个构造器
    public Person(String pName , int pAge){
        System.out.println("构造器被调用，完成对象的初始化");
        name = pName;
        age = pAge;
    }
}
//如果没有定义构造器，系统会自动生成一个默认无参构造器（默认构造器）
class  Dog{
    String name;
    int age;

    //定义一个构造器
    Dog( String dName , int dAge){
        name = dName;
        age = dAge;
    }
    //定义一个无参构造器
    Dog(){

    }
}