package Chapter10.com.zsjxjv.HomeWork;

/**
 * @author aj
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car1 = new Car(45.1);;
        Car car2 = new Car(-20);;
        Car car3 = new Car(25);;
    }
}
class Car{
    private double temperature;
    public class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("冷气");
            } else if (temperature< 0 ) {
                System.out.println("暖气");
            }
            else {
                System.out.println("关闭");
            }
        }


    }
    public Car(double temperature) {
        this.temperature = temperature;
        Air air = new Air();
        air.flow();
    }
}
