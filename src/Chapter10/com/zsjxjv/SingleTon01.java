package Chapter10.com.zsjxjv;

public class SingleTon01 {

}
//饿汉式单例设计模式
class GirlFriend{
    private static final GirlFriend mary = new GirlFriend();
    private GirlFriend(){
//
    }
    public static GirlFriend getInstance(){
        return mary;
    }
}
