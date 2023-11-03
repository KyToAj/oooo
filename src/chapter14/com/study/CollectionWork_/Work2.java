package chapter14.com.study.CollectionWork_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author aj
 * @version 1.0
 */
public class Work2 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 420000);
        Car car2 = new Car("雷克萨斯", 650000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(new Car("奔驰",780000));
        System.out.println(arrayList);
        arrayList.remove(car1);
        System.out.println(arrayList);
        arrayList.contains(car2);
        System.out.println(arrayList);
        int size = arrayList.size();
        System.out.println(size);
        System.out.println(arrayList.isEmpty());
        ArrayList arrayList1 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add("");
        }
        Collections.copy(arrayList1,arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        System.out.println(arrayList.containsAll(arrayList1));
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        for(Object arr : arrayList1){
            System.out.println(arr);
        }
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
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
}
