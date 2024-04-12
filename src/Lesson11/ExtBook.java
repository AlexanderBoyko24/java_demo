package Lesson11;

import Lesson12.bookpack.Book;

public class ExtBook  extends Book {
    public ExtBook(String t, String a, int y){
        super(t,a,y);
        System.out.println(super.title);
    }
}
