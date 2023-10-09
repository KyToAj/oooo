package Chapter08.com.Doub.homework;

public class HomeWork02 {
    private String name;
    private double salary;
    private String post;
    private int age;
    public String introduce(){
        return "name = " + name + "; salary = " + salary + "; post = " + post + "; age = " + age;
    }

    public HomeWork02(String name, double salary, String post, int age) {
        this.name = name;
        this.salary = salary;
        this.post = post;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        HomeWork02 pro = new Professor("Jack",78000,"教授",65);
        System.out.println(pro.introduce());
        HomeWork02 Fu = new FuProfessor("George",69000,"副教授",54);
        System.out.println(Fu.introduce());
        HomeWork02 Tea = new Teacher("Tom",12000,"老师",32);
        System.out.println(Tea.introduce());
    }
}
class Professor extends HomeWork02{

    public Professor(String name, double salary, String post, int age) {
        super(name, salary, post, age);
    }
    private double salaryGrade = 1.3;



    public double getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(double salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public String introduce(){
        return super.introduce() + "; getSalaryGrade = "+getSalaryGrade();
    }
}
class Teacher extends HomeWork02{

    public Teacher(String name, double salary, String post, int age) {
        super(name, salary, post, age);
    }
    private double salaryGrade = 1.1;



    public double getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(double salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public String introduce(){
        return super.introduce() + "; getSalaryGrade = "+getSalaryGrade();
    }
}
class FuProfessor extends HomeWork02{

    public FuProfessor(String name, double salary, String post, int age) {
        super(name, salary, post, age);
    }
    private double salaryGrade = 1.2;



    public double getSalaryGrade() {
        return salaryGrade;
    }

    public void setSalaryGrade(double salaryGrade) {
        this.salaryGrade = salaryGrade;
    }

    public String introduce(){
        return super.introduce() + "; getSalaryGrade = "+getSalaryGrade();
    }
}