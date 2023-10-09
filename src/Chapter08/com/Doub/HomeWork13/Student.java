package Chapter08.com.Doub.HomeWork13;

public class Student extends Person{

    private int stu_id;
    public Student(String name, String sex, int age, int stu_id) {
       super(name, sex, age);
        this.stu_id = stu_id;
    }


    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
    public String play(){
        return super.play() + "喜欢篮球";
    }
    public void study(){
        System.out.println("study");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "stu_id=" + stu_id +
                '}';
    }

}
