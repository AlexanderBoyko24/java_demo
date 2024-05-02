package Chapter13.Queue;

//Демонстрация обобщенного класса очереди.
public class GenQDemo {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {

// Создать очередь для хранения целых чисел
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demo of queue of numbers` type of Integer");
        for (int i = 0; i < 5; i++) {
            System.out.println("Add " + i + "to queue q");
            try {
                q.put(i); // добавить целочисленное значение в очередь q
            } catch (Exercises10.HW9.QueueFullException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Getting a new number of type Integer from queue q: ");
            try {
                iVal = q.get();
            } catch (Exercises10.HW9.QueueEmptyException e) {
                throw new RuntimeException(e);
            }
            System.out.println(iVal);
        }
        System.out.println();

        // Создать очередь для хранения чисел с плавающей точкой
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("demo of queue of numbers` type Double");
        for (int i = 0; i < 5; i++) {
            System.out.println("Add " + (double) i / 2 + "in queue q2");
            try {
                q2.put((double) i / 2); // ввести значение типа douЫe в очередь q2
            } catch (Exercises10.HW9.QueueFullException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Getting next number of type Double from queue q2:");

            try {
                dVal = q2.get();
            } catch (Exercises10.HW9.QueueEmptyException e) {
                throw new RuntimeException(e);
            }
            System.out.println(dVal);
        }
    }
}
