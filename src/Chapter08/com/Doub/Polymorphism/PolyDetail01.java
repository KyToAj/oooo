package Chapter08.com.Doub.Polymorphism;

public class PolyDetail01 {
    public static void main(String[] args) {
        //属性的值看编译类型 !!!!
        Base base = new Sun();
        System.out.println(base.count);
    }
}
class Base{
    int count = 10;
}
class Sun extends Base{
    int count = 20;
}
