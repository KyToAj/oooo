package com.studyJava.String_;

/**
 * @author aj
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        /*
        1. String 对象用于保存字符串，也就是一组字符序列
        2. 字符串的字符使用Unicode字符编码，不管汉字或字母都占两个字节
        3. String类有很多构造器，实现了构造器的重载
        4. String 类实现了接口 Serializable 【String 可以串行化：可以在网络中传输】
        5. String 类实现了接口 Comparable 【可以进行比较】
        6. String 是 final 类，不可以被继承。
        7. String 有属性 private final char value[ ] ； 用于存放字符串内容（value 一旦赋值后，（地址）便不可修改）
         */
//        String a = "abc";
//        String b = new String("abc");
//        System.xout.println(a.equals(b));
//        System.out.println(a == b);
//        System.out.println(a == b.intern());
//        System.out.println(b == b.intern());
        Person person1 = new Person();
        person1.name = "aj";
        Person person2 = new Person();
        person2.name = "aj";
        System.out.println(person1.name == person2.name);//t
        System.out.println(person1.name.equals(person2.name));//t
        System.out.println(person1.name == "aj");//t
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        String a = "hello";
        String b = "abc";
        String c = a + b ;
        System.out.println(s1 == s2);
    }
}
class Person{
    public String name;
}