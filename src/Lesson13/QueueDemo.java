package Lesson13;

public class QueueDemo {
    public static void main(String[] args) {
        Queue3 bigQ = new Queue3(100);
        Queue3 smallQ = new Queue3(4);
        char ch;
        int i;

        System.out.println("using bigQ to store alphabet values: ");
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("using smallQ to store alphabet values: ");
        for (i = 0; i < 5; i++) {
            smallQ.put((char) ('A' + i));
        }

        Queue3 clonedQ = new Queue3(smallQ);

        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

        System.out.println("\n");
        System.out.println("show cloned smallQ");
        for (i = 0; i < 5; i++) {
            ch = clonedQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println();

    }
}

