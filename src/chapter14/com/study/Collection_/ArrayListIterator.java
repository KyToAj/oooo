package chapter14.com.study.Collection_;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author aj
 * @version 1.0
 */
public class ArrayListIterator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("String");
//        list.add("Object");
//        list.add(true);
//        list.add('c');
//        ArrayList list2 = new ArrayList();
//        list.add("String");
//        list.add("Boolean");
//        list.add(false);
//        list.add('z');
//        Iterator iterator1 = list.iterator();
//        Iterator iterator2 = list2.iterator();
//        ArrayList arrayList = new ArrayList();
//        while (iterator1.hasNext()){
//            Object obj = iterator1.next();
//            if(!list2.contains(obj)){
//                arrayList.add(obj);
//            }
//        }
//        while (iterator2.hasNext()){
//            Object obj = iterator2.next();
//            arrayList.add(obj);
//        }
//        for (Object item : arrayList){
//            System.out.println(item);
//        }
        // 创建两个ArrayList并添加元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Fig");

        // 使用iterator()方法获取迭代器
        Iterator<String> iterator1 = list1.iterator();
        Iterator<String> iterator2 = list2.iterator();

        // 创建新ArrayList来保存组合后的元素
        List<String> combinedList = new ArrayList<>();

        // 遍历并组合两个ArrayList中的元素
        while (iterator1.hasNext()) {
            String item = iterator1.next();
            if (!list2.contains(item)) {
                combinedList.add(item); // 添加不在list2中的元素
            }
        }

        while (iterator2.hasNext()) {
            combinedList.add(iterator2.next()); // 添加list2中的元素
        }

        // 打印组合后的元素
        for (String combinedItem : combinedList) {
            System.out.println(combinedItem);
        }
    }
}
