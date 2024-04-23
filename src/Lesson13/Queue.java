package Lesson13;

public class Queue {
    private char[] q;
    private int putloc, getloc;


    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    Queue(Queue obj) {
        putloc = obj.putloc;
        getloc = obj.getloc;
        q = new char[obj.q.length];

        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = obj.q[i];
        }
    }

    Queue(char[] a) {
        putloc=getloc=0;
        q = new char[a.length +1];

        for (int i = 0; i < a.length ; i++) {
            put(a[i]);
        }
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println("\nThe queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.print("\nThe queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
