package Chapter13.Raw;
// Демонстрация использования базового типа

public class Gen<T> {
    T ob; // объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т
    Gen (T o){
        ob=o;
    }

    // Вернуть объект оЬ
    T getob(){
        return ob;
    }
}