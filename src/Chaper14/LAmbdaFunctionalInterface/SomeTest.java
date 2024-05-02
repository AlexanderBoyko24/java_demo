package Chaper14.LAmbdaFunctionalInterface;

// Обобщенный функциональный интерфейс с двумя параметрами,
// который возвращает результат типа boolean
 interface SomeTest<T> {
     boolean test(T n, T m);
}
