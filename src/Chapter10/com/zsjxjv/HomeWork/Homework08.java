package Chapter10.com.zsjxjv.HomeWork;

import java.time.Year;

/**
 * @author aj
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        color.show();
        switch (color){
            case RED :
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
            break;
            case BLACK:
                System.out.println("黑色");
            break;
            case YELLOW:
                System.out.println("黄色");
            break;
            case GREEN:
                System.out.println("绿色");
            break;

        }
    }
}
interface Show{
    public void show();
}
enum Color implements Show{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int blueValue;
    private int greenValue;

    Color(int redValue, int blueValue, int greenValue) {
        this.redValue = redValue;
        this.blueValue = blueValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println("属性值： " + redValue + ", " + blueValue + "， " + greenValue + ";");
    }
}
