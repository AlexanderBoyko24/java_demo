package Lesson11;

import Lesson12.bookpack.Book;
import Lesson6.ArrayUtils;

public class AbstractDemo {
    public static void main (String [] args){
        Triangle one = new Triangle();

        TwoDimensionShape[] shapes = new TwoDimensionShape[4];

        shapes[0] = new Triangle("contour", 8.0,12.0);
        shapes[1] = new Rectangle(10.0,12.0);
        shapes[2] = new Rectangle(4);
        shapes[3] = new Triangle(7.0);

        ArrayUtils.printArray(shapes);

        ErrorMessage err = new ErrorMessage();

        System.out.println(err.getErrorMessage(err.DISKERR));
        System.out.println(err.getErrorMessage(ErrorMessage.OUTERR));
        System.out.println(err.getErrorMessage(err.INERR));

        System.out.println(Integer.BYTES);

        Book[] books = new Book[5];

        books[0] = new Book("Java", "Shildt", 2014 );
        books[1] = new Book("Java2", "Shildt", 2014);
        books[2] = new Book("Golden bug", "Poe", 1890);
        books[3] = new Book("The art of Java", "Shildt", 2003);
        books[4] = new Book("On the road", "Kerouac", 1955);

        for (Book book: books) {
            book.show();
        }
    }
}
