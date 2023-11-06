package Chapter15.com.E.Exception;

import java.util.*;

/**
 * @author aj
 * @version 1.0
 */
public class Ex01_ {
    public static void main(String[] args) {

        //2. HashMap 泛型
        HashMap<String, Student> map = new HashMap<>();
        map.put("a",new Student("a",18));
        map.put("b",new Student("b",12));
        map.put("c",new Student("c",13));
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + " " + next.getValue());
        }
        //2. HashSet 泛型
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("a",18));
        students.add(new Student("b",18));
        students.add(new Student("c",18));
        for (Student student :students) {
            System.out.println(student.name + " " + student.age);
        }


    }

}

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
