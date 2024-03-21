package Exercises5;

class MyClass2{
    int x;

    MyClass2(int i){
        x = i;
    }
}

public class ParmConsDemo {
    public static void main (String [] args){
        MyClass2 t1 = new MyClass2(10);
        MyClass2 t2 = new MyClass2(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
