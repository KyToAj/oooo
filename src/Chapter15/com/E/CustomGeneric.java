package Chapter15.com.E;

/**
 * @author aj
 * @version 1.0
 */
public class CustomGeneric {
}
/*
1. 把Tiger 成为自定义泛型类
2. T,R,M 泛型的标识符，一般是单个的大写字母
3. 泛型标识符可以有多个.
4. 普通成员可以使用泛型（属性，方法）.
5. 使用泛型的数组  不能初始化.
6. 静态方法中不能使用类的泛型
 */
class Tiger<T,R,M>{
    String name;
    T t; // 属性使用泛型
    R r;
    M m;
    // 因为数组在 new 不能确定 T 的类型，无法再内存中开辟空间
//     T ts[] = new T[8];   // 类型形参 'T' 不能直接实例化

    // 静态是和类相关，在类加载时，对象还未创建
    // 如果在静态方法或静态属性中 使用了泛型，JVM就无法完成初始化
//    public static void mm(M m1){}  //无法从 static 上下文引用 'Chapter15.com.E.Tiger.this'

    public Tiger(String name, T t, R r, M m) { //方法使用泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }
}
