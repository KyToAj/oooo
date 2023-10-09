package Chapter08.com.Doub.extend.exercise;


class Person{
    private String name;
    private int age;
    public String say() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
class Student extends Person{
    private int id;
    private double score;

    public Student(String name, int age, int id,double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

   public Student(){

   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "Person{" +
                super.say() +
                ", id='" + getId() + '\'' +
                ", score=" + getScore() +
                '}';
    }

}

public class OverrideExercise {
    public static void main(String[] args) {
        Person r = new Person("Jack",42);
        System.out.println(r.say());
        Student student = new Student("george",18,01,99.5);
        System.out.println(student.say());
    }
}
