package chapter14.com.study.Collection_.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
public class CollectionEx02 {
    public static void change(List list){
        for(int i = 0 ; i < list.size()-1;i++){
            for (int j = 0 ; j < list.size() -i -1 ; j++){
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if(book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦",23.5,"曹雪芹"));
        list.add(new Book("西游记",55,"吴承恩"));
        list.add(new Book("未知",24.6,"匿名"));
        change(list);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
class Book{
    private String name;
    private double price;
    private String author;


    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "书名 " + name + "\t\t\t作者 " + author + "\t\t\t价格 " + price;
    }
}
