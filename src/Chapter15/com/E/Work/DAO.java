package Chapter15.com.E.Work;

import java.util.*;

/**
 * @author aj
 * @version 1.0
 */
@SuppressWarnings({"all"})
class DAO<T> {
    private Map<String, T> map = new HashMap<>();


    //保存T 类型的对象到Map成员变量中

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    //从map 中获取 id对应的对象
    public T get(String id) {
        return map.get(id);
    }

    //替换map 中 key 为 id 的内容，改为entity对象
    public void update(String id, T t) {
        map.put(id,t);
    }

    //返回map中存放 的 所有T 对象
    public List<T> list() {
        List<T> ts = new ArrayList<>();
        Set entryset = map.entrySet();
        Iterator iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry)next;
            ts.add((T)entry.getValue());
        }

        return ts;
    }

    //删除指定id对象
    public void delete(String id) {
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}
