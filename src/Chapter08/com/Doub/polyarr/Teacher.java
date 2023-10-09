package Chapter08.com.Doub.polyarr;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+ "\t工资为:\t" + salary;
    }
    public String teach(){
        return "teacher " + getName() + " is teaching now";
    }
}
