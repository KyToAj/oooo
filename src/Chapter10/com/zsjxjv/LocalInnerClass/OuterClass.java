package Chapter10.com.zsjxjv.LocalInnerClass;

public class OuterClass {
    private int outerField = 100;

    public void someMethod() {
        final int localVar = 10; // 局部变量必须是 final 或事实上为 final

        class LocalInnerClass {
            private int innerField = 20;

            public void display() {
                System.out.println("Local variable: " + localVar);
                System.out.println("Outer field: " + outerField);
                System.out.println("Inner field: " + innerField);
            }
        }

        // 创建局部内部类的实例并调用方法
        LocalInnerClass inner = new LocalInnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        new OuterClass().someMethod();
    }
}
