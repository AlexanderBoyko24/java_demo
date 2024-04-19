package Exercises9.bookpacknext;
import Exercises9.bookpack.*;

public class UseBook {
    public static void main (String [] args){
        Book books[] = new Book[5];  // Book указывается имя пакета bookpack//перед именем класса

        books[0] = new Book("Lee", "Poe", 1898);
        books[1] = new Book("Java", "Shildt", 2014);
        books[2] = new Book("Java", "shildt", 2014);
        books[3] = new Book("The art of Java", "Holmes", 2003);
        books[4] = new Book("On he Road", "kerouac", 1955);

        for (int i=0; i< books.length; i++) books[i].show();

    }
}
