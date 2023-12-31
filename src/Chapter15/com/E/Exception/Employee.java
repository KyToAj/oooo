package Chapter15.com.E.Exception;

/**
 * @author aj
 * @version 1.0
 */
public class Employee {
        private String name;
        private double salary;
        private MyDate birthday;

        @Override
        public String toString() {
            return "\nEmployee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", birthday=" + birthday +
                    '}';
        }

        public MyDate getBirthday() {
            return birthday;
        }

        public void setBirthday(MyDate birthday) {
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

        public Employee(String name, double salary, MyDate birthday) {
            this.name = name;
            this.salary = salary;
            this.birthday = birthday;
        }


}
