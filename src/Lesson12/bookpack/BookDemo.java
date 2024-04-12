package Lesson12.bookpack;

public class BookDemo {
    public static void main (String [] args){
        Book[] books = new Book[5];

        books[0] = new Book("Java", "Shildt", 2014 );
        books[1] = new Book("Java2", "Shildt", 2014);
        books[2] = new Book("Golden bug", "Poe", 1890);
        books[3] = new Book("The art of Java", "Shildt", 2003);
        books[4] = new Book("On the road", "Kerouac", 1955);

        for (Book book: books){
            book.show();

        }
    }
}
