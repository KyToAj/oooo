package ClassLei;


class MyTools{
    public void two(int [][] shu){
        for(int i = 0 ; i < shu.length ; i ++){
            for(int j = 0 ; j < shu[i].length ; j ++){
                System.out.print(shu[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Person copyPerson(Person pe){
        Person pe2 = new Person();
        pe2.age = pe.age;
        pe2.name = pe.name;
        return pe2;
    }

}
class Person{
    public String name ;
    public int age ;

}
public class MethodExercise01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 10;
        p.name = "GEORGE";
        MyTools tools = new MyTools();
        //复制一份p2对象
        Person p2 = tools.copyPerson(p);
    }
}