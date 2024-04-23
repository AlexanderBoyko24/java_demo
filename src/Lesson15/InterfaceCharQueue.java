package Lesson15;

public interface InterfaceCharQueue {
    void put(char ch) throws QueueFullException, Exercises9.Queue.QueueFullException;
    char get() throws QueuelEmptyException;
}
