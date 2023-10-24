package chapter14.com.study.Collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
public class ArrayListEx {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i*2);
        }
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
//        list.add("Hello");
        list.add(2,"hsp");
        System.out.println(list.get(5));
        list.remove(6);
        list.set(7,"aj");
        Iterator iterator = list.iterator();
        System.out.println(list.size());
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
