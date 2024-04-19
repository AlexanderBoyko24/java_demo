package Exercises9.bookpacknext;

import Exercises9.bookpack.Book;

public class Protectdemo {
    public static void main (String [] args){
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Lee", "Poe", 1898, "Putnam");
        books[1] = new ExtBook("Java", "Shildt", 2014, "Drofa");
        books[2] = new ExtBook("Java", "shildt", 2014, "Osborne");
        books[3] = new ExtBook("The art of Java", "Holmes", 2003, "Viking");
        books[4] = new ExtBook("On he Road", "kerouac", 1955, "Hill");

        for (int i=0; i< books.length; i++) books[i].show();

        // Поиск книг по автору
        System.out.println("showing all books by Shildt.");
        for (int i=0; i< books.length; i++)
            if (books[i].getAuthor()=="Shildt")
                System.out.println(books[i].getTitle());

        //books[O].title = "test title"; // Ошибка: доступ запрещен!
        //доступ к защищенным полям класса Book  возможен только из его подклассов
    }
}
