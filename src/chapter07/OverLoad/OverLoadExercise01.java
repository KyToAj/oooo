package OverLoad;

public class OverLoadExercise01 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.m(2));
        System.out.println(methods.m(2,3));
        System.out.println(methods.m('d'));


    }
}
class Methods{
    public int m(int i){
        return i*i;
    }
    public int m(int i,int j){
        return i*j;
    }
    public char m(char i){
        return i;
    }
    public int max(int i , int j ){
        if(i>j){
            return i;
        }
        else {
            return j;
        }
    }
    public double max(double i , double j ){
        if(i>j){
            return i;
        }
        else {
            return j;
        }
    }
    public double max(double i , double j,double m ) {
       double max1 = i > j ? i : j ;
        return max1 > m ? max1 : m ;
    }

}