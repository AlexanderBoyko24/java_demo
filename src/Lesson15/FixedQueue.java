package Lesson15;

public class FixedQueue implements InterfaceCharQueue {
    private char[] q;
    private int putloc, getloc;

    FixedQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    FixedQueue(FixedQueue obj) {
        putloc = obj.putloc;
        getloc = obj.getloc;
        q = new char[obj.q.length];

        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = obj.q[i];
        }
    }

    FixedQueue(char[] a) {
        putloc = getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            try {
                put(a[i]);
            } catch (QueueFullException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length - 1) {
           throw new QueueFullException(q.length -1);
        }
        putloc++;
        q[putloc] = ch;
    }

    public char get() throws QueuelEmptyException {
        if (getloc == putloc) {
            throw new QueuelEmptyException();
        }
        getloc++;
        return q[getloc];
    }

}


