package Lesson10;

public class Demo {
    public static void main(String[] args) {
        B subObject = new B(1, 2);
        subObject.showDetails();
        System.out.println("Order of consructors: ");
        C c = new C();


        X x = new X(10);
        X x2;

        Y y = new Y(5, 1);
        Y y2;

        x2 = x;
        x2 = y;
    }
}
