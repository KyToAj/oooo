package chapter14.com.study.Collection_.Map_;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * @author aj
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
       // Map接口实现类的特点：
          //  1.  Map与Collection并列存在。用于保存具有映射关系的数据： Key-Value （双列元素）。
          //  2.  Map 中的 Key 和 Value 可以是任意引用类型的数据， 会封装到H爱上Map&Node 对象中。
          //  3.  Map 中的 Key 不允许重复，原因和HashSet 一样。
          //  4.  Map 中的 Value 可以重复。
          //  5.  Map 中的 Key 可以为null, Value 也可以为 null , 但 Key 作为null 只能有一个，Value 可以有多个
          //  6.  常用 String 作为 Map 的 Key
          //  7.  Key 和 Value 之间存在单项一对一关系 , 通过指定的 Key 总能找到对应的 Value
        Map map = new HashMap();
        map.put("张三","李四");
        map.put("王五","张三");
        map.put("王麻子","张三");// Value 可以重复。
        map.put("张三","aj"); // 当有相同 的 key值，就等价于替换。
        map.put(null,null);
        map.put(null,"what"); // Key 只能放一个 null
        map.put("no1",null);
        map.put("no2",null);
        System.out.println("通过get方法传入 Key 会返回对应的 Value --> " + map.get("张三"));
        System.out.println("map = " + map);
        //  8.  Map存放数据的 Key-Value 示意图，一堆 k-v 是放在一个 HashMap$Node 中的

    }
}

