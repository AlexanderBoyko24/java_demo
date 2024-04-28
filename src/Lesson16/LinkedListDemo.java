package Lesson16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Book> library = new LinkedList<>();
        LimitedLinkedList<Book> limitedlibrary = new LimitedLinkedList<>(8);

        Book a = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856);
        Book g = new Book("Batman", "Miller", (short) 1964);

        List<Book> list = Arrays.asList(g, a, b, c, d, e,g, f);
        library.addAll(list);
        limitedlibrary.addAll(list);

        Iterator<Book> it = library.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        library.removeFirstOccurrence(g);
        library.removeLastOccurrence(g);
        library.removeFirst();
        library.removeLast();

        System.out.println("\nAfter removal");

      for (Book item : library){
          System.out.println(item);
      }

        System.out.println(limitedlibrary.offerFirst(a));
        System.out.println(limitedlibrary);
    }
}
