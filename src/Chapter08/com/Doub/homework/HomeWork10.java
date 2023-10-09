package Chapter08.com.Doub.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        Person_ p = new Student();
        p.run();
        p.eat();
        Student stu = (Student) p;
        stu.run();
        stu.study();
    }
}
class Person_{
    public void run(){
        System.out.println("run");
    }
    public void eat(){
        System.out.println("eat");
    }

}
class Student extends Person_{
    public void run(){
        System.out.println("who is running");
    }
    public void study(){
        System.out.println("studying");
    }
}

