package Practice.Collections.Iterator;
/*Интерфейс ListIterator расширяет интерфейс Iterator и определяет ряд дополнительных методов:

void add(E obj): вставляет объект obj перед элементом, который должен быть возвращен следующим вызовом next()

boolean hasNext(): возвращает true, если в коллекции имеется следующий элемент, иначе возвращает false

boolean hasPrevious(): возвращает true, если в коллекции имеется предыдущий элемент, иначе возвращает false

E next(): возвращает текущий элемент и переходит к следующему, если такого нет, то генерируется исключение NoSuchElementException

E previous(): возвращает текущий элемент и переходит к предыдущему, если такого нет, то генерируется исключение NoSuchElementException

int nextIndex(): возвращает индекс следующего элемента. Если такого нет, то возвращается размер списка

int previousIndex(): возвращает индекс предыдущего элемента. Если такого нет, то возвращается число -1

void remove(): удаляет текущий элемент из списка. Таким образом, этот метод должен быть вызван после методов next() или previous(), иначе будет сгенерировано исключение IlligalStateException

void set(E obj): присваивает текущему элементу, выбранному вызовом методов next() или previous(), ссылку на объект obj */


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasNext()){

            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while(listIter.hasPrevious()){

            System.out.println(listIter.previous());
        }
    }
}


