package Exercises8;

// Переопределение метода
class A2 {
    int i, j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    // Отобразить переменные i и j
    void show() {
        System.out.println("i and j:" + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Отображение переменной k
    void show() { //Донный метод nepeonpeдenяeт метод show ( ) нз кnоссо А
        System.out.println("K: " + k);
    }
}


class Override {
    public static void main(String[] args) {
        B3 subob = new B3(1, 2, 3);
        subob.show();// вызвать метод show() из класса В
    }
}
