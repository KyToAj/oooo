package chapter14.com.study.Collection_.Map_;

import java.util.Hashtable;

/**
 * @author aj
 * @version 1.0
 */
public class Hashtable_ {@SuppressWarnings({"all"})
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("jack",100);
//        hashtable.put("jak",null);
        hashtable.put("john",120);
        hashtable.put("mary",100);
        hashtable.put("mary",100);
        hashtable.put("masry",100);
        hashtable.put("mar1y",100);
        hashtable.put("ma4r1y",100);
        hashtable.put("mar11y",100);
        hashtable.put("ma3r1y",100);
        hashtable.put("mar32y",100);
//        hashtable.put(null,100);
        // 1. 底层有数组  Hashtable$Entry [] 初始化大小为11
        // 2. 临界值 threshold 8 = 11 * 0.75
        // 3. 扩容  按照自己的扩容机制进行扩容
    //          执行方法  addEntry(hash, key, value, index); 添加 K-V 封装到 Entry
    //          当 count >= throshold 时，按照 int newCapacity = (oldCapacity << 1) + 1; 的大小进行扩容。
    }
}
