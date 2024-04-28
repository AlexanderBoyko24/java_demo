package Practice.Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main (String [] args){
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Обучающимся");
        list.add("На");
        list.add("JavaRush");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
