package Exercises9.bookpack;

public class Book { //Класс Book и ero чnеиы доnжны быть объявлены открытыми,
                    // чтобы их можно быnо нсnоnьзовать в друrих nакетах
    protected String title;
    protected String author;
    protected int pubDate;

     public Book(String t, String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo{
    public static void main (String [] args){
        Book books[] = new Book[5];

        books[0] = new Book("Lee", "Poe", 1898);
        books[1] = new Book("Java", "Shildt", 2014);
        books[2] = new Book("Java", "shildt", 2014);
        books[3] = new Book("The art of Java", "Holmes", 2003);
        books[4] = new Book("On he Road", "kerouac", 1955);

        for (int i=0; i< books.length; i++) books[i].show();


    }
}
