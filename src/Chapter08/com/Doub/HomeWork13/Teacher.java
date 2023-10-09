package Chapter08.com.Doub.HomeWork13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }


    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public String play(){
        return super.play() + "是 ikun";
    }
    public void teach(){
        System.out.println("teach");
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "work_age=" + work_age +
                '}';
    }
}
