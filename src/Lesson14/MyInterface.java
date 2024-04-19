package Lesson14;

public interface MyInterface {
    int myMethod1();

    default void myMethod2() {
        System.out.println("it is a default method of interface");
    }

    default int myMethod4(int a, int b) {
        return a + b;
    }

    static void myMethod3() {
        System.out.println("It is a static method of interface");
    }

    static void myMethod5(MyInterfaceImplementation a) {
        a.myMethod1();

    }
}
