package Practice.Ex5;
import java.util.Scanner;

// Создаем собственное исключение для некорректного ввода числа
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class MinMAx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое число:");
            int number1 = readInt(scanner);

            System.out.println("Введите второе число:");
            int number2 = readInt(scanner);

            System.out.println("Введите третье число:");
            int number3 = readInt(scanner);

            // Вычисление среднего значения как дробного числа
            double avg = (double) (number1 + number2 + number3) / 3;
            int max = Math.max(Math.max(number1, number2), number3);
            int min = Math.min(Math.min(number1, number2), number3);

            boolean exit = false;

            while (!exit) {
                System.out.println("Выберите функцию:");
                System.out.println("1. Максимальное число");
                System.out.println("2. Минимальное число");
                System.out.println("3. Среднее арифметическое");
                System.out.println("4. Выйти из программы");

                int choice = readInt(scanner);

                switch (choice) {
                    case 1:
                        System.out.println("Максимальное число: " + max);
                        break;
                    case 2:
                        System.out.println("Минимальное число: " + min);
                        break;
                    case 3:
                        System.out.println("Среднее арифметическое: " + avg);
                        break;
                    case 4:
                        exit = true; // Устанавливаем флаг для выхода из цикла
                        System.out.println("Программа завершена.");
                        break;
                    default:
                        System.out.println("Неправильный выбор. Попробуйте снова.");
                        break;
                }
            }
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close(); // Закрываем Scanner в блоке finally
        }
    }

    private static int readInt(Scanner scanner) throws InvalidNumberException {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            // Очищаем буфер ввода
            scanner.next();
            throw new InvalidNumberException("Введено некорректное значение. Введите целое число.");
        }
    }
}

