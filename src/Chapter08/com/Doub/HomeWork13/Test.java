package Chapter08.com.Doub.HomeWork13;

public class Test {
    public static void main(String[] args) {
//        Student jack = new Student("Jack", false, 18, 19030029);
//        Teacher george = new Teacher("George", true, 35, 2011421314);
//        System.out.println("学生信息");
//        System.out.println(jack.toString());
//        jack.study();
//        jack.play();
//        System.out.println("---------------------------------------------------");
//        System.out.println("老师信息");
//        System.out.println(george.toString());
//        george.teach();
//        george.play();

        Person p[] = new Person[4];
        p[0] = new Student("Jack", "男", 18, 19030029);
        p[1] = new Student("Tom", "女", 17, 200300147);
        p[2] = new Teacher("George", "女", 35, 2011421314);
        p[3] = new Teacher("John", "女", 48, 200142141);
        for(int i = 0 ; i < p.length ; i ++){
            if(p[i] instanceof Student){
                System.out.println("学生信息");
                System.out.println(p[i].toString());
                p[i].use(p[i]);
                System.out.println(p[i].play());
                System.out.println("-----------------------------------------------");
            } else if (p[i] instanceof Teacher) {
                System.out.println("教师信息");
                System.out.println(p[i].toString());
                p[i].use(p[i]);
                System.out.println(p[i].play());
                System.out.println("-----------------------------------------------");
            }
        }
    }
}
