package chapter14.com.study.Collection_.Set_;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author aj
 *
 * @version 1.0
 */
public class LinkedHashSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Employee("aj",1231,new MyDate(2001,05,16)));
        set.add(123);
        set.add("AJ");
        Iterator i = set.iterator();
        while (i.hasNext()){
            Object re = i.next();
            System.out.println("Set = " + re);
        }
//        System.out.println("set = " + set);
        /*
         1.  LinkedHashSet 加入顺序和取出元素/数据的顺序一致
         2.  LinkedHashSet 底层维护是一个LinkedHashMap(是 HashMap 的子类)
         3.  LinkedHashSet 底层结构（数组 table + 双向链表）
         4.  添加第一次时，直接将 数组table 扩容到 16 , 存放的节点类型时LinkedHashMap$Entry
         5.  数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry 类型

         */
    }
}
