package chapter14.com.study.Map_;

import Chapter08.com.Doub.duandian.Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author aj
 * @version 1.0
 */
@SuppressWarnings("all")
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
//        System.out.println(list);
//        System.out.println("================================");
//        list.remove(0);
//        System.out.println(list);
//        System.out.println("================================");
//        list.remove(true);
//        System.out.println(list);
//        System.out.println("================================");
//        System.out.println(list.contains("aj"));
//        System.out.println(list.contains(123));
//        System.out.println(list.size());
        // iterator 用法
        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Object ne = iterator.next();
//            if(ne == "aj"){
//                iterator.remove();
//            }
//        }
//        for (Object item : list){
//            System.out.println(item);
//        }
        // iterator 输出不同类型
        while (iterator.hasNext()){
            Object item = iterator.next();
            if(item instanceof String){
                System.out.println("String : " + item);
            } else if (item instanceof Boolean) {
                System.out.println("Boolean : " + item);
            } else if (item instanceof Character) {
                System.out.println("Charactor : " + item);
            } else if (item instanceof Number){
                System.out.println("Number : " + item);
            }
        }
    }
}
