package Exercises8;
// Демонстрация очередности вызова конструкторов.
// Создать суперкласс

class A1{
    A1(){
        System.out.println("Constructor A1");
    }
}
// Создать подкласс путем расширения класса А
class B1 extends A1 {

    B1(){
        System.out.println("Constructor B1");
    }
}

// Создать подкласс путем расширения класса В1
class C1 extends B1{
    C1(){
        System.out.println("Constructor C1");
    }
}

public class OrderOfConstriction {
    public static void main (String [] args){
        C1 c = new C1();
    }
}
//конструкторы вызываются в порядке наследования классов.