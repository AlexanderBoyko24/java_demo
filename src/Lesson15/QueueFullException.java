package Lesson15;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int s){
        size = s;
    }

    @Override
    public String toString() {
        return "\nThe queue is full. Maximum queue size is "
                + size ;
    }
}
