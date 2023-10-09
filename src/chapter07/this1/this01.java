package this1;

public class this01 {
    public static void main(String[] args) {
        Dog bo = new Dog("aaa" , 2);
        bo.ama();
    }
}
class  Dog{
     String name;
     int age;
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void ama(){
        System.out.println(name + " " + age);
    }
}