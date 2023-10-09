package Chapter10.com.zsjxjv.HomeWork;

/**
 * @author aj
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock(Frock.getNextNum());
        Frock frock2 = new Frock(Frock.getNextNum());
        Frock frock3 = new Frock(Frock.getNextNum());
        System.out.println(frock1.getSerialNum());
        System.out.println(frock2.getSerialNum());
        System.out.println(frock3.getSerialNum());
    }
}

class Frock{
    private static int currentNum = 100000;
    private int serialNum;

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public Frock(int serialNum) {
        this.serialNum = serialNum;
    }

    public static int  getNextNum(){
        currentNum+=100;
        return currentNum;
    }
}

