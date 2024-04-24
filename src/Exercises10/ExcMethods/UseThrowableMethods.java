package Exercises10.ExcMethods;

public class UseThrowableMethods {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // перехватить исключение
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}
