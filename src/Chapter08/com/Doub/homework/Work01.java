package Chapter08.com.Doub.homework;

public class Work01 {

    public static void main(String[] args) {
        Person per[] = new Person[3];
        Person t = null;
        per[0]= new Person("Jack", 18, "student");
        per[1]= new Person("Tom", 52, "teacher");
        per[2]= new Person("George", 28, "youtuber");

        for (int i = 0; i < per.length-1; i++) {
            for(int j = 0 ; j < per.length-i-1 ; j ++){
                if(per[i].getAge() < per[i+1].getAge()){
                    t = per[i+1];
                    per[i+1] = per[i];
                    per[i]= t ;

                }
            }
        }
        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i]);
        }

    }



}
class Person{
    private String name;
    private int age;
    private String job;


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}