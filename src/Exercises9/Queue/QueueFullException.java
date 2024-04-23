package Exercises9.Queue;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) {
        size = s;
    }

    @Override
    public String toString() {
        return "\nThe queue is full. Maximum queue size is " + size;
    }
}
