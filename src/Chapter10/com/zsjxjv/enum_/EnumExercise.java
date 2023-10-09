package Chapter10.com.zsjxjv.enum_;

/**
 * @author aj
 * @version 1.0
 */
public class EnumExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        Week week[] = Week.values();
        System.out.println("所有星期的信息如下");
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }
        for(Week num : week){
            System.out.println(num);

        }
    }
}
enum Week{
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周天");

    private String week;

    Week(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return
                week;
    }
}
