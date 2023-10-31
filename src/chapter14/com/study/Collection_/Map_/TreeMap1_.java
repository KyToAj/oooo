package chapter14.com.study.Collection_.Map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author aj
 * @version 1.0
 */
public class TreeMap1_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return  ((String)o1).length() - ((String)o2).length();

            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("john","汤姆");
        treeMap.put("fuck","杰瑞");
        treeMap.put("alen","乔治");
        System.out.println(treeMap);
    }
}
