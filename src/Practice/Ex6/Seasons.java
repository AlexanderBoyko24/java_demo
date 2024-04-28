package Practice.Ex6;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();

        // Проверяем корректность введенного месяца
        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Ошибка: Введено значение не в диапазоне от 1 до 12.");
        }

        scanner.close(); // Закрываем Scanner
    }
}
