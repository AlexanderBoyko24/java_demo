package Exercises8;

// Использование ключевого слова super для предотвращения
// сокрытия имен
class A {
    int i;
}

//Создать подкласс, расширяющий класс А

class B extends A {
    int i;// эта переменная i скрывает переменную i из класса А

    B(int a, int b) {
        super.i = a;// переменная i из класса А
        i = b;// переменная i из класса В
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
