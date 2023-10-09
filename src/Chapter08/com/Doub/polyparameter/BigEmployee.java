package Chapter08.com.Doub.polyparameter;

public class BigEmployee extends Employee{

public BigEmployee(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
        }

private double bonus;

public double getBonus() {
        return bonus;
        }

public void setBonus(double bonus) {
        this.bonus = bonus;
        }

public void manage(){
        System.out.println("manage");
        }
public double getAnnual(){
        return super.getAnnual() + getBonus();
        }

        }