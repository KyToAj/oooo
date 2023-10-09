package Chapter08.com.Doub.polyarr;

public class PolyArray {
    public static void main(String[] args) {
        //现在有一个继承结构如下：要求创建一个Person对象，两个Student对象，两个Teacher对象，统一放在数组中，并调用每个对象的say方法
        //创建一个persons数组
        Person[] persons = new Person[5];
        //创建对象
        persons[0] = new Person("Tom",68);
        persons[1] = new Student("Jack",16,99);
        persons[2] =  new Student("George",17,78);
        persons[3] =  new Teacher("Dream",26,4500.0);
        persons[4] =  new Teacher("Ben",45,7700.0);

        for(int i = 0 ; i < persons.length ; i ++){
            //persons[i]  的编译类型都是person，运行类型会根据实际情况由 JVM 来判断
            System.out.println(persons[i].say());
            //判断 persons[i] 是否为 student 或 teacher 的子类
            // 如果是，就执行向下转型，输出两个类中的特有方法
             if(persons[i] instanceof Student){
                 Student stu = (Student) persons[i];
                 stu.study();
                 //也可以使用一条语句表示 ：     ((Student) persons[i]).study();
             }
             else if(persons[i] instanceof Teacher){
                 Teacher teach = (Teacher) persons[i];
                 System.out.println(teach.teach());
             }
             else {

             }
        }
    }
}
