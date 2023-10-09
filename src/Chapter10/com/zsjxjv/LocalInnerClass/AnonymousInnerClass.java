package Chapter10.com.zsjxjv.LocalInnerClass;

public class AnonymousInnerClass {
        public static void main(String[] args) {
            MyInterface anonymousInnerClass = new MyInterface() {
                @Override
                public void doSomething() {
                    System.out.println("匿名内部类实现的方法");
                }
            };
         new  Animal(){
                @Override
                void fk() {
                    System.out.println("繁衍");
                }
            }.fk();
//            animal.fk();
            anonymousInnerClass.doSomething();
        }

}
 interface MyInterface {
    void doSomething();
}
abstract class Animal{
    abstract void fk();
}
