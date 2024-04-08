package Lesson10;

public class B extends A {
    int i;

    B() {
        System.out.println("Construcor B class");
    }

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void showDetails() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in class: " + i);
    }
}
