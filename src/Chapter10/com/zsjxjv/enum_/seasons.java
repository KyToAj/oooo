package Chapter10.com.zsjxjv.enum_;

/**
 * @author aj
 * @version 1.0
 */
public class seasons {
    public static void main(String[] args) {
        Seasons_ winter = Seasons_.WINTER;
        System.out.println(NormalSeasons.SPRING);
    }
}
enum Seasons_{
    SPRING("SPRING","NORMAL"),
    SUMMER("SUMMER","NORMAL"),
    AUTUMN("AUTUMN","NORMAL"),
    WINTER("WINTER","NORMAL");
    private String name ;
    private String desc;
    //  在内部直接创建固定的对象


    //  私有化防止创建对象
    private Seasons_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "NormalSeasons{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

//自定义枚举类
class NormalSeasons{
    private String name ;
    private String desc;
//  在内部直接创建固定的对象
    public final static NormalSeasons SPRING = new NormalSeasons("SPRING","NORMAL");
    public final static NormalSeasons SUMMER = new NormalSeasons("SUMMER","NORMAL");
    public final static NormalSeasons AUTUMN = new NormalSeasons("AUTUMN","NORMAL");
    public final static NormalSeasons WINTER = new NormalSeasons("WINTER","NORMAL");


//  私有化防止创建对象
    private NormalSeasons(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "NormalSeasons{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}