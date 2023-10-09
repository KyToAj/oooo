package Chapter08.com.Doub.homework;

import java.util.Objects;


class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class LabeledPoint extends Point{
    private String biaoqian;

    public String getBiaoqian() {
        return biaoqian;
    }

    public void setBiaoqian(String biaoqian) {
        this.biaoqian = biaoqian;
    }

    public LabeledPoint(double x, double y, String biaoqian) {
        super(x, y);
        this.biaoqian = biaoqian;
    }

    public LabeledPoint(double x, double y) {
        super(x, y);
    }
}

class Doctor{
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        return age == doctor.age && Double.compare(doctor.salary, salary) == 0 && Objects.equals(name, doctor.name) && Objects.equals(job, doctor.job) && Objects.equals(gender, doctor.gender);
    }

}
public class HomeWork09 {
    public static void main(String[] args) {
        Doctor doctor01 = new Doctor("Jack", 25, "doctor", "man", 48000.0);
        Doctor doctor02 = new Doctor("Jack", 25, "doctor", "man", 47000.0);
        System.out.println(doctor02.equals(doctor01));
    }
}