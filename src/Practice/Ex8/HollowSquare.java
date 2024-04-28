package Practice.Ex8;

import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Введите размер стороны квадрата: ");
        number = scanner.nextInt();

        // Вывод верхней границы квадрата
        for (int i = 1; i <= number; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Переход на новую строку после вывода верхней границы

        // Вывод боковых границ квадрата
        for (int i = 2; i < number; i++) {
            System.out.print("* "); // Левая граница
            for (int j = 2; j < number; j++) {
                System.out.print("  "); // Пробелы внутри квадрата
            }
            System.out.println("*"); // Правая граница
        }

        // Вывод нижней границы квадрата
        for (int i = 1; i <= number; i++) {
            System.out.print("* ");
        }
    }
}
