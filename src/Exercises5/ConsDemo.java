package Exercises5;




class MyClass {
    int x;

    MyClass() { // весь блок - конструктор
        x = 10;
    }
}

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}

//t1 - объект класса
 // t1.x - экземпляр