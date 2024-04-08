package Lesson10;

public class E extends D {
    int k;

    E(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String note){
        super.show();
        System.out.println(" & k: "  + k);
        System.out.println("Hello!");
    }

    public static void main (String [] args){
        E e = new E(1,2,3);

        e.show();
        e.show("Hello");
    }
}
