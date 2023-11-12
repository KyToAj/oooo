package Chapter15.com.E;

import com.studyJava.exception.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author aj
 * @version 1.0
 */
public class GenericExtends {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();
        /*
        // print Collection1 可以接收所有类型，所以都 ok
        printCollection1(list1);//OK
        printCollection1(list2);//OK
        printCollection1(list3);//OK
        printCollection1(list4);//OK
        printCollection1(list5);//OK

        //print Collection2 可以接收AA 或 AA子类 所以 list1 list2 不行
        printCollection2(list1);//false
        printCollection2(list2);//false
        printCollection2(list3);//OK
        printCollection2(list4);//OK
        printCollection2(list5);//OK

        //print Collection3 可以接收AA 或 AA的父类 所以 list2,4,5 不行
        printCollection3(list1);//OK
        printCollection3(list2);//false
        printCollection3(list3);//OK
        printCollection3(list4);//false
        printCollection3(list5);//false
        */
    }
    //  List<?> 接收任意泛型类型
    public static void printCollection1(List<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }
    // <? extends AA>  表示上限，可以接收AA 或 AA子类
        public static void printCollection2(List<? extends AA> c) {
            for (Object o : c) {
                System.out.println(o);
            }
        }
        //  <? super AA>  支持AA 类 以及AA 的父类，不限于直接父类
            public static void printCollection3(List<? super AA> c){
                for (Object o :c) {
                    System.out.println(o);
                }

            }
}




class AA{

}
class BB extends AA{

}
class CC extends BB{

}
