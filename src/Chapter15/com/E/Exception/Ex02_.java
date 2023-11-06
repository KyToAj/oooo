package Chapter15.com.E.Exception;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author aj
 * @version 1.0
 */
public class Ex02_ {

@SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",6500,new MyDate(2001,06,21)));
        employees.add(new Employee("smith",17000,new MyDate(1982,04,28)));
        employees.add(new Employee("john",2800,new MyDate(1993,02,15)));

    System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());

            }
        });
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    System.out.println(employees);
    }

}

