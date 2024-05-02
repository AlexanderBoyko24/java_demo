package Chapter13.Queue;

import Exercises10.HW9.QueueEmptyException;
import Exercises10.HW9.QueueFullException;

// Обобщенный интерфейс очереди
public interface IGenQ<T> {

    // Поместить элемент в очередь
    void put(T ch) throws QueueFullException;

    // Извлечь элемент из очереди
    T get() throws QueueEmptyException;
}
