package Chapter10.com.zsjxjv;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(Child.getName());
    }
}
class Child{
    private static String name = "aji";
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Child.name = name;
    }
}
