package Lesson16;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        Book a = new Book("smbd", "smbd", (short) 1000);
        Book b = new Book("Ivanho", "Scott", (short) 1987);
        Book c = new Book("Oliver Twist", "Dickens", (short) 1900);
        Book d = new Book("Holmes", "Doyle", (short) 1754);
        Book e = new Book("Bug", "Poe", (short) 1357);
        Book f = new Book("Luke", "lee", (short) 1856);
        Book g = new Book("Batman", "Miller", (short) 1964);

        System.out.println("a.compateTo b:" + a.compareTo(b));

        List<Book> list = Arrays.asList(a, b, c, d, e, f);

        library.add(b);
        library.add(b);
        library.add(c);
        System.out.println(library.get(0));
        System.out.println(library.size());
        library.remove(0);
        System.out.println(library.size());
        library.remove(c);
        System.out.println(library.size());
        System.out.println(library.contains(c));
        System.out.println(library.contains(b));
        System.out.println("Add all: ");
        System.out.println(library.containsAll((list)));
        library.addAll(list);
        library.addAll(4, list);
        System.out.println(library.containsAll((list)));

        System.out.println("\nOur library: ");
        System.out.println(library);
        for (Book item : library) {
            System.out.println(item);
        }

        Iterator<Book> it = library.iterator();

//        while (it.hasNext()){
//            Book i = it.next();
//            if (i.getYearOfPublication() < 1890) it.remove();
//        }

//        for (int i =0; i<library.size(); i++){
//            library.get(i);
//        }
//
//
//       library.removeIf(n -> (n.getYearOfPublication() <1890));
        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);

    library.sort(nameComparator);

        Collections.sort(library);


        System.out.println("\nOSorted library: ");
        for (Book item : library) {
            System.out.println(item);
        }


    }
}
