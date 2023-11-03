package chapter14.com.study.CollectionWork_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author aj
 * @version 1.0
 */
public class Work3 {@SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        //
        hashMap.put("jack",2600);
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            hashMap.put(((Map.Entry)next).getKey(),(int)(((Map.Entry)next).getValue()) + 100);
        }
        iterator = entrySet.iterator();
    while (iterator.hasNext()) {
        Object next = iterator.next();
        System.out.println(((Map.Entry)next).getKey());
    }

      Set keySet = hashMap.keySet();
        for(Object key : keySet){
            System.out.println(hashMap.get(key));
        }
    }
}
