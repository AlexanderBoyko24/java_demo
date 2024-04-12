package Lesson12.bookpack;

public class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String t, String a, int y){
        title = t;
        author = a;
        year = y;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        System.out.println();
    }
}
