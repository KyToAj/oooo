package Chapter08.com.Doub.HomeWork13;

import javax.swing.text.Style;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    public String play(){
        return getName();
    }
    public void use(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher) {
            ((Teacher) p).teach();
        }
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age
                ;
    }
}
