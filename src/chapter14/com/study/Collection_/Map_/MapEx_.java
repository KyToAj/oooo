package chapter14.com.study.Collection_.Map_;

import com.sun.jdi.Value;

import java.util.*;

/**
 * @author aj
 * @version 1.0
 */
public class MapEx_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(01,new Employee("阿伟",18900));
        map.put(02,new Employee("阿强",12000));
        map.put(03,new Employee("阿吉",3000));
        //1. 使用 entry
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry = iterator.next();
            Map.Entry entry1 = (Map.Entry) entry;
            Employee employee = (Employee) entry1.getValue();;
            if(employee.getSalary() > 18000){
                System.out.println("员工id= " + entry1.getKey() + "-" + entry1.getValue());
            }
        }
        //2. 使用 KeySet
        Set key = map.keySet();
        iterator =key.iterator();
        while (iterator.hasNext()) {
            Object keys = iterator.next();
            Employee employee = (Employee) map.get(keys);
            if(employee.getSalary() > 18000){
                System.out.println("员工id= " +keys + "-" + map.get(keys));
            }
        }
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return
                "姓名='" + name + '\'' +
                ", 工资=" + salary;
    }

}