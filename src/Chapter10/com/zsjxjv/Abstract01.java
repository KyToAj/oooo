package Chapter10.com.zsjxjv;

public class Abstract01 {
    public static void main(String[] args) {
        CommonEmployee 陈辉 = new CommonEmployee("陈辉", 15, 5800.0);
        Manager 阿吉 = new Manager("阿吉", 1, 3000.0, 15000.0);
        陈辉.work();
        阿吉.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private  double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void work();

}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工" + getName() + "工作中");
    }
}