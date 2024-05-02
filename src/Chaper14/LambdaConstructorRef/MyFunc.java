package Chaper14.LambdaConstructorRef;

// Демонстрация использования ссылок на конструкторы.

// MyFunc - функциональный интерфейс, метод которого
// возвращает ссылку на MyClass
public interface MyFunc {
    MyClass func(String s);
}
