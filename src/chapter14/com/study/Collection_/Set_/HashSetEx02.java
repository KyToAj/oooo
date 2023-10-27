package chapter14.com.study.Collection_.Set_;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author aj
 * @version 1.0
 */
public class HashSetEx02 {
    /**
     *
     * @param args
     * 定义一个Employee 类 ，该类包含 成员属性 name,salary,birthday，
     * birthday为MyDate类型（自己创建）  要求：
     * 1. 创建三个Employee 放入 HashSet 中
     * 2. 当 name 和birthday 的值相同时，认为是相同员工，不能添加到HashSet 集合中
     */
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("aj",4800,new MyDate(2001,05,16)));
        hashSet.add(new Employee("aj",6400,new MyDate(2001,05,16)));
        hashSet.add(new Employee("aj1",6400,new MyDate(2000,05,16)));
        System.out.println(hashSet);
    }


}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate myDate)) return false;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
class Employee{
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}