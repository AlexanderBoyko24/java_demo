package Lesson8;

public class OverloadDemo {
    public static void main(String[] args) {
        OverloadDemo myObj = new OverloadDemo();
        myObj.printHello("Mary");
    }

    void printHello() {
        System.out.println("Hello!");
    }

    void printHello(String name) {
        System.out.println("Hello " + name + " !");
    }

    void printHello(int day) {
        System.out.println("Hello " + day + " !");
    }

    void printHello(int day, String name) {
        System.out.println("Hello " + day + " !");
    }
}
