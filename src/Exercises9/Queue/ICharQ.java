package Exercises9.Queue;
// Интерфейс для очереди символов
public interface ICharQ {
    // Поместить символ в очередь
    void put(char ch);

    // Извлечь символ из очереди
    char get();
}
//Эти методы должны быть определены в любом классе, реализующем интерфейс ICharQ.
