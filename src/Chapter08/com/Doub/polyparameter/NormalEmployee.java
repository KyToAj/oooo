package Chapter08.com.Doub.polyparameter;

public class NormalEmployee extends Employee{

    public NormalEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("work");

    }
    public double getAnnual(){
        return super.getAnnual();
    }
}