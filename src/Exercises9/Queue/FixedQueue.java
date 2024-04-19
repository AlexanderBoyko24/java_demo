package Exercises9.Queue;
// Класс, реализующий очередь фиксированного размера
// для хранения символов

class FixedQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc;// индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
//Эта реализация интерфейса ICharQ выполнена на основе уже знакомого вам
//класса Queue, разработанного в главе 5.