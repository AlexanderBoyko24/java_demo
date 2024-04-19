package Lesson14;

public class Demo {
    public static void main (String [] args){
        MyInterfaceImplementation obj = new MyInterfaceImplementation();
        obj.myMethod1();
        obj.myMethod2();
        obj.myMethod4(7,5);
        MyInterface.myMethod3();//статический метод вызывается без объекта
        MyInterface.myMethod5(obj); //статический метод вызывается без объекта
    }
}
