package Lesson13;

public class Queue3 {

    private char[] q;
    private int putloc, getloc;

    Queue3(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    Queue3(Queue3 obj){
        putloc = obj.putloc;
        getloc = obj.getloc;
        q = new char[obj.q.length];

        for (int i = getloc + 1; i <= putloc; i++){
         q[i] = obj.q[i];
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
            System.out.println("\nThe queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
