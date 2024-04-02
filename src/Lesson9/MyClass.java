package Lesson9;

public class MyClass {
    int x;

    MyClass() {
        System.out.println("Insude of constructor Myclass()");
        x = 0;
    }

    MyClass(int i){
        System.out.println("inside of constructor MyClass(int i).)");
        x = i;
    }

    MyClass(double d){
        System.out.println("inside of constructor MyClass(double d).)");
        x = (int) d;
    }

    MyClass(int i, int j){
        System.out.println("inside of constructor MyClass(int i, int j).");
        x = i * j;
    }
}
