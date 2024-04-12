package HomeWork;


// Усовершенствованный класс очереди, предназначенной
// для хранения символьных значений

class QueueHW {
                         // Эти члены класса теперь являются закрытыми
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и
                                // извлечения элементов очереди

    QueueHW(int size) {
        q = new char[size + 1]; // выделить память для очереди
        putloc = getloc = 0;
            }

    // Поместить символ в очередь
    void put(char ch){
        if (putloc==q.length-1){
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    //извлечь символ из очереди
    char get() {
        if (getloc==putloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}