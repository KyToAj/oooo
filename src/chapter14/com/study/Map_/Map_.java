package chapter14.com.study.Map_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        /*
        Map 接口的实现子类是双列集合 ， 存放的是 K-V
         */
        List list = new ArrayList();
        list.add("aj");
        list.add(true);
        list.add(123);
        list.add('1');
        System.out.println(list);
        System.out.println("================================");
        list.remove(0);
        System.out.println(list);
        System.out.println("================================");
        list.remove(true);
        System.out.println(list);
        System.out.println("================================");
        System.out.println(list.contains("aj"));
        System.out.println(list.contains(123));
        System.out.println(list.size());
    }
}
