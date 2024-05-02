package Chaper14.SimpleLambda;

class LambdaDemo {
    public static void main(String[] args) {

        MyValue myVal; // объявление ссылки на интерфейс

        // Здесь лямбда-выражение - это просто константа.
// При его назначении переменной myVal создается
// экземпляр класса, в котором лямбда-выражение
// реализует метод getValue() интерфейса MyValue.
        myVal = () -> 98.6; //простое лямбда выражение

        // Вызвать метод getValue(), предоставляемый ранее
// назначенным лямбда-выражением.
        System.out.println("Constant value: " + myVal.getMyValue());

        // Создать параметризованное лямбда-выражение и назначить его
// ссылке на экземпляр MyParamValue. Это лямбда-выражение
// возвращает обратную величину своего аргумента.
        MyParamValue myPval = (n) -> 1.0/n; // лямбда-выражение, имеющее параметр

        // Вызвать метод getValue(v) посредством ссылки myPval.
        System.out.println("Reverse value 4 is equal to: " + myPval.getMyValue(4.0));
        System.out.println("Reverse value 8 is equal to: " + myPval.getMyValue(8.0));

        // лямбда-выражение должно быть совместимым с методом,
// который определяется функциональным интерфейсом. Поэтому
// приведенные ниже два фрагмента кода не будут работать.

// myVal = () -> "three"; // Ошибка! Тип String несовместим
// с типом douЬle!
// myPval = () -> Math.random(); // Ошибка! Требуется параметр!
    }
}
