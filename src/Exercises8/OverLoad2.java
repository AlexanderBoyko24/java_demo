package Exercises8;

/* Методы с разными сигнатурами не переопределяются,
а перегружаются. */

class A4{
    int i,j;

    A4(int a, int b){
        i=a;
        j=b;
    }

    // Отобразить переменные i и j
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

// Создание подкласса путем расширения класса А
class B4 extends A4{
    int k;

    B4(int a, int b, int c){
        super(a,b);
        k=c;
    }
    // Перегрузить метод show()
    void show(String msg){
        System.out.println(msg + k);
  /*Сиrнотуры донноrо метода и метода show () из кnоссо А class Overload {
отnичоются, поэтому вместо переопредеnения происходит
переrруэко метода*/
    }
}

 class OverLoad2 {
    public static void main (String [] args){
        B4 subob = new B4(1,2,3);

        subob.show("k: ");// вызывается метод show() из класса В
        subob.show();// вызывается метод show() из класса А
    }
}
