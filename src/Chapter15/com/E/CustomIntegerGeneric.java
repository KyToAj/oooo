package Chapter15.com.E;

/**
 * @author aj
 * @version 1.0
 */
public class CustomIntegerGeneric {
}
interface IUsb<U,R>{
    //接口中 静态成员也不能使用泛型
//    U name = " ";

    //普通方法中可以使用泛型
    R get(U u);
    void hi(R r);
    //在jdk8 中，可以在接口中使用默认方法，可以使用泛型
    default R method(U u ){
        return null;
    }
}
// 在继承接口  指定泛型接口的类型
interface IA extends IUsb<String,Double>{

}
class Phone implements IUsb<String,String>{

    @Override
    public String get(String s) {
        return null;
    }

    @Override
    public void hi(String s) {

    }
}
