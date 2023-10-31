package chapter14.com.study.Collection_.Map_;

import java.util.*;

/**
 * @author aj
 * @version 1.0
 */
public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("张三","李四");
        map.put("王五","张三");
        map.put("王麻子","张三");
        map.put("李子","四六");
        map.put("五二","三七");
        //1. 取出所有的Key , 通过 Key 取出所有的Value
        Set keyset = map.keySet();
        // (1) 增强for循环
        System.out.println("=====================================");
        for(Object obj : keyset) {
            System.out.println(obj + "-" + map.get(obj));
        }
        // (2) 迭代器
        System.out.println("=====================================");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj + "-" + map.get(obj));
        }
        //2. 取出所有的Value
        Collection values = map.values();
        //(1) 增强for循环
        System.out.println("=====================================");
        for(Object obj : values) {
            System.out.println(obj);
        }
        // (2) 迭代器
        System.out.println("=====================================");
        iterator = values.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //3. 通过entrySet
        Set entryset = map.entrySet();
        //(1) 增强for循环
        System.out.println("=====================================");
        for(Object entry : entryset) {
            //将entry 对象转为 Map.Entry
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey() + "-" + entry1.getValue());
        }
        // (2) 迭代器
        System.out.println("=====================================");
        iterator = entryset.iterator();
        while (iterator.hasNext()){  // itit 快速生成迭代器
            Object entry = iterator.next();
//            Map.Entry entry1 = (Map.Entry) entry;
//            System.out.println(entry1.getKey() + "-" + entry1.getValue());
            System.out.println(((Map.Entry) entry).getKey() + "-" + ((Map.Entry) entry).getValue());
        }
    }
}
