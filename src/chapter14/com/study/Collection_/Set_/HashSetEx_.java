package chapter14.com.study.Collection_.Set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author aj
 * @version 1.0
 */
public class HashSetEx_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new car("ben",500000));
        linkedHashSet.add(new car("ben1",500000));
        linkedHashSet.add(new car("byd",120000));
        System.out.println(linkedHashSet);
    }

}
class car{
    private String name;
    private double price;

    public car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof car car)) return false;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
