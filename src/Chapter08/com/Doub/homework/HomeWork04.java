package Chapter08.com.Doub.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        Big jack = new Big("Jack", 120, 15);
        System.out.println(jack.printSalary());
        Normal tom = new Normal("Tom", 100, 17.5);
        System.out.println(tom.printSalary());
    }
}
class employee{
    private String name;
    private double daySalary;
    private double day;

    public employee(String name, double daySalary, double day) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }
    public double printSalary(){
        return getDay() * getDaySalary();
    }
}
class Normal extends employee{

    public Normal(String name, double daySalary, double day) {
        super(name, daySalary, day);
    }
    private double grade = 1.0;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double printSalary() {
        return super.printSalary() * getGrade();
    }
}
class Big extends employee{

    public Big(String name, double daySalary, double day) {
        super(name, daySalary, day);
    }
    private double grade = 1.2;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double printSalary() {
        return super.printSalary() * getGrade() + 1000;
    }
}
