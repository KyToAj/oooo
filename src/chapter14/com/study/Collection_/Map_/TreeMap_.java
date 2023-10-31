package chapter14.com.study.Collection_.Map_;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author aj
 * @version 1.0
 */
public class TreeMap_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

//        TreeSet set = new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                //调用String 的 compareTo 方法进行字符串比较
//                //从上到下
////                return ((String)o1).compareTo((String) o2);
//                //从下到上
//                return ((String)o2).compareTo((String) o1);
//            }
//        });
//        set.add("jack");
//        set.add("boom");
//        set.add("dave");
//        set.add("alun");
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }
        TreeMap map = new TreeMap(
//                new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return  ((String) o1).length() - ((String) o2).length();
//
//            }
//        }
        );
        map.put("jack","杰克");
        map.put("john","汤姆");
        map.put("fuck","杰瑞");
        map.put("alen","乔治");
        System.out.println(map);
    }
}
