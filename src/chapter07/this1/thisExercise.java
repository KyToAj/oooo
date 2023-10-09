package this1;

public class thisExercise {
    public static void main(String[] args) {
        Person person = new Person("aaa",18);
        Person p2 = new Person("aaa",18);
        System.out.println(person.compareTo(p2));
    }
}
class Person{
    String name;
    int age ;
    public Person(String name,int age){
       this.name = name;
       this.age = age;
    }

    public boolean compareTo(Person p){
//       if(this.name.equals(p.name) && this.age == p.age){
//            return true;
//       }
//       else {
//           return false;
//       }
        return this.name.equals(p.name) && this.age == p.age ? true : false;
    }
}
