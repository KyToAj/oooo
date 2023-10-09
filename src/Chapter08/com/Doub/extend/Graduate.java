package Chapter08.com.Doub.extend;

public class Graduate {
    private String name;
    private int age;

    private double score;
//    public Graduate(){
//        System.out.println("父类");
//    }


    public Graduate(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("在考试");
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
