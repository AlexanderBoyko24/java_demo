package Lesson13;

public interface MyInterface {
    int myMethod1();

    default void myMethod2() {
        System.out.println("Default method");
    }

    default int myMethod4(int a, int b) {
        return a + b;
    }

    static void myMethod3() {
        System.out.println("Static method");
    }

    static void myMethod5(MyInterfaceImplementation a) {
       a.myMethod1();
    }
}
