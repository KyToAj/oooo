package chapter07.第七章作业;

import java.util.Random;
import java.util.Scanner;


//              01
class  A01{
    public double max(double[] Array){
        double t = Array[0] ;
        for(int i = 0 ; i < Array.length ; i++){
            if(Array[i] > t){
                t = Array[i];
            }
        }
        return t;
    }
}
//              02
class A02{
    public int find(String [] Arr,String m){
        int j = -1;
        for(int i = 0 ; i < Arr.length ; i ++){
            if(Arr[i].equals(m)){
                j = i ;
            }
        }
        return j;
    }
}
//              03
class Book{
    String book;
    double price;
    public void updatePrice(){
        if(this.price > 150){
            this.price = 150;
        }
        else if(this.price > 100 && this.price < 150 ){
            this.price = 100;
        }
    }
}
//              04
class A03{
    public int[] copyArr(int [] arr){
        int[] copy = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            copy[i] = arr[i];
        }
        return copy;

    }
}
//              05
//class Circle{
//    double half;
//    public Circle(double half){
//        this.half = half;
//    }
//    public double zhouchang(){
//        double zhou = 0;
//        zhou = half * 2 * Math.PI;
//        return zhou;
//    }
//    public double area(){
//        double are = 0 ;
//        are = half * half ;
//        return are;
//    }
//}
//              06
class Cale{
        double i;
        double j ;
        public Cale(double i , double J){
            this.i = i ;
            this.j = j ;
        }
        public double sum(){
            return i + j;
        }
        public double cheng(){
            return  i * j ;
        }
        public Double shang(){
            if(i == 0 || j == 0){
                System.out.println("除数为零");
                return null;
            }else{
                return i/j;
            }

        }
        public double jian(){
            return i - j ;
        }
}

//              07
class Dog{
    String name;
    int age;
    String color;
    public Dog(String name , int age , String color){
        this.name = name ;
        this.age = age;
        this.color = color;
    }
    public void show(){
        System.out.println("name = " + name + "; age = " + age + "; color = " + color);
    }
}//             09
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("正在播放 ：" + name + ";  时长为： " + times);
        }
        public void getInfo(){

        }
    }
//              11
class aaaa{
    public double method(double i , double j){
        return i;
    }
}

//              12
class Employee{
    String name ;
    int sex;
    int age;
    String job;
    double money;

    public Employee(String job, double money) {
        this.job = job;
        this.money = money;
    }

    public Employee(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //复用构造器
    public Employee(String name, int sex, int age, String job, double money) {
       this(name,sex,age);
        this.job = job;
        this.money = money;
    }


}
//              13
class Circle{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }
    public double findArea(double radius){
        return Math.PI * radius * radius;
    }

}

class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("Radius\t\t\tArea");
        for(int i = 1 ; i <= times ; i++){
            System.out.print((double)i + "\t\t\t\t");
            System.out.println(c.findArea(i));
        }
    }
}

//              14拓展
class Fist{
    int a ;
    int hand;

    public Fist(int hand) {
        this.hand = hand;
    }
    public Fist(){

    }
    public void change(){
        Random r = new Random();
        this.a = r.nextInt(3);
    }
    public String result(int hand){

        if(hand == 0 && a == 1){
            return "Win";
        }
        else if(hand == 1 && a == 2){
            return "Win";
        }
        else if(hand == 2 && a == 0){
            return "Win";
        }
        else if(hand ==  a ){
            return "平局";
        }
        else {
            return "Lose";
        }
    }

}
class show{
    public void show(Fist f,int n){
        Scanner sca = new Scanner(System.in);

        int win = 0;
        int lose = 0;
        for(int i = 0 ; i < n ; i++){
            System.out.println("请输入你要出的拳");
            int hand = sca.nextInt();
            f.change();
            System.out.println("电脑选择： " + f.a);
            if(hand < 0 || hand > 3 ){
                System.out.println("请输入正确的数");

            }
            else {
                if("Win".equals(f.result(hand))){
                    win++;
                }
                else if("Lose".equals(f.result(hand))){
                    lose++;
                }
                System.out.println(f.result(hand));
            }

        }
        System.out.println("Tom win :" + win + "次，Tom lose " + lose + "次");

    }
}
public class Work01 {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        PassObject p = new PassObject();
//        p.printAreas(c,8);
        Fist f = new Fist();
        show sh = new show();
        sh.show(f,5);
    }
}