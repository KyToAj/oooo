package this1;

public class this02 {
    public static void main(String[] args) {
        Doog doog = new Doog();

    }
}
//在一个构造器访问另外一个构造器
class  Doog{
    String name;
    int age;

    Doog(String name, int age){
        System.out.println("Dog(String name, int age)构造器" + name + "  " + age);
    }
    Doog(){
//this(参数列表)，此语句必须位于构造器的第一行;
        this("jack",18);
        System.out.println("Dog()构造器");

    }
}
