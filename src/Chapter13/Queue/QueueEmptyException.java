package Chapter13.Queue;

// Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty";
    }
}

