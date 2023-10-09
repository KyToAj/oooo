package Chapter10.com.zsjxjv.LocalInnerClass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒狗起床");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课");
            }
        });
    }
}
interface Bell{
    void ring();
}

class Cellphone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
