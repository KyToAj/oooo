package com.studyJava.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author aj
 * @version 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("Java从入门到放弃",300);
//        Arrays.sort(books);
//        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double b3 = b2.getPrice() - b1.getPrice();
                if(b3 > 0){
                    return 1;
                }
                else if(b3 < 0) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
        //名称从短到长排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                int b1l = b1.getName().length();
                int b2l = b2.getName().length();
                return b1l - b2l;
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
