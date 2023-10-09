package Chapter08.com.Doub.Polymorphism;

public class PolyExercise {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
      //  boolean boo = (boolean) in;
        Object obj = " ss";          //向上转型
        String st = (String) obj;    //向下转型
       // Object objPoly = new Integer(5);       向上转型
       // String str = (String) objPoly;         不可以，指向Integer 的父类引用，转成String
       // Integer str1 = (Integer) objPoly;      可以，向下转型
    }
}
