package Lesson16;

import jdk.management.jfr.FlightRecorderMXBean;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        Book a = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856, Book.Genre.CLASSIC);

        List<Book> list = Arrays.asList(b, b, c, d, e);

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);

        SortedSet<Book> library = new TreeSet<>(nameComparator);
        library.addAll(list);

        Iterator<Book> it = library.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

