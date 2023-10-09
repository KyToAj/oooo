package Chapter10.com.zsjxjv.LocalInnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new AA() {
            @Override
            public void show() {
                System.out.println("匿名内部类可以当作实参直接传递，简介高效");
            }
        });
    }
    //静态方法，形参为接口类型
    public static void f1(AA aa){
        aa.show();
    }
}

interface AA{
    void show();
}
