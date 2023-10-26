package chapter14.com.study.Collection_.Set_;

import java.util.HashSet;

/**
 * @author aj
 * @version 1.0
 */
public class HashSet_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("java");
        set.add("html");
        set.add("java");
        System.out.println("set = " + set);

        /*
        HashSet  源码解读
        1.  执行 public HashSet() {
                    map = new HashMap<>();
                }   构造器
        2.  执行 add();
            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
                 // PRESENT     private static final Object PRESENT = new Object();
                 // 不管map执行多少次，key都是变化的，（value 始终都是PRESENT）PRESENT 是共享的
            }
        3.  执行 put();   该方法会执行  hash(key)  方法，会得到 key 对应的 hash值 （不完全 = hashCode） 算法：(h = key.hashCode()) ^ (h >>> 16)
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }


        4.  执行  putVal();

         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;  // 定义了辅助变量
        // table 就是 HashMap 的一个数组，类型是 Node[]

        //如果当前table 是 null  或 大小 = 0
        //就是第一次扩容到 16 个空间。
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
            //(1)根据 key 得到的hash值 去计算 key 应该存放到 table 表的哪一个索引位置
            //并把这个位置的对象 赋给 p
            //(2)判断 p 是否为 null
            //  1) 如果 p 为 null 表示 还没有存放元素 , 就创建一个 Node(key = "java",value = PRESENT)
                   tab[i] = newNode(hash, key, value, null);
            //  2) 如果 p 不为 null
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
        //  开发技巧: 在需要局部变量(辅助变量) 时，再创建
            Node<K,V> e; K k;
            // 如果当前索引位置对应的链表的第一个元素 和 准备添加的key的hash值一样
            if (p.hash == hash &&
            // 并且满足 以下两个条件之一
            // (1) 准备加入的 key 和 p 指向的 Node 节点的 key 是同一个对象
            // (2) p指向的Node 节点的key的 equals() 和 准备加入的 key 比较后相同
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
                //
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
            //如果talbe 对应索引位置，已经是一个链表，就是用for循环比较
            //      (1) 一次和该链表的每一个元素比较后，都不相同，则加入到该链表的最后
                        注意在把元素添加到链表后，立即判断 该链表是否已经到达八个节点
                            如果到了 则调用 treeifyBin() 对当前这个链表进行数化 (红黑树)
                            注意： 在转成红黑树时， 还进行一个判断
                                if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                                    resize();
                                  如果 数组的大小没超过 64 位 ，则先扩容，只有当大小 大于 64 才会进行树化
                    (2) 一次和该链表的每一个元素比较过程中，如果有相同情况，就直接break
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
         */
    }

}
