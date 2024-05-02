package Lesson16;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Book> librarySet = new HashSet<>();
        List<Book> librarylist = new ArrayList<>();

        Book a = new Book("smbd", "smbd", (short) 1000);
        Book a1 = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856, Book.Genre.CLASSIC);


        List<Book> list = Arrays.asList(a, a1, b, b, c, d, e);

        librarySet.addAll(list);
        librarylist.addAll(list);

        System.out.println("\nLibrarySet");
        for (Book myBook : librarySet) {
            System.out.println(myBook);
        }

        System.out.println("\nLibraryList");
        for (Book myBook : librarylist) {
            System.out.println(myBook);
        }
    }
}