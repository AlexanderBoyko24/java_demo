package Practice.Collections.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx2 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("REPLACE ME");
        items.add("Another item");

        ListIterator<String> listIterator = items.listIterator();
        while (listIterator.hasNext()) {
            String nextWithIndex = items.get(listIterator.nextIndex());
            String next = listIterator.next();
            if ("REPLACE ME".equals(next)) {
                listIterator.set("REPLACED");
            }
        }
        listIterator.add("NEW");
        while (listIterator.hasPrevious()) {
            String previousWithIndex = items.get(listIterator.previousIndex());
            String previous = listIterator.previous();
            System.out.println(previous);
        }
    }
}
