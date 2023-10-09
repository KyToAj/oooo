package Chapter08.com.Doub.Polymorphism;

public class PolyDetail02 {
    public static void main(String[] args) {
        BB bb = new BB();
        // 使用instanceof  操作符    判断  bb  是否为  BB 类型 或者 BB类型的子类
        //判断对象的运行类型是否为 BB 类型或BB类型的子类型
        System.out.println(bb instanceof BB);   //TRUE
        System.out.println(bb instanceof AA);   //true
       AA aa = new BB();
        System.out.println(aa instanceof BB);   //true
        System.out.println(aa instanceof AA);   //true

        Object obj = new Object();
        System.out.println(obj instanceof AA);  //false
    }
}
class AA{//父类

}
class BB extends AA{//子类

}
