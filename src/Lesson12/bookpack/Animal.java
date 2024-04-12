package Lesson12.bookpack;

public class Animal implements Swimable {
    int size;
    String color;
    int weight;

    @Override
    public void swim() {
        System.out.println(" swim swim swim");
    }
}
