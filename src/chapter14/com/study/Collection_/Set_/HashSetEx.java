package chapter14.com.study.Collection_.Set_;
import java.util.HashSet;
/**
 * @author aj
 * @version 1.0
 */
public class HashSetEx {
    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("aj",18));
        hashSet.add(new Employee("aj",18));
        System.out.println(hashSet);
    }
}
class  Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
