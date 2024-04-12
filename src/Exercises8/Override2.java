package Exercises8;


// Переопределение метода
class A3 {
    int i, j;

    A3(int a, int b) {
        i = a;
        j = b;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i and j:" + i + " " + j);
    }
}

class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k
    void show() {
        super.show();//использовать super для вызова метода show, определенной в суперклассе А3
        System.out.println("K: " + k);
    }
}


class Override2 {
    public static void main(String[] args) {
        B3 subob = new B3(1, 2, 3);
        subob.show();
    }
}
