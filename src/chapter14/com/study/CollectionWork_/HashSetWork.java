package chapter14.com.study.CollectionWork_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author aj
 * @version 1.0
 */
public class HashSetWork {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person_ aj = new Person_(18, "aj");
        Person_ john = new Person_(1, "john");
        hashSet.add(aj);
        hashSet.add(john);
        aj.name = "aj1";
        hashSet.remove(aj);
        System.out.println(hashSet);
        hashSet.add(new Person_(18,"aj1"));
        System.out.println(hashSet);
        hashSet.add(new Person_(18,"aj"));
        System.out.println(hashSet);
        
    }
}
class Person_{
    int id;
    String name;

    public Person_(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person_{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person_ person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
