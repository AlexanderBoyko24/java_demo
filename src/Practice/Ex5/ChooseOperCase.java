package Practice.Ex5;

import java.util.Scanner;

public class ChooseOperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();

        int summ = number1 + number2 + number3;
        int multiplication = number1 * number2 * number3;

        System.out.println("Выберите функцию и нажмите Enter:");
        System.out.println("1. Сумма");
        System.out.println("2. Произведение");

        int choice = scanner.nextInt(); // Читаем выбор пользователя как целое число

        switch (choice) {
            case 1:
                System.out.println("Сумма: " + summ);
                break;
            case 2:
                System.out.println("Произведение: " + multiplication);
                break;
            default:
                System.out.println("Неправильный выбор");
                break;
        }

        scanner.close(); // Закрываем Scanner
    }
}
