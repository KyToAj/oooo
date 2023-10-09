package Chapter10.com.zsjxjv.HomeWork;

/**
 * @author aj
 * @version 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person aj = new Person("aj", new Horse());
        aj.passNormal();
        aj.passRiver();
    }
}
interface Vehicles{
    public void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("Horse");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("Boat");
    }
}

class factory{
    private static Horse h = new Horse();

    private  factory() {
    }

    public static Horse getHorse(){

        return h;
    }
    public static Boat getBoats(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        Vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return Vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        Vehicles = vehicles;
    }
    public void passRiver(){
        if(!(Vehicles instanceof Boat)){
                Vehicles = factory.getBoats();
        }
        Vehicles.work();
    }
    public void passNormal(){
        //判断当前vehicles属性是否为空，如果为空，就自动获取一匹马
        if(!(Vehicles instanceof Horse)){
            Vehicles = factory.getHorse();
        }
        Vehicles.work();
    }
}