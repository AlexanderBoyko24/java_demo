package HomeWork;

class Queue {
    char q[]; // массив для хранения элементов очереди
    int putloc, getloc; // индексы для вставки и извлечения элементов очереди


    Queue(int size) {
        q = new char[size + 1];  //выделить память для очереди
        putloc = getloc = 0;
    }

    //поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Queue if filled");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    //извлечь символ из очереди

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

class QDemo{
    public static void main (String [] args){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Use of queue bigQ for saving alphabet");
        for (i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.print("Content of queue bigQ: ");
        for (i=0; i<26; i++){
            ch= bigQ.get();
            if (ch!= (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using queue smallQ for mistakes generating");
        for (i=0; i <5; i++){
            System.out.print("Trying of saving "  + (char) ('z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        System.out.println("Content of smallQ: ");
        for (i=0; i<5; i++){
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}