package Exercises10.HW9;
// Исключение, указывающее на исчерпание очереди
public class QueueEmptyException extends Exception{

    public String toString(){
        return "\nОчередь пуста";
    }
}
