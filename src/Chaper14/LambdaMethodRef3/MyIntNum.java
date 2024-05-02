package Chaper14.LambdaMethodRef3;

// Данный класс хранит значение типа int и определяет метод
// isFactor(), который возвращает true, если его аргумент
// является делителем числа, хранящегося в классе
class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    // Вернуть true, если n - делитель v
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
