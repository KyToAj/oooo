package chapter14.com.study.Collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @author aj
 * @version 1.0
 */
public class SetMethod_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Set set = new HashSet();
        //添加顺序和输出顺序是无序的，但取出顺序为固定的
        set.add("John");
        set.add("Jonas");
        set.add("Tom");
        set.add("Jack");
        set.add(null);//不允许重复数据
        set.add(null);
        System.out.println("result : " + set.add(123));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object s = iterator.next();
            System.out.println(s);
        }
    }
}
