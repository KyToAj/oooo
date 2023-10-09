package Chapter08.com.Doub.fengzhuang;

public class FengZhuangEx {

    private int age;
    public String name;
    private double salary;
    private String job;
    public FengZhuangEx() {

    }
    public FengZhuangEx(int age, double salary, String job) {
        this.setAge(age);
        this.setSalary(salary);
        this.setJob(job);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 120 && age > 0){
            this.age = age;
        }else{
            System.out.println("年龄需要120岁之内");
        }
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
